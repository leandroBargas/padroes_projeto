package saudacoes.modelo;

public class FactoryPessoa {

	public FactoryPessoa() {}
	
	public Pessoa getpPessoa(String nome, String sexo) {
		
		if (sexo.equals("masculino"))
			return new Homem(nome);
		
		else if (sexo.equals("feminino"))
			return new Mulher(nome);
		
		
		else if (sexo.equals("Indefinido")) {
			return new Indefinido(nome);
			
			
		}
		return null;
		
		
		
	}
	

}
