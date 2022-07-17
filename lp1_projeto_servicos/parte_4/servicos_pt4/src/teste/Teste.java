package teste;

import entidades.*;

public class Teste {
	public static void main(String[] args) {
		Servico servicoUm = new Servico("Limpeza da fachada", 45, 5, 6);
		Servico servicoDois = new Servico("Limpeza condominio", 50, 7, 6.5);
		Servico servicoTres = new Servico("Limpeza piscina", 70, 3, 3);
		Servico servicoQuatro = new Servico("Limpeza vidraça", 50, 4, 4);
		Servico servicoCinco = new Servico("Limpeza jardim", 60, 7, 8);
	
		Cliente clienteUm = new Cliente("José", "da Sila", "dasilva981@ig.com.br", true);
		Cliente clienteDois = new Cliente("Maria", "da Silva", "masilva980@ig.com.br", false);
		Cliente clienteTres = new Cliente("Lucia", "Ribeiro", "ribeiro987@oi.com.br", false);
		Cliente clienteQuatro = new Cliente("Adenosina", "Trifosfato", "atplva987@uai.com.br", false);
		Cliente clienteCinco = new Cliente("Joaquina", "Mitocondria", "jm981@gmail.com.br", true);
		Cliente clienteSeis = new Cliente("Európio", "Lantanideo", "aleatorio@outlook.com.br", true);
		
		Assalariado funcionarioUm = new Assalariado("Fulano", "de Tal", "ciclano911@empresa.com.br", true, 1100);
		Comissionado funcionarioDois = new Comissionado("Érbio", "Periodico", "er981@empresa.com.br", true, 0.05, 3000);
		Horista funcionarioTres = new Horista("TypewriterWoman", "Mouse", "benzenoo981@empresa.com.br", true, 15, 80);
		Assalariado funcionarioQuatro = new Assalariado("Fulana", "de Tal", "ciclana981@empresa.com.br", false,  1775);

		Contrato contratoUm = new Contrato(servicoUm, clienteUm, funcionarioUm);
		Contrato contratoDois = new Contrato(servicoDois, clienteDois, funcionarioDois);
		Contrato contratoTres = new Contrato(servicoTres, clienteTres, funcionarioTres);
		Contrato contratoQuatro = new Contrato(servicoQuatro, clienteQuatro, funcionarioQuatro);
		Contrato contratoCinco = new Contrato(servicoCinco, clienteCinco, funcionarioQuatro);
		Contrato contratoSeis = new Contrato(servicoUm, clienteSeis, funcionarioUm);
		Contrato contratoSete = new Contrato(servicoDois, clienteCinco, funcionarioDois);
		Contrato contratoOito = new Contrato(servicoTres, clienteQuatro, funcionarioTres);
		Contrato contratoNove = new Contrato(servicoQuatro, clienteDois, funcionarioQuatro);
		Contrato contratoDez = new Contrato(servicoCinco, clienteUm, funcionarioUm);
		Contrato contratoOnze = new Contrato(new Servico("Limpeza telhado", 80, 3, 2), new Cliente("Ctrêspeó", "Random", "rnadom991.com", true), funcionarioUm);
	
		Historico historico = new Historico(contratoUm);
		historico.setContrato(contratoDois);
		historico.setContrato(contratoTres);
		historico.setContrato(contratoQuatro);
		historico.setContrato(contratoCinco);
		historico.setContrato(contratoSeis);
		historico.setContrato(contratoSete);
		historico.setContrato(contratoOito);
		historico.setContrato(contratoNove);
		historico.setContrato(contratoDez);
		historico.setContrato(contratoOnze);
		
		System.out.println(historico.toString());
		
		System.out.println(IdentificadorFuncionario.getIdentificacao(funcionarioQuatro));
		
		//System.out.println(historico.informacoesDeUmDeterminadoContrato("2022-2"));

	
	}

}
