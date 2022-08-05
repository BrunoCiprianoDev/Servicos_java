package teste;

import pessoas.*;
import contratos.Contrato;
import historicos.Historico;
import services.Servico;

public class Teste {
	public static void main(String...args) {
			
		Servico servicoUm = new Servico("Limpeza da fachada", 45, 5, 2401);
		Servico servicoDois = new Servico("Limpeza condominio", 50, 2500, 6.5);
		Servico servicoTres = new Servico("Limpeza piscina", 70, 3, 3);

		Cliente clienteUm = new Cliente("José", "da Sila", "dasilva981@ig.com.br", true);
		Cliente clienteDois = new Cliente("Maria", "da Silva", "masilva980@ig.com.br", false);
		Cliente clienteTres = new Cliente("Lucia", "Ribeiro", "ribeiro987@oi.com.br", false);
		
		Assalariado funcionarioUm = new Assalariado("Fulano", "de Tal", "ciclano911@empresa.com.br", true, 1100);
		Comissionado funcionarioDois = new Comissionado("Érbio", "Periodico", "er981@empresa.com.br", true, 0.07);
		Horista funcionarioTres = new Horista("TypewriterWoman", "Mouse", "benzenoo981@empresa.com.br", false, 50);

		Contrato contratoUm = new Contrato(servicoUm, clienteUm, funcionarioUm);
		Contrato contratoDois = new Contrato(servicoDois, clienteDois, funcionarioDois);
		Contrato contratoTres = new Contrato(servicoTres, clienteTres, funcionarioTres);
	
		Historico historico = new Historico(contratoUm);
		historico.adicionarContrato(contratoDois);
		historico.adicionarContrato(contratoTres);
		
		System.out.println(historico.toString());
	}
}
