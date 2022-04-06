package br.com.projetosaula.primeiroprojetospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetosaula.primeiroprojetospring.entities.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long>{
	
}
