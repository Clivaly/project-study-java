package project.study.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import project.constantes.StatusAluno;
import project.study.classes.Aluno;
import project.study.classes.Disciplina;

public class Base {
		public static void main(String[] args) {
			
				List<Aluno> alunos = new ArrayList<Aluno>();
												
				List<Aluno>alunosAprovados = new ArrayList<Aluno>();
				List<Aluno>alunosReprovados = new ArrayList<Aluno>();
				List<Aluno>alunosRecuperacao = new ArrayList<Aluno>();
				
				for(int qtd = 1; qtd <= 5; qtd++) {
			
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
				for (Aluno aluno : alunos) {
					if (aluno.getAlunoStatus().equalsIgnoreCase(StatusAluno.APROVADO)) {
						alunosAprovados.add(aluno);
					}else if (aluno.getAlunoStatus().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						alunosRecuperacao.add(aluno);
					}else {
						alunosReprovados.add(aluno);
					}
				}
			
				System.out.println("Lista dos provados");
				for (Aluno aluno : alunosAprovados) {
						System.out.println("Resultado: " + aluno.getAlunoStatus() + "com média de: " + aluno.getMediaNota());				
				}
				
				System.out.println("Lista dos reprovados");
				for (Aluno aluno : alunosReprovados) {
						System.out.println("Resultado: " + aluno.getAlunoStatus() + "com média de: " + aluno.getMediaNota());				
				}
				
				System.out.println("Lista de alunos em recuperação");
				for (Aluno aluno : alunosRecuperacao) {
						System.out.println("Resultado: " + aluno.getAlunoStatus() + "com média de: " + aluno.getMediaNota());				
				}
		}
}
