package saudacoes.visao;

import java.util.Scanner;

import saudacoes.modelo.FactoryPessoa;

public class Usuario {
	
	public static void main(String[] args) {
		FactoryPessoa factory = new FactoryPessoa();
		 Scanner texto = new Scanner(System.in);
		 
		 System.out.println("Infome seu nome: ");
			String nome = texto.nextLine();

			System.out.println("Infome seu Sexo: ");
			System.out.println("Masculino");
			System.out.println("Feminino");
			System.out.println("indefinido ");
			
			String sexo = texto.nextLine();
			
			factory.getpPessoa(nome, sexo);

			texto.close();
		
	}

}
