package model.service;

import model_entities2.Aluno;

public class Aluno_Regular extends Aluno {

	public Aluno_Regular(String name, int cpf, int idade, int matricula) {
		super(name, cpf, idade, matricula);
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	public double pagarMensalidade(double amount) {
		return 200.00;
	}
}
