package br.edu.fatec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "dis_disciplina")
public class Disciplina {
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dis_id")
	private Long id;
	
	@Column(name = "dis_nome")
	private String nome;
	
	@Column(name = "dis_cargahoraria")
	private Long cargaHoraria;
	
	@Column(name = "dis_ementa")
	private String ementa;
	
	@Column(name = "tur_id")
	private Long tur_id;
	
	@Column(name = "cur_id")
	private Long cur_id;
	
	@Column(name = "pro_id")
	private Long pro_id;
	
	@ManyToOne
	@JoinColumn(name = "fk_disciplina_curso1")
	private Curso curso;
	
	
	@ManyToOne
	@JoinColumn(name = "fk_disciplina_turma1")
	private Turma turma;
	
	@ManyToOne
	@JoinColumn(name = "fk_disciplina_pro_professor1")
	private Professor professor;
}


