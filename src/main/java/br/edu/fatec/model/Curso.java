package br.edu.fatec.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name = "cur_curso")
public class Curso {
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cur_id")
	private Long id;
	
	@Column(name = "cur_nome")
	private String nome;
	
	@Column(name = "cur_periodicidade")
	@Enumerated(EnumType.STRING)
	private Periodicidade periodicidade;
	
	@Column(name = "cur_descricao")
	private String descricao;
	
	@OneToMany(mappedBy = "curso")
	private List<Disciplina> disciplina;
	
}
