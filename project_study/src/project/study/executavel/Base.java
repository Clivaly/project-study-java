package project.study.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import project.classes.auxiliares.FuncaoAutenticacao;
import project.constantes.StatusAluno;
import project.study.classes.Aluno;
import project.study.classes.Diretor;
import project.study.classes.Disciplina;

public class Base {
	public static void main(String[] args) {

		try {

			String login = JOptionPane.showInputDialog("Informe  o login: ");
			String password = JOptionPane.showInputDialog("Informe  a senha: ");

			if (new FuncaoAutenticacao(new Diretor(login, password)).autenticar()) {

				List<Aluno> alunos = new ArrayList<Aluno>();

				/*
				 * ? uma lista que dentro dela temos uma chave que identifica uma sequ?ncia de
				 * valores
				 */
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int qtd = 1; qtd <= 1; qtd++) {

					String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
					String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");

					/*
					 * Aluno() = inst?ncia de um objeto no java // aluno = ? a vari?vel que faz
					 * refer?ncia ao Aluno()
					 */
					Aluno aluno = new Aluno();
					aluno.setNome(nome);
					aluno.setIdade(Integer.valueOf(idade));

					for (int pos = 1; pos <= 1; pos++) {
						String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
						String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");

						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplina(nomeDisciplina);
						disciplina.setNota(Double.valueOf(notaDisciplina));

						aluno.getDisciplinas().add(disciplina);
					}

					int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

					if (escolha == 0) {

						int continuarRemover = 0;
						int posicao = 1;

						while (continuarRemover == 0) {
							String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou  4? ");
							aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
							posicao++;
							continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
						}
					}

					alunos.add(aluno);
				}

				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

				for (Aluno aluno : alunos) {/* Separei em listas */
					if (aluno.getAlunoStatus().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);
					} else if (aluno.getAlunoStatus().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					} else {
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}
				}

				System.out.println("Lista dos provados");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println("Resultado: " + aluno.getNome() + " est? " + aluno.getAlunoStatus()
							+ " com m?dia de: " + aluno.getMediaNota());
				}

				System.out.println("------------------------------------------------------------------------------");
				System.out.println("Lista dos reprovados");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println("Resultado: " + aluno.getNome() + " est? " + aluno.getAlunoStatus()
							+ " com m?dia de: " + aluno.getMediaNota());
				}

				System.out.println("------------------------------------------------------------------------------");
				System.out.println("Lista de alunos em recupera??o");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println("Resultado: " + aluno.getNome() + " est? " + aluno.getAlunoStatus()
							+ " com m?dia de: " + aluno.getMediaNota());
				}
			} else {
				JOptionPane.showMessageDialog(null, "Acesso n?o permitido!");
			}

		} catch (Exception e) {
			StringBuilder saida = new StringBuilder();
			/*Imprime erro no console Java*/
			e.printStackTrace();

			/*Mensagem de erro ou causa*/
			System.out.println("Mensagem: " + e.getMessage());

			for (int i = 0; i < e.getStackTrace().length; i++) {
				System.out.println("Classe de erro: " + e.getStackTrace()[i].getClassName());
				System.out.println("M?todo de erro: " + e.getStackTrace()[i].getMethodName());
				System.out.println("Linha de erro: " + e.getStackTrace()[i].getLineNumber());
				
				/*Exemplo customiz?vel*/
				saida.append("\n Classe de erro: " + e.getStackTrace()[i].getClassName());
				saida.append("\n M?todo de erro: " + e.getStackTrace()[i].getMethodName());
				saida.append("\n Linha de erro: " + e.getStackTrace()[i].getLineNumber());
			}

			JOptionPane.showMessageDialog(null, "System Error!");
		}
	}
}
