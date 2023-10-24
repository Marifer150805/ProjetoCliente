package com.projetojpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity 
@Table(name = "cliente")

public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	@NotNull
	@Column(name = "id")
	private long id;
	
	@NotNull
	@Column(name = "nome")
	private String nome;
	
	@NotNull
	@Column(name = "telefone")
	private String telefone;
	
	@NotNull
	@Column(name = "cpf")
	private String cpf;
	
	@NotNull
	@Column(name = "rg")
	private String rg;
	
	@NotNull
	@Column(name = "endereco")
	private String endereco;
	
}