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

import com.orangetalents.Cadastro.model.Vacina;
import com.orangetalents.Cadastro.repository.VacinaRepository;

@RestController
@RequestMapping("/api/vacinas")
@CrossOrigin("http://localhost:4200")
public class VacinaController {

	
	private final VacinaRepository repository;
	
	@Autowired
	private VacinaController(VacinaRepository repository) {
		this.repository = repository;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Vacina salvar(@RequestBody @Valid Vacina vacina) {
		return repository.save(vacina);
	}
	
	@GetMapping("{id}")
	public Vacina acharPorId(@PathVariable Long id) {
		return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
}
