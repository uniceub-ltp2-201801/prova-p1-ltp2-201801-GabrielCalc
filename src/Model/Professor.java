package Model;

import java.util.Date;

public class Professor {
	
	private int idProfessor;
	private String nome;
	private Date dataNasc;
	private String nomeMae;
	private int titulacao;
	
	public Professor(int idProfessor, String nome, Date dataNasc, String nomeMae, int titulacao) {
		super();
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.nomeMae = nomeMae;
		this.titulacao = titulacao;
		this.idProfessor = idProfessor;
	}
	
	public int getIdProfessor() {
		return idProfessor;
	}
	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public int getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(int titulacao) {
		this.titulacao = titulacao;
	}
	
	
	

}
