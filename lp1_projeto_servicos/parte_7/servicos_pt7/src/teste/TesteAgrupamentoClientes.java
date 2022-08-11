package teste;

import listas.Agrupamento;
import pessoas.Cliente;

public class TesteAgrupamentoClientes {
	public static void main(String[] args) {
		
		// O objetivo desse teste é verificar o funcionamento dos métodos da classe Agrupamento<> para Clientes
		Cliente clienteUm = new Cliente("Carlos", "da Sila", "dasilva981@ig.com.br", true);
		Cliente clienteDois = new Cliente("Darlene", "da Silva", "masilva980@ig.com.br", false);
		Cliente clienteTres = new Cliente("Ernanda", "Ribeiro", "ribeiro987@oi.com.br", false);
		Cliente clienteQuatro = new Cliente("Bruna", "Das Graça", "ribeiro987@oi.com.br", false);
		Cliente clienteCinco = new Cliente("Anderson", "Matilde", "ribeiro987@oi.com.br", false);
		
		Agrupamento<Cliente> agrupamentoClientes = new Agrupamento<Cliente>();
		agrupamentoClientes.adicionar(clienteUm);
		agrupamentoClientes.adicionar(clienteDois);
		agrupamentoClientes.adicionar(clienteTres);
		agrupamentoClientes.adicionar(clienteQuatro);
		agrupamentoClientes.adicionar(clienteCinco);
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Lista inicial: "+agrupamentoClientes.toString());
		agrupamentoClientes.adicionar(new Cliente("Olavo", "Tonho", "ribeiro987@oi.com.br", true)); 
		agrupamentoClientes.adicionar(new Cliente("Jao", "Ribeiro", "ribeiro987@oi.com.br", true));
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Lista após adição de dois clientes: "+agrupamentoClientes.toString());
		System.out.println("-------------------------------------------------------------------");
		agrupamentoClientes.reorganizarElementosLista(null);
		System.out.println("Lista após aplicação do metodo reorganização: "+agrupamentoClientes.toString());
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Teste remoção 'clienteUm': "); //Clientes são comparados a partir do codigoCliente
		System.out.println(agrupamentoClientes.remover(new Cliente(clienteUm.getCodigoCliente())));
		System.out.println(agrupamentoClientes.toString());
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Verificar cliente 5: "+agrupamentoClientes.verificarExistencia(new Cliente(clienteUm.gerarCodigo())));
		System.out.println("Verificar cliente 1: "+agrupamentoClientes.verificarExistencia(new Cliente(clienteUm.gerarCodigo())));
		
	}
}
