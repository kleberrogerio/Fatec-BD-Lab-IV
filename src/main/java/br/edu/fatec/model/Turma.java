package br.edu.fatec.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@Entity
@Table(name = "tur_turma")
public class Turma {
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tur_id")
	private Long id;
	
	@Column(name = "tur_descricao")
	private String descricao;
	
	@OneToMany(mappedBy = "turma")
	private List<Disciplina> disciplina;
	
	@OneToMany(mappedBy = "turma")
	private List<Aluno> aluno;
	
}
