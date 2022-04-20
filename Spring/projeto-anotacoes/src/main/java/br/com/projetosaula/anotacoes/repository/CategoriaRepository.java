package br.com.projetosaula.anotacoes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetosaula.anotacoes.data.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
	
	public List<Categoria> findByDescricaoContaining(String descricao);

}
