package br.edu.fatec.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_alu_aluno_usuario")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "fk_alu_aluno_turma")
	private Turma turma;
	
}
