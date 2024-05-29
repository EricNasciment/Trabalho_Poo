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

	public Turma(int codigo, Disciplina disciplina, Professor professor, List<Aluno> aluno) {

		this.codigo = codigo;
		this.disciplina = disciplina;
		this.professor = professor;
		this.aluno = aluno;
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

			
	public void alunoAdd() {
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
	
}
