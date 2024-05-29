package model_entities2;

public class Professor extends Pessoa {
	
	private  int centro;

	public Professor(String name, int cpf, int idade,int centro) {
		super(name, cpf, idade);
		this.centro = centro;
		// TODO Auto-generated constructor stub
	}

	public int getCentro() {
		return centro;
	}

	public void setCentro(int centro) {
		this.centro = centro;
	}

	
	public String darAula(String lecionar) {
		return "lecionando";
		
	}
	
}
