package project.study.executavel;

import project.study.classes.Aluno;

public class Base {
		public static void main(String[] args) {
			
				/* Aluno() = inst�ncia de um objeto no java // aluno = � a vari�vel que faz refer�ncia ao Aluno() */
				Aluno aluno = new Aluno();
				aluno.setNomeAluno("Fulano");;
				aluno.setIdadeAluno(19);;
				
				System.out.println(aluno.getNomeAluno());
				System.out.println(aluno.getIdadeAluno());
		}
}
