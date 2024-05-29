package model.service;

import model_entities2.Aluno;

public class Aluno_Bolsita extends Aluno{

	public Aluno_Bolsita(String name, int cpf, int idade, int matricula) {
		super(name, cpf, idade, matricula);
		// TODO Auto-generated constructor stub
	}
	
	
	public double pagarMensalidade(double amount) {
		return amount -= amount *  0.2 ;
		
	}

}
