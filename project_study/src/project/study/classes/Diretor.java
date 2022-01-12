package project.study.classes;

public class Diretor extends Pessoa {

	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;

	public String getRegistroEducacao() {
		return registroEducacao;
	}

	public void setRegistroEducacao(String registroEducacao) {
	}

	public int getTempoDirecao() {
		return tempoDirecao;
	}

	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}

	public String getTempoTitulacao() {
		return titulacao;
	}

	public void setTempoTitulacao(String tempoTitulacao) {
		this.titulacao = tempoTitulacao;
	}

	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", cpf="
				+ cpf + ", rg=" + rg + ", nomeMae=" + nomeMae + "]";
	}

}
