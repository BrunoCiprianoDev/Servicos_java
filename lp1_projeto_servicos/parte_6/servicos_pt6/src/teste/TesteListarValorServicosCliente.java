package teste;

import contratos.Contrato;
import exceptions.TotalHorasException;
import historicos.Historico;
import historicos.RankingDeClientes;
import pessoas.Assalariado;
import pessoas.Cliente;
import pessoas.Comissionado;
import pessoas.Horista;
import services.Servico;

public class TesteListarValorServicosCliente {
	public static void main(String...args) {
		Servico servicoUm = novoServico("Limpeza da fachada", 50, 5, 100);
		Servico servicoDois = novoServico("Limpeza condominio", 50, 5, 100);
		Servico servicoTres = novoServico("Limpeza piscina", 50, 5, 100);
		Servico servicoQuatro = novoServico("Limpeza piscina grande", 50, 5, 100);
		Servico servicoCinco = novoServico("Limpeza piscina pequena", 50, 5, 100);
		Servico servicoSeis = novoServico("Limpeza quintal", 50, 5, 100);
		Servico servicoSete = novoServico("Limpeza janelas", 50, 5, 100);
		
		Assalariado funcionarioUm = new Assalariado("Fulano", "de Tal", "ciclano911@empresa.com.br", true, 1100);
		Comissionado funcionarioDois = new Comissionado("Érbio", "Periodico", "er981@empresa.com.br", true, 0.07);
		Horista funcionarioTres = new Horista("TypewriterWoman", "Mouse", "benzenoo981@empresa.com.br", false, 50);
	
		Cliente clienteUm = new Cliente("Carlos", "da Sila", "dasilva981@ig.com.br", true);
		Cliente clienteDois = new Cliente("Darlene", "da Silva", "masilva980@ig.com.br", false);
		Cliente clienteTres = new Cliente("Fernanda", "Ribeiro", "ribeiro987@oi.com.br", false);
		
		Contrato contratoUm = new Contrato(servicoUm, clienteUm, funcionarioUm);
		Contrato contratoDois = new Contrato(servicoDois, clienteUm, funcionarioDois);
		Contrato contratoTres = new Contrato(servicoTres, clienteUm, funcionarioTres);
		Contrato contratoQuatro = new Contrato(servicoQuatro, clienteUm, funcionarioUm);
		Contrato contratoCinco = new Contrato(servicoCinco, clienteUm, funcionarioDois);
		Contrato contratoSeis = new Contrato(servicoSeis, clienteUm, funcionarioTres);
		Contrato contratoSete = new Contrato(servicoSete, clienteUm, funcionarioUm);
		Contrato contratoNove = new Contrato(servicoDois, clienteDois, funcionarioDois);
		Contrato contratoDez = new Contrato(servicoDois, clienteTres, funcionarioTres);
		Contrato contratoOnze = new Contrato(servicoDois, clienteTres, funcionarioUm);
		Contrato contratoDoze = new Contrato(servicoDois, clienteTres, funcionarioDois);

		
		Historico historico = new Historico(contratoUm);
		historico.adicionarContrato(contratoDois);
		historico.adicionarContrato(contratoTres);
		historico.adicionarContrato(contratoQuatro);
		historico.adicionarContrato(contratoCinco);
		historico.adicionarContrato(contratoSeis);
		historico.adicionarContrato(contratoSete);
		historico.adicionarContrato(contratoNove);
		historico.adicionarContrato(contratoDez);
		historico.adicionarContrato(contratoOnze);
		historico.adicionarContrato(contratoDoze);
		
		RankingDeClientes rankingDeClientes = new RankingDeClientes(historico);
		System.out.println(rankingDeClientes.listarClientesTotaisServicosContratados());
		System.out.println(clienteUm.getNome()+" "+rankingDeClientes.consultarCategoriaCliente(clienteUm));
		System.out.println(clienteDois.getNome()+" "+rankingDeClientes.consultarCategoriaCliente(clienteDois));
		System.out.println(clienteTres.getNome()+" "+rankingDeClientes.consultarCategoriaCliente(clienteTres));
		
	}
	public static Servico novoServico(String descricao, double valorHora, double horasPrevistas, double horasTrabalhadas) {
		try{
			return new Servico(descricao,valorHora, horasPrevistas, horasTrabalhadas);
		}catch(TotalHorasException totalHorasException) {
			totalHorasException.printStackTrace();
		}
		return null;
	}
}
