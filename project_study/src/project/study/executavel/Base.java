package project.study.executavel;

import project.study.classes.Aluno;

public class Base {
		public static void main(String[] args) {
			
				/* Aluno() = instância de um objeto no java // aluno = é a variável que faz referência ao Aluno() */
				Aluno aluno = new Aluno();
				aluno.nomeAluno = "Mark";
				aluno.idadeAluno = 22;
				
				System.out.println(aluno.nomeAluno);
				System.out.println(aluno.idadeAluno);
		}
}
