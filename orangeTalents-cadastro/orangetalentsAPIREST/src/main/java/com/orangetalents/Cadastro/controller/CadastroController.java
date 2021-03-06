package com.orangetalents.Cadastro.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.orangetalents.Cadastro.model.Cadastro;
import com.orangetalents.Cadastro.repository.CadastroRepository;

@RestController
@RequestMapping("/api/cadastros")
@CrossOrigin("http://localhost:4200")
public class CadastroController {
	
	//injeta o repository e o service
	private final CadastroRepository repository;
	
	@Autowired
	public CadastroController(CadastroRepository repository) {
		this.repository = repository;
	}
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cadastro salvar(@RequestBody @Valid Cadastro cadastro) {
		return repository.save(cadastro);
	}
	
	@GetMapping("{id}")
	public Cadastro acharPorId(@PathVariable Long id) {
		return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
}
