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

public class TesteParteSeisItemDois {
	public static void main(String...args) {	
		/*O objetivo desse teste é verificar o funcionamento dos seguintes métodos da classe "RankingDeClientes:"
		 * 1)listarClientesTotaisServicosContratados()
		 * 2)consultarCategoriaCliente(clienteUm)
		 * 3)consultarValorTotalServicosCliente(clienteDois)
		 */
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
		
		//Teste item 2a) Listar todos os clientes e seus totais de serviços contratados.
		System.out.println("a) Listagem cliente valor:");
		System.out.println(rankingDeClientes.listarClientesTotaisServicosContratados());
		
		//Teste item 2b) Consultar a valor total dos serviços contratados por um cliente.
		System.out.println("b) Consultas categorias clientes:");
		System.out.println(clienteUm.getNome()+" "+rankingDeClientes.consultarCategoriaCliente(clienteUm));
		System.out.println(clienteDois.getNome()+" "+rankingDeClientes.consultarCategoriaCliente(clienteDois));
		System.out.println(clienteTres.getNome()+" "+rankingDeClientes.consultarCategoriaCliente(clienteTres)+"\n");
			
		//Teste item 2c) Consultar a categoria de um cliente.
		System.out.println("c) Consultas valores totais clientes:");
		System.out.println(clienteUm.getNome()+" R$"+rankingDeClientes.consultarValorTotalServicosCliente(clienteUm));
		System.out.println(clienteDois.getNome()+" R$"+rankingDeClientes.consultarValorTotalServicosCliente(clienteDois));
		System.out.println(clienteTres.getNome()+" R$"+rankingDeClientes.consultarValorTotalServicosCliente(clienteTres));	
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
