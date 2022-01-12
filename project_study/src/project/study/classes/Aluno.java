package project.study.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import project.constantes.StatusAluno;

public class Aluno extends Pessoa {

	/* Atributos */
	private String dataMatriculaAluno;
	private String nomeEscola;
	private String serieMatriculadoAluno;

	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public Aluno() { /* Cria dados na memória - Construtor */
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nomeAluno) {
		this.nome = nomeAluno;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getDataMatriculaAluno() {
		return dataMatriculaAluno;
	}

	public void setDataMatriculaAluno(String dataMatriculaAluno) {
		this.dataMatriculaAluno = dataMatriculaAluno;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculadoAluno() {
		return serieMatriculadoAluno;
	}

	public void setSerieMatriculadoAluno(String serieMatriculadoAluno) {
		this.serieMatriculadoAluno = serieMatriculadoAluno;
	}

	public double getMediaNota() {

		double somaNotas = 0.0;

		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		return somaNotas / disciplinas.size();
	}

	public String getAlunoStatus() {
		double media = this.getMediaNota();
		if (media >= 50) {
			if (media >= 70) {
				return StatusAluno.APROVADO;
			} else {
				return StatusAluno.RECUPERACAO;
			}
		} else {
			return StatusAluno.REPROVADO;
		}
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", cpf=" + cpf
				+ ", nomeMae=" + nomeMae + ", dataMatriculaAluno=" + dataMatriculaAluno + ", nomeEscola=" + nomeEscola
				+ ", serieMatriculadoAluno=" + serieMatriculadoAluno + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, nomeMae);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(nomeMae, other.nomeMae);
	}

	@Override
	public double salario() {
		
		return 600.00;
	}

}
