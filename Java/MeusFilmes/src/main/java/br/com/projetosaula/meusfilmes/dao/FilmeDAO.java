package br.com.projetosaula.meusfilmes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import br.com.projetosaula.meusfilmes.beans.Filme;
import br.com.projetosaula.meusfilmes.cnn.ConnectionFactory;

public class FilmeDAO {
	private static final String SQL_LIST_FLIMES = "select * from filme";

	public FilmeDAO() {
	}
	
	public List<Filme> getListFilmes(){
		
		List<Filme> listaFilmes = new ArrayList<>();
		
		try {
			Connection cnn = ConnectionFactory.getMySQLConnection();
			PreparedStatement pStm = cnn.prepareStatement(SQL_LIST_FLIMES);
			ResultSet rs = pStm.executeQuery();
			while (rs.next()) {
				listaFilmes.add(new Filme(rs.getInt("id"), rs.getString("titulo"), rs.getString("genero"),
						rs.getInt("restricao"), (rs.getBoolean("favorito"))));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaFilmes;
	}
	
	

}
