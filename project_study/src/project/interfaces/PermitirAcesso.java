package project.interfaces;

/*Essa inerface será o nosso contrato de auenticação*/
public interface PermitirAcesso {

	/* Apenas declaração do metódo com dois exemplos: com e sem parâmetros */
	public boolean autenticar(String login, String password); 
	public boolean autenticar();
	
}
