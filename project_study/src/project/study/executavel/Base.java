package project.study.executavel;

import project.study.classes.Aluno;

public class Base {
		public static void main(String[] args) {
			
				/* Aluno() = instância de um objeto no java // aluno = é a variável que faz referência ao Aluno() */
				Aluno aluno = new Aluno();
				aluno.setNomeAluno("Fulano");;
				aluno.setIdadeAluno(19);;
				
				System.out.println(aluno.getNomeAluno());
				System.out.println(aluno.getIdadeAluno());
		}
}
