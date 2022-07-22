package teste;

import entidades.Cliente;
import entidades.Contrato;
import entidades.Funcionario;
import entidades.Servico;

public class TesteMetodosGetClasseContrato {
	public static void main(String[] args) {
		/*Teste verificação dos métodos getServico(), getCliente() e getFuncionario() da
		 *classe Contrato após a implementação dos mecanismos que evitam a quebra 
		 *de encapsulamento */
		
		Servico servicoUm = new Servico("Limpeza da fachada", 45, 5, 6);	
		Cliente clienteUm = new Cliente("José", "da Sila", "dasilva981@ig.com.br", "masculino");	
		Funcionario funcionarioUm = new Funcionario("Fulano", "de Tal", "ciclano911@empresa.com.br", "masculino");
		Contrato contratoUm = new Contrato(servicoUm, clienteUm, funcionarioUm);

		System.out.println(contratoUm.getServico().toString()+"\n");
		System.out.println(contratoUm.getCliente().toString()+"\n");
		System.out.println(contratoUm.getFuncionario().toString()+"\n");		
	}
}
