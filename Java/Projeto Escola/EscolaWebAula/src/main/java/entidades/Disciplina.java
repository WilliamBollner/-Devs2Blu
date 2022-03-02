package entidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.Conexao;

public class Disciplina {

	private int idDisciplina;
	private String nomeDisciplina;
	private String nomeProfessor;
	private int nrAvalicoes;

	public Disciplina() {

	}

	public Disciplina(int idDisciplina, String nomeDisciplina, String nomeProfessor, int nrAvalicoes) {
		this.idDisciplina = idDisciplina;
		this.nomeDisciplina = nomeDisciplina;
		this.nomeProfessor = nomeProfessor;
		this.nrAvalicoes = nrAvalicoes;
	}

	public int getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public int getNrAvalicoes() {
		return nrAvalicoes;
	}

	public void setNrAvalicoes(int nrAvalicoes) {
		this.nrAvalicoes = nrAvalicoes;
	}

	public boolean incluirDisciplina() {
		String sql = "insert into disciplina(nomdisciplina, nomprofessor, nravaliacoes) values(?,?,?)";
		Connection con = Conexao.conectar();

		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, getNomeDisciplina());
			stm.setString(2, getNomeProfessor());
			stm.setInt(3, getNrAvalicoes());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return true;
	}

	public void alterarDisciplina() {
		String sql = "update disciplina(nomdisciplina, nomprofessor, nravaliacoes) values(?,?,?)";
		sql += " where id = ?";
		Connection con = Conexao.conectar();

		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, getNomeDisciplina());
			stm.setString(2, getNomeProfessor());
			stm.setInt(3, getNrAvalicoes());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void excluirDisciplina() {
		// TODO implement here
	}

	public void consultarDisciplina() {
		// TODO implement here
	}

	public void listarDisiciplinas() {
		// TODO implement here
	}

}