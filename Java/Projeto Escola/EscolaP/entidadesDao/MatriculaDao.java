package entidadesDao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import entidades.Matricula;
import util.Conexao;

public class MatriculaDao implements InterfaceDao<Matricula>{

	@Override
	public boolean inserir(Matricula t) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String sql = "insert into matricula(dtmatricula, statusmatricula) values(?,?)";
		Connection con = Conexao.conectar();

		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setDate(1, t.getDtMatricula());
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
	public boolean alterar(Matricula t) {
		String sql = "update  matricula(dtmatricula, statusmatricula) values(?,?)";
		sql += " where id = ?";
		Connection con = Conexao.conectar();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean excluir(int id) {
		String sql = "delete from matricula where codaluno = " + id;
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			stm.execute();
		} catch (Exception e) {
			System.out.println("houve erro " + e);
		}
		return true;
	}

	@Override
	public Matricula pesquisarUm(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Matricula> pesquisar() {
		// TODO Auto-generated method stub
		return null;
	}

}
