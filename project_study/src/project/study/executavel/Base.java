package project.study.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import project.study.classes.Aluno;
import project.study.classes.Disciplina;

public class Base {
		public static void main(String[] args) {
			
				List<Aluno> alunos = new ArrayList<Aluno>();
				
				for(int qtd = 1; qtd <= 2; qtd++) {
			
				String nome = JOptionPane.showInputDialog("Qual o nome do aluno "+ qtd +" ?");
				String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
							
				/* Aluno() = instância de um objeto no java // aluno = é a variável que faz referência ao Aluno() */
				Aluno aluno = new Aluno();
				aluno.setNomeAluno(nome);
				aluno.setIdadeAluno(Integer.valueOf(idade));
				
				for (int pos = 1; pos <= 2; pos++) {
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
				
				alunos.add(aluno);
			}
				for (int pos = 0; pos < alunos.size(); pos++) {
					
					Aluno aluno = alunos.get(pos);	
					
					if (aluno.getNomeAluno().equalsIgnoreCase("Rod")) {
						Aluno trocar = new Aluno();
						trocar.setNomeAluno("Aluno foi trocado");
						
						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplina("Matemática");
						disciplina.setNota(90);
						
						trocar.getDisciplinas().add(disciplina);
						
						alunos.set(pos, trocar);
						aluno = alunos.get(pos);
					}
					
					System.out.println("Aluno: " + aluno.getNomeAluno());
					System.out.println("Média do aluno: " + aluno.getMediaNota());
					System.out.println("Resultado: " + aluno.getAlunoStatus());
					System.out.println("--------------------------------------------------------------------------------");
					
					for(int posd = 0; posd < aluno.getDisciplinas().size(); posd++ ) {
						Disciplina disc = aluno.getDisciplinas().get(posd);
						System.out.println("Matéria: " + disc.getDisciplina() + " Nota: " + disc.getNota());
					}
				}
			
		}
}
