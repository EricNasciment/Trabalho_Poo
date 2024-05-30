package model_entities;

import java.util.ArrayList;
import java.util.List;

import model.service.Aluno_Bolsita;
import model.service.Aluno_Regular;
import model_entities2.Aluno;
import model_entities2.Professor;

public class Turma {
      
	private int codigo;
	private Disciplina disciplina;
	private Professor professor;
	
	List<Aluno> alunos = new  ArrayList<>();

	

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

	public void alunoAdd(Aluno_Regular alunoregular) {
	    alunos.add(alunoregular);
	}

	public void alunoAdd(Aluno_Bolsita alunobolsista) {
	    alunos.add(alunobolsista);
	}
	
	public void alunoRemove() {
		alunos.remove( alunos);
	}
	
	public void listarAluno() {
		
		for(Aluno alun: alunos) {
		System.out.println("Name: " + alun.getName() +
				            ", Cpf: " + alun.getCpf()  +
				          ", Idade: " + alun.getIdade()+
				          ", Matricula: " + alun.getMatricula());
		
				
				
				
			
		}
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
