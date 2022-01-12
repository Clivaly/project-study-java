package project.study.classes;

import project.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {

	private String registro;
	private String nivelCargo;
	private String experiencia;
	
	private String login;
	private String password;
	
	/*Exemplo construtor padrão*/
	public Secretario() {		
	}
	
	 /*Exemplo construtor 2*/
	 public Secretario(String login, String password) {
		 this.login = login;
		 this.password = password;
	}	
		
	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getNivelCargo() {
		return nivelCargo;
	}

	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}		
	
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", cpf=" + cpf
				+ ", rg=" + rg + ", nomeMae=" + nomeMae + "]";
	}

	@Override
	public double salario() {
		
		return 1700.00 * 0.9;
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
