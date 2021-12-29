package project.study.executavel;

import javax.swing.JOptionPane;

import project.study.classes.Aluno;

public class Base {
		public static void main(String[] args) {
			
				String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
				String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
				String disciplina1 = JOptionPane.showInputDialog("disciplina1: ");
				String nota1 = JOptionPane.showInputDialog("nota1: ");
				String disciplina2 = JOptionPane.showInputDialog("disciplina2: ");
				String nota2 = JOptionPane.showInputDialog("nota2: ");
				String disciplina3 = JOptionPane.showInputDialog("disciplina3: ");
				String nota3 = JOptionPane.showInputDialog("nota3: ");
				String disciplina4 = JOptionPane.showInputDialog("disciplina4: ");
				String nota4 = JOptionPane.showInputDialog("nota4: ");
			
				/* Aluno() = instância de um objeto no java // aluno = é a variável que faz referência ao Aluno() */
				Aluno aluno = new Aluno();
				aluno.setNomeAluno(nome);
				aluno.setIdadeAluno(Integer.valueOf(idade));
				
				
				
				
				
				System.out.println(aluno.toString());
				System.out.println("Média do aluno" + aluno.getMediaNota());
				System.out.println("Resultado: " + aluno.getAlunoStatus());
				
		}
}
