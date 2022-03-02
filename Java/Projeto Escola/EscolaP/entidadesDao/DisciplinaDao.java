package entidadesDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidades.Disciplina;
import util.Conexao;

public class DisciplinaDao implements InterfaceDao<Disciplina>{

	@Override
	public boolean inserir(Disciplina t) {
		String sql = "insert into disciplina(nomdisciplina, nomprofessor, qtdavaliacoes) values(?,?,?)";
		Connection con = Conexao.conectar();

		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, t.getNomeDisciplina());
			stm.setString(2, t.getNomeProfessor());
			stm.setInt(3, t.getNrAvalicoes());
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

	@Override
	public boolean alterar(Disciplina t) {
		String sql = "update disicplina(nomdisciplina, nomprofessor, qtdavaliacoes) values(?,?,?)";
		sql += " where id = ?";
		Connection con = Conexao.conectar();

		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, t.getNomeDisciplina());
			stm.setString(2, t.getNomeProfessor());
			stm.setInt(3, t.getNrAvalicoes());
			stm.setInt(4, t.getIdDisciplina());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean excluir(int id) {
		String sql = "delete from disciplina where id = " + id;
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			stm.execute();
		} catch (Exception e) {
			System.out.println("houve erro " + e);
		}
		return true;
	}

	@Override
	public Disciplina pesquisarUm(int id) {
		String sql = "select * from carro where id = " + id;
		Disciplina disciplina = null;

		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			if (rs.next()) {
				disciplina = new Disciplina(rs.getInt("codaluno"), rs.getString("nomdisciplina"), rs.getString("nomprofessor"),
						rs.getInt("qtdavaliacoes"));
			}
		} catch (SQLException e) {
			System.out.println("Erro ao salvar");
			e.printStackTrace();
		}
		return disciplina;
	}

	@Override
	public List<Disciplina> pesquisar() {
		List<Disciplina> disciplina = new ArrayList<>();
		String sql = "select * from carro";
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				disciplina.add(new Disciplina(rs.getInt("codaluno"), rs.getString("nomdisciplina"), rs.getString("nomprofessor"),
						rs.getInt("qtdavaliacoes")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return disciplina;
	}

}
