package teste;

import contratos.Contrato;
import identificadores.IdentificadorFuncionario;
import pessoas.Assalariado;
import pessoas.Cliente;
import pessoas.Comissionado;
import pessoas.Horista;
import services.Servico;

public class TesteIdentificadorDeFuncionario {
	public static void main(String...args) {
		//Teste do funcionamento do método 'getIdentificacao()' da clase IdentificadorFuncionario:
		Servico servicoUm = new Servico("Limpeza da fachada", 45, 5, 6);
		Servico servicoDois = new Servico("Limpeza condominio", 50, 7, 6.5);
		Servico servicoTres = new Servico("Limpeza piscina", 70, 3, 3);
	
		Assalariado funcionarioUm = new Assalariado("Fulano", "de Tal", "ciclano911@empresa.com.br", true, 1100);
		Comissionado funcionarioDois = new Comissionado("Érbio", "Periodico", "er981@empresa.com.br", true, 0.05);
		Horista funcionarioTres = new Horista("TypewriterWoman", "Mouse", "benzenoo981@empresa.com.br", true, 15);
		
		Cliente clienteUm = new Cliente("José", "da Sila", "dasilva981@ig.com.br", true);
		Cliente clienteDois = new Cliente("Maria", "da Silva", "masilva980@ig.com.br", false);
		Cliente clienteTres = new Cliente("Lucia", "Ribeiro", "ribeiro987@oi.com.br", false);
	
		Contrato contratoUm = new Contrato(servicoUm, clienteUm, funcionarioUm);
		Contrato contratoDois = new Contrato(servicoDois, clienteDois, funcionarioDois);
		Contrato contratoTres = new Contrato(servicoTres, clienteTres, funcionarioTres);

		System.out.println("FuncionarioUm: "+IdentificadorFuncionario.getIdentificacao(contratoUm));
		System.out.println("FuncionarioDois: "+IdentificadorFuncionario.getIdentificacao(contratoDois));
		System.out.println("FuncionarioTres: "+IdentificadorFuncionario.getIdentificacao(contratoTres));
		
	}
}
