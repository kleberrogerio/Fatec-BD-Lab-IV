package br.edu.fatec.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_pro_professor_usuario")
	private Usuario usuario;
	
	@OneToMany(mappedBy = "professor")
	private List<Disciplina> disciplina;
	
	
}
