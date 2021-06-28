package br.edu.fatec.model;

import lombok.Getter;

@Getter
public enum Periodicidade {
	
	M("M", "Matutino"),
	T("T", "Vespertino"),
	N("N", "Noturno");
	
	private String sigla;
	private String descricao;
	
	Periodicidade(String sigla, String descricao) {
		this.sigla = sigla;
		this.descricao = descricao;
	}

}
