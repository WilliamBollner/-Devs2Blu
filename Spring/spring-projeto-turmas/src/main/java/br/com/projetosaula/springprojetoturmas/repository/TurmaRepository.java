package br.com.projetosaula.springprojetoturmas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetosaula.springprojetoturmas.entity.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Integer>{

}
