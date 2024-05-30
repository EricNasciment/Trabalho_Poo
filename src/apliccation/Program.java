package apliccation;

import java.util.Scanner;

import model_entities.Disciplina;
import model_entities.Turma;
import model_entities2.Professor;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	Scanner sc = new Scanner(System.in);	
	
	
	Turma  turma = new Turma(2500, 
			       new Disciplina("matematica",3500, 4),
	               new Professor("Eduardo",44522, 25 ,"matematica")
	               );
	
	
	
	System.out.println(turma);
		
	
	 
		
	}

}
