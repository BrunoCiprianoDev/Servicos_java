package teste;

import exceptions.TotalHorasException;
import pessoas.Cliente;
import services.Servico;

public class TesteEqualsCliente {
	public static void main(String...args) {
		
		/*	O objetivo desse teste é verificar o correto funcionamento da sobreescrita
		*do método 'equals'. 
		*
		*	Como o método 'new Cliente(Cliente)' permite a instanciação de um 
		*novo objeto com as mesmas caracteristicas do objeto Cliente passado como 
		*parametro, mas com endereços de memoria distintos. Ao usar o método ".equals",
		*espera se que o resultado da comparação entre eles seja "True".
		*
		*/
		Cliente clienteUm = new Cliente("Carlos", "da Sila", "dasilva981@ig.com.br", true);
		Cliente copiaClienteUm = new Cliente(clienteUm);
		System.out.println("Comparação clienteUm com copiaClienteUm: "+clienteUm.equals(copiaClienteUm));
		
		
		Cliente clienteDois = new Cliente("Darlene", "da Silva", "masilva980@ig.com.br", false);
		Cliente copiaClienteDois = new Cliente(clienteDois);
		System.out.println("Comparação clienteDois com copiaClienteDois: "+clienteDois.equals(copiaClienteDois));
		
		System.out.println("Comparação clienteUm com clienteDois: "+clienteUm.equals(clienteDois));
		System.out.println("Comparação clienteUm com clienteDois: "+copiaClienteUm.equals(copiaClienteDois));
		
	}
	
}
