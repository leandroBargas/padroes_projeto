package saudacoes.modelo;

public class Homem extends Pessoa {
	public Homem(String nome) {
		this.nome = nome;
		System.out.println("Bem-vindo Sr " + this.nome);
	}

}
