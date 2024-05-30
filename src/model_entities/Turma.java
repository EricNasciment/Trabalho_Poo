package model_entities;

import java.util.ArrayList;
import java.util.List;

import model_entities2.Aluno;
import model_entities2.Professor;

public class Turma {
      
	private int codigo;
	private Disciplina disciplina;
	private Professor professor;
	
	List<Aluno> aluno = new  ArrayList<>();

	

	public Turma(int codigo, Disciplina disciplina, Professor professor) {
		super();
		this.codigo = codigo;
		this.disciplina = disciplina;
		this.professor = professor;
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Professor getProfessor() {
		return professor;
	}

			
	public void alunoAdd(String string, int cpf, int idade, int matricula) {
		aluno.add((Aluno) aluno);
	}
	
	public void alunoRemove() {
		aluno.remove((Aluno) aluno);
	}
	
	public String listarAluno(String name) {
		for(Aluno alun: aluno) {
			return alun.getName();
		}
		return name;
	}

	@Override
	public String toString() {
		return 
				"informações da turma: " + "\n"  +
				"codigo da turma: "      +  
		         codigo                  +  "\n" +
		         "---------" + "\n" +
		         
		         "Disciplina: " + 
	             disciplina.getName()    +  "\n" +
		         
	             "Codigo: "              +
	            disciplina.getCodigo()   +  "\n" +
	             "Semestre: "            +
	            disciplina.getSemestre() +  "\n" +
	            "---------" + "\n"  +
	            "Professor: "            +
	            professor.getName()      +  "\n" +
	            "Cpf: "                  +
	            professor.getCpf()       +  "\n" +
	            "Idade: "                +
	            professor.getIdade()     +  "\n" +
	            "Materia: "              + 
	            professor.getCentro()    +  "\n" +
	            "---------" + "\n" ;
		
		
	            
	             
	             
	}
	 
	
	
	
}
