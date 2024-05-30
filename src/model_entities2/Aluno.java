package model_entities2;

public class Aluno extends Pessoa {

	private int matricula;
	
	public Aluno(String name, int cpf, int idade,int matricula) {
		super(name, cpf, idade);
		this.matricula = matricula;
		// TODO Auto-generated constructor stub
	}

    public void getMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
	
	
	
	public double pagarMensalidade( ) {
		return (Double) null;
		
		
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + "]";
	}
	
	
	

}
