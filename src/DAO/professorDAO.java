package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import Model.Professor;

public class professorDAO {
	private Connection conexao;

	public professorDAO(Connection conexao) {
	this.conexao = conexao;
	}
	
	public ArrayList<Professor> listarProfessores(){
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<Professor> resultado = new ArrayList<Professor>();
		try {
			//Prepara o sql
			ps = conexao.prepareStatement("SELECT * FROM faculdade.professor");
			//setar os parametro sql
			
			//executar o SQL
			rs = ps.executeQuery();
			while(rs.next()) {
				resultado.add(new Professor(rs.getInt("idProfessor"), rs.getString("nome"), rs.getDate("datanasc"),  rs.getString("nomemae"), rs.getInt("titulacao")));	
			}
			
			rs.close();
			ps.close();		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resultado;
		
		
		
		
	

	}


}
