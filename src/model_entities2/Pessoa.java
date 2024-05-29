package model_entities2;

public  abstract class Pessoa {
	
	private String name;
	private int    cpf;
	private int    idade;
	
	
	
	public Pessoa(String name, int cpf, int idade) {
		this.name = name;
		this.cpf = cpf;
		this.idade = idade;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getCpf() {
		return cpf;
	}



	public void setCpf(int cpf) {
		this.cpf = cpf;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	public void fazerAnivesario() {
       this.idade += 1;
	}

}
