package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	//Metodo para retornar um conexao ao BD.+
		public static Connection getConexao() {
			
			 Connection conexao = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
				//Criar strings de conexão
				String url = "jdbc:mysql://localhost/banco";
				String user = "root";
				String pass = "root";
				
				// Realizar conexão com o BD
				conexao = DriverManager.getConnection(url, user, pass);
		}  catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			return conexao;
		}

}
