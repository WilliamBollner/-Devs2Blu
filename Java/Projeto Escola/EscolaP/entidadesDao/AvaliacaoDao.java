package entidadesDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidades.Avaliacao;
import util.Conexao;

public class AvaliacaoDao implements InterfaceDao<Avaliacao>{

	@Override
	public boolean inserir(Avaliacao t) {
		String sql = "insert into avaliacao(nravalicao, vlrNota) values(?,?)";
		Connection con = Conexao.conectar();

		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setInt(1, t.getNrAvaliacao());
			stm.setDouble(2, t.getVlrNota());
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
	public boolean alterar(Avaliacao t) {
		String sql = "update avaliacao avaliacao(nravalicao, vlrNota) values(?,?)";
		sql += " where id = ?";
		Connection con = Conexao.conectar();

		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setInt(1, t.getNrAvaliacao());
			stm.setDouble(2, t.getVlrNota());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean excluir(int codAvaliacao) {
		String sql = "delete from aluno where id = " + codAvaliacao;
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			stm.execute();
		} catch (Exception e) {
			System.out.println("houve erro " + e);
		}
		return true;
	}

	@Override
	public Avaliacao pesquisarUm(int id) {
		String sql = "select * from carro where id = " + id;
		Avaliacao avaliacao = null;

		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			if (rs.next()) {
				avaliacao = new Avaliacao(rs.getInt("codaluno"), rs.getInt("coddisciplina"), rs.getInt("nravalicao"), rs.getDouble("valor")); 
			}
		} catch (SQLException e) {
			System.out.println("Erro ao salvar");
			e.printStackTrace();
		}
		return avaliacao;
	}
	

	@Override
	public List<Avaliacao> pesquisar() {
		List<Avaliacao> avaliacoes = new ArrayList<>();
		String sql = "select * from carro";
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				avaliacoes.add(new Avaliacao(rs.getInt("codaluno"), rs.getInt("coddisciplina"), rs.getInt("nravalicao"), rs.getDouble("valor"))); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return avaliacoes;
	}

}
