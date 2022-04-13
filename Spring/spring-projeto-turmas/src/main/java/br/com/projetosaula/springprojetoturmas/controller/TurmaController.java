package br.com.projetosaula.springprojetoturmas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetosaula.springprojetoturmas.entity.Turma;
import br.com.projetosaula.springprojetoturmas.repository.TurmaRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/turma")
public class TurmaController {
	
	@Autowired
	TurmaRepository turmaRepository;
	
	@GetMapping
	public List<Turma> getAll() {
		return turmaRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Turma> addTurma(@RequestBody Turma turma) {
		Turma turmaResponse = turmaRepository.save(turma);
		
		return new ResponseEntity<Turma>(turmaResponse, HttpStatus.CREATED);
	}

}
