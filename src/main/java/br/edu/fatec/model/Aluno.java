package br.edu.fatec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@Entity
@Table(name = "alu_aluno")
public class Aluno {
	
	@EqualsAndHashCode.Include
	@Id
	@Column(name = "usu_id")
	private Long id;
	
	@Column(name = "tur_id")
	private Long turma;

}
