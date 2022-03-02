package entidadesDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidades.Aluno;
import util.Conexao;

public class AlunoDao implements InterfaceDao<Aluno>{

	@Override
	public boolean inserir(Aluno aluno) {
		String sql = "insert into aluno(nomaluno, nommae, nompai, datanasc, medaluno, sitaluno) values(?,?,?,?,?,?)";
		Connection con = Conexao.conectar();
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, aluno.getNomeAluno());
			stm.setString(2, aluno.getNomeMae());
			stm.setString(3, aluno.getNomePai());
			stm.setDate(4, aluno.getDataNasc());
			stm.setDouble(5, aluno.getMediaAluno());
			stm.setString(6, aluno.getSitaluno());
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
	public boolean alterar(Aluno aluno) {
		String sql = "update aluno (nomaluno, nommae, nompai, datanasc, medaluno, sitaluno) values(?,?,?,?,?,?)";
		sql += " where codaluno = ?";
		Connection con = Conexao.conectar();

		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, aluno.getNomeAluno());
			stm.setString(2, aluno.getNomeMae());
			stm.setString(3, aluno.getNomePai());
			stm.setDate(4, aluno.getDataNasc());
			stm.setDouble(5, aluno.getMediaAluno());
			stm.setString(6, aluno.getSitaluno());
			stm.setInt(7, aluno.getIdAluno());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean excluir(int codAluno) {
		String sql = "delete from aluno where id = " + codAluno;
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			stm.execute();
		} catch (Exception e) {
			System.out.println("houve erro " + e);
		}
		return true;		
	}

	@Override
	public Aluno pesquisarUm(int id) {
		String sql = "select * from aluno where codaluno = " + id;
		Aluno aluno = null;

		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			if (rs.next()) {
				aluno = new Aluno(rs.getString("nomaluno"), rs.getString("nommae"), rs.getString("nompai"),
						rs.getDate("datanasc"), rs.getDouble("medaluno"), rs.getString("sitaluno"));
			}
		} catch (SQLException e) {
			System.out.println("Erro ao salvar");
			e.printStackTrace();
		}
		return aluno;
	}

	@Override
	public List<Aluno> pesquisar() {
		List<Aluno> aluno = new ArrayList<>();
		String sql = "select * from aluno";
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				aluno.add(new Aluno(rs.getString("nomaluno"), rs.getString("nommae"), rs.getString("nompai"),
						rs.getDate("datanasc"), rs.getDouble("medaluno"), rs.getString("sitaluno")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return aluno;
	}

}
