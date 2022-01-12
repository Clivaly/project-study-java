package project.study.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import project.constantes.StatusAluno;
import project.study.classes.Aluno;
import project.study.classes.Disciplina;
import project.study.classes.Secretario;

public class Base {
	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe  o login: ");
		String password = JOptionPane.showInputDialog("Informe  a senha: ");
		
		Secretario secretario = new Secretario();
		secretario.setLogin(login);
		secretario.setPassword(password);

		if (secretario.autenticar()) {

			List<Aluno> alunos = new ArrayList<Aluno>();

			/* É uma lista que dentro dela temos uma chave que identifica uma sequência de valores */
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			for (int qtd = 1; qtd <= 2; qtd++) {

				String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
				String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");

				/*Aluno() = instância de um objeto no java // aluno = é a variável que faz referência ao Aluno() */
				Aluno aluno = new Aluno();
				aluno.setNome(nome);
				aluno.setIdade(Integer.valueOf(idade));

				for (int pos = 1; pos <= 2; pos++) {
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
				System.out.println("Resultado: " + aluno.getNome() + " está " + aluno.getAlunoStatus()
						+ " com média de: " + aluno.getMediaNota());
			}

			System.out.println("Lista dos reprovados");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Resultado: " + aluno.getNome() + " está " + aluno.getAlunoStatus()
						+ " com média de: " + aluno.getMediaNota());
			}

			System.out.println("Lista de alunos em recuperação");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Resultado: " + aluno.getNome() + " está " + aluno.getAlunoStatus()
						+ " com média de: " + aluno.getMediaNota());
			}
		} else {
				JOptionPane.showMessageDialog(null, "Acesso não permitido!");
		}
	}
}
