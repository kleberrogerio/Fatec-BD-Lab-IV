package br.edu.fatec.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@Entity
@Table(name = "pro_professor")
public class Professor {
	
	@EqualsAndHashCode.Include
	@Id
	@Column(name = "pro_id")
	private Long id;
	
	@Column(name = "pro_titulacao")
	private String titulacao;
	
	
}
