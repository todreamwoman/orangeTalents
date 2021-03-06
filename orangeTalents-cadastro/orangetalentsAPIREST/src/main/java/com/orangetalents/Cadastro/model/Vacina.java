package com.orangetalents.Cadastro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;


//TABELA
@Entity
@Table(name="tb_vacina")
public class Vacina {
	
	//ATRIBUTOS
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="{campo.nome.obrigatorio}")
	private String nome_vacina;
	
	@NotBlank(message="{campo.email.obrigatorio}")
	@Email
	private String email_vacina;
	
	
	private String data_vacina_aplicada;

	//METODOS GET E SET
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public String getNome_vacina() {
		return nome_vacina;
	}

	public void setNome_vacina(String nome_vacina) {
		this.nome_vacina = nome_vacina;
	}

	public String getEmail_vacina() {
		return email_vacina;
	}

	public void setEmail_vacina(String email_vacina) {
		this.email_vacina = email_vacina;
	}

	public String getData_vacina_aplicada() {
		return data_vacina_aplicada;
	}

	public void setData_vacina_aplicada(String data_vacina_aplicada) {
		this.data_vacina_aplicada = data_vacina_aplicada;
	}

	


	
}
