package br.com.projetosaula.primeiroprojetospring.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetosaula.primeiroprojetospring.entities.Filme;
import br.com.projetosaula.primeiroprojetospring.repository.FilmeRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/filmes")
public class FilmeController {
	
	@Autowired
	FilmeRepository filmeRepository;
	

	public FilmeController() {
	}
	
	@GetMapping
	public List<Filme> getList(){
		
		return filmeRepository.findAll();
		
	}
	
	@GetMapping("/{id}")
	public Filme getFilmeById(@PathVariable("id") Long id) throws Exception {
		Filme filme =  filmeRepository.findById(id)
				.orElseThrow(() -> new Exception("Filme não encontrado com o id= " + id));
		return filme;	
	}
	
	
	@PostMapping()
	public boolean saveFilme(@RequestBody Filme filme) throws Exception{
		if(filme == null) {
			return false;
		}
		
		filmeRepository.save(filme);
		return true;
	}

}
