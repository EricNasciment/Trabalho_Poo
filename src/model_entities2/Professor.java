package model_entities2;

public class Professor extends Pessoa {
	
	private  String centro;

	public Professor(String name, int cpf, int idade,String centro) {
		super(name, cpf, idade);
		this.centro = centro;
		// TODO Auto-generated constructor stub
	}

	public String getCentro() {
		return centro;
	}

	public void setCentro(String centro) {
		this.centro = centro;
	}

	
	public String darAula(String lecionar) {
		return "lecionando";
		
	}
	
}
