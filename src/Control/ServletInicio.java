package Control;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.Conexao;
import DAO.professorDAO;
import Model.Professor;

/**
 * Servlet implementation class ServletInicio
 */
@WebServlet("/ServletInicio")
public class ServletInicio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletInicio() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int idprofessor = Integer.parseInt(request.getParameter("idprofessor"));
		String nome = request.getParameter("nome");
		String datanasc= request.getParameter("datanasc");
		String nomemae = request.getParameter("nomemae"); 
		int titulacao = Integer.parseInt(request.getParameter("titulacao"));

		Connection conexao = Conexao.getConexao();
		
		professorDAO pd = new professorDAO(conexao);
		
		ArrayList<Professor> p = pd.listarProfessores();
		
		request.setAttribute("idprofessor", idprofessor);
		request.setAttribute("nome", nome);
		request.setAttribute("datanasc", datanasc);
		request.setAttribute("nomemae", nomemae);
		request.setAttribute("titulacao", titulacao);

		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		
		rd.forward(request, response);


	}

}
