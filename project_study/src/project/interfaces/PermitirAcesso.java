package project.interfaces;

/*Essa inerface ser� o nosso contrato de auentica��o*/
public interface PermitirAcesso {

	/* Apenas declara��o do met�do com dois exemplos: com e sem par�metros */
	public boolean autenticar(String login, String password); 
	public boolean autenticar();
	
}
