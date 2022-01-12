package project.study.classes;

import project.interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso {

	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;
	
	private String login;
	private String password;
	
	/*Exemplo construtor padrão*/
	public Diretor() {		
	}
	
	 /*Exemplo construtor 2*/
	 public Diretor(String login, String password) {
		 this.login = login;
		 this.password = password;
	}	

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

	@Override
	public double salario() {		
		return 4500.00;
	}
	
	/*Esse é o método do contrato de autenticação */
	@Override
	public boolean autenticar() {		
		return login.equals("admin") && password.equals("admin");
	}
	
	/*Esse é o método do contrato de autenticação exemplo 2*/	
	@Override
	public boolean autenticar(String login, String password) {
		this.login = login;
		this.password = password;
		return autenticar();		
	}

}
