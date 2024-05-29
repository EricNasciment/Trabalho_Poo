package model_entities;

public class Disciplina {
	
	private String name;
	private int codigo;	
	private int semestre;
	
	
	
	public Disciplina(String name, int codigo, int semestre) {
		
		this.name = name;
		this.codigo = codigo;
		this.semestre = semestre;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public int getSemestre() {
		return semestre;
	}



	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	
	

}
