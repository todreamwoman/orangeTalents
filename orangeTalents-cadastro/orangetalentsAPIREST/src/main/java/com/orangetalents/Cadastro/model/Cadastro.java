package com.orangetalents.Cadastro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;


@Entity
@Table(name="tb_cadastro")
public class Cadastro {
	
	//ATRIBUTOS
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="{campo.nome.obrigatorio}")
	private String nomeCadastro;
	
	@NotBlank(message="{campo.email.obrigatorio}")
	@Email
	private String emailCadastro;
	
	@NotBlank(message="{campo.cpf.obrigatorio}")
	@Size(min = 11, max = 11, message="CPF deve ter 11 numeros")
	@CPF(message="{campo.cpf.invalido}")
	private String cpf;
	
	
	private String nascimento;

	//METODOS GET E SET
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCadastro() {
		return nomeCadastro;
	}

	public void setNomeCadastro(String nomeCadastro) {
		this.nomeCadastro = nomeCadastro;
	}

	public String getEmailCadastro() {
		return emailCadastro;
	}

	public void setEmailCadastro(String emailCadastro) {
		this.emailCadastro = emailCadastro;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	
	
	
	
}
