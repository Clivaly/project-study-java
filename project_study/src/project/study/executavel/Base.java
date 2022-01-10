package project.study.executavel;

import javax.swing.JOptionPane;

import project.study.classes.Aluno;
import project.study.classes.Disciplina;

public class Base {
		public static void main(String[] args) {
			
				String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
				String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
							
				/* Aluno() = instância de um objeto no java // aluno = é a variável que faz referência ao Aluno() */
				Aluno aluno = new Aluno();
				aluno.setNomeAluno(nome);
				aluno.setIdadeAluno(Integer.valueOf(idade));
				
				for (int pos = 1; pos <= 4; pos++) {
					String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos +" ?");
					String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos +" ?" );
					
					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina(nomeDisciplina);
					disciplina.setNota(Double.valueOf(notaDisciplina));
					
					aluno.getDisciplinas().add(disciplina);
				}
				
				int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
				
				if (escolha == 0) {
					
					int continuarRemover = 0;
					int posicao = 1;
					
					while(continuarRemover == 0) {
						String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou  4? ");
						aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);	
						posicao++;
						continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
					}
				}
				
				System.out.println(aluno.toString());
				System.out.println("Média do aluno: " + aluno.getMediaNota());
				System.out.println("Resultado: " + aluno.getAlunoStatus());
				
		}
}
