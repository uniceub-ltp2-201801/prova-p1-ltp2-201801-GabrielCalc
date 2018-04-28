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

import DAO.professorDAO;
import Model.Professor;



/**
 * Servlet implementation class ServletListar
 */
@WebServlet("/ServletListar")
public class ServletListar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletListar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conexao = DAO.Conexao.getConexao();
		
		professorDAO professor = new professorDAO(conexao);
		ArrayList<Professor> p = professor.listarProfessores();
		request.setAttribute("listarProfessores", p);
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		
		
		rd.forward(request, response);
	}


}
