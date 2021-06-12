package br.edu.fatec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private String periodicidade;
	
	@Column(name = "cur_descricao")
	private String descricao;
	
	

}
