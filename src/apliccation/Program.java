package apliccation;

import java.util.Scanner;

import model.service.Aluno_Bolsita;
import model.service.Aluno_Regular;
import model_entities.Disciplina;
import model_entities.Turma;
import model_entities2.Professor;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	Scanner sc = new Scanner(System.in);	
	
	try {
	Turma  turma = new Turma(2500, 
			       new Disciplina("matematica",3500, 4),
	               new Professor("Eduardo",44522, 25 ,"matematica"));
	
	Aluno_Regular alunoregular = new Aluno_Regular("Paulo Roberto", 85224, 16, 6542);
	Aluno_Regular alunoregular1 = new Aluno_Regular("Eric Silva", 85224, 16, 6542);
	Aluno_Bolsita alunobolsista = new Aluno_Bolsita("Paulo Roberto", 85224, 16, 6542);
	
	
  turma.alunoAdd(alunoregular);
  turma.alunoAdd(alunoregular1);
  turma.alunoAdd(alunobolsista);
  
  
  
	System.out.println(turma);
	
	System.out.println("Alunos da turma: ");
	turma.listarAluno();
	
	
	}
	catch( ClassCastException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
		
	
	 
	sc.close();	
	}
 
}
