package project.study.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {

	/* Atributos */
	private String nomeAluno;
	private int idadeAluno;
	private String dataNascimentoAluno;
	private String cpfAluno;
	private String nomeMaeAluno;
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

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public int getIdadeAluno() {
		return idadeAluno;
	}

	public void setIdadeAluno(int idadeAluno) {
		this.idadeAluno = idadeAluno;
	}

	public String getDataNascimentoAluno() {
		return dataNascimentoAluno;
	}

	public void setDataNascimentoAluno(String dataNascimentoAluno) {
		this.dataNascimentoAluno = dataNascimentoAluno;
	}

	public String getCpfAluno() {
		return cpfAluno;
	}

	public void setCpfAluno(String cpfAluno) {
		this.cpfAluno = cpfAluno;
	}

	public String getNomeMaeAluno() {
		return nomeMaeAluno;
	}

	public void setNomeMaeAluno(String nomeMaeAluno) {
		this.nomeMaeAluno = nomeMaeAluno;
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
					return "Aluno está Aprovado";
			}else {
					return "Aluno m recuperação";
			}
		} else {
				return "Aluno está Reprovado";
		}
	}

	@Override
	public String toString() {
		return "Aluno [nomeAluno=" + nomeAluno + ", idadeAluno=" + idadeAluno + ", dataNascimentoAluno="
				+ dataNascimentoAluno + ", cpfAluno=" + cpfAluno + ", nomeMaeAluno=" + nomeMaeAluno
				+ ", dataMatriculaAluno=" + dataMatriculaAluno + ", nomeEscola=" + nomeEscola
				+ ", serieMatriculadoAluno=" + serieMatriculadoAluno + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpfAluno, nomeMaeAluno);
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
		return Objects.equals(cpfAluno, other.cpfAluno) && Objects.equals(nomeMaeAluno, other.nomeMaeAluno);
	}

}
