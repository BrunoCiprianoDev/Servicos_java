package teste;

import pessoas.Assalariado;
import pessoas.Cliente;
import pessoas.Comissionado;
import pessoas.Horista;


public class TesteTratamento {
	public static void main(String...args) {	
		//Teste do método 'tratarNome()':	
		Assalariado funcionarioUm = new Assalariado("Fulano", "de Tal", "ciclano911@empresa.com.br", true, 1100);
		Comissionado funcionarioDois = new Comissionado("Fulana", "Periodico", "er981@empresa.com.br", false, 0.05);
		Horista funcionarioTres = new Horista("Fabiana", "Aleatorio", "mmgmail.com", false, 80);
		
		Cliente clienteUm = new Cliente("José", "Silva", "dasilva981@ig.com.br", true);
		Cliente clienteDois = new Cliente("Joana", "Oliveira", "masilva980@ig.com.br", false);
		
		System.out.println(funcionarioUm.tratarNome());
		System.out.println(funcionarioDois.tratarNome());
		System.out.println(funcionarioTres.tratarNome());
		System.out.println(clienteUm.tratarNome());
		System.out.println(clienteDois.tratarNome());
	}
}
