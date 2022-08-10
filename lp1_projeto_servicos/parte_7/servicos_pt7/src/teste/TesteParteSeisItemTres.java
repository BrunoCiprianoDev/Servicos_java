package teste;

import contratos.Contrato;
import exceptions.TotalHorasException;
import listas.Agrupamento;
import listas.RankingDeClientes;
import pessoas.Assalariado;
import pessoas.Cliente;
import pessoas.Comissionado;
import pessoas.Horista;
import services.Servico;

public class TesteParteSeisItemTres {
	public static void main(String...args) {	
		/*O objetivo desse teste é verificar o funcionamento do método "atualizarMapClienteTotalServicos()" 
		 * da classe "RankingDeClientes" que atualiza a estrutura "hashMap" da classe RankingDeClientes
		 * após a implementação da classe Agrupamento<>;
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
		
		Agrupamento<Contrato> agrupamentoDeContratos = new Agrupamento<Contrato>();
		agrupamentoDeContratos.adicionar(contratoUm);
		agrupamentoDeContratos.adicionar(contratoDois);
		agrupamentoDeContratos.adicionar(contratoTres);
		agrupamentoDeContratos.adicionar(contratoQuatro);
		agrupamentoDeContratos.adicionar(contratoCinco);
		agrupamentoDeContratos.adicionar(contratoSeis);
		agrupamentoDeContratos.adicionar(contratoSete);
		agrupamentoDeContratos.adicionar(contratoNove);
		agrupamentoDeContratos.adicionar(contratoDez);
		agrupamentoDeContratos.adicionar(contratoOnze);
		agrupamentoDeContratos.adicionar(contratoDoze);
		
		// Listagem a partir do historico inicial
		RankingDeClientes rankingDeClientes = new RankingDeClientes(agrupamentoDeContratos);
		System.out.println(rankingDeClientes.listarClientesTotaisServicosContratados());
		
		Contrato contratoTreze = new Contrato(servicoDois, clienteTres, funcionarioTres);
		Contrato contratoQuatorze = new Contrato(servicoDois, clienteTres, funcionarioTres);
		
		// Modifições no agrupamento
		agrupamentoDeContratos.adicionar(contratoTreze);
		agrupamentoDeContratos.adicionar(contratoQuatorze);
		
		// Teste da atualização da estrutura map:
		rankingDeClientes.atualizarMapClienteTotalServicos(agrupamentoDeContratos);
		System.out.println(rankingDeClientes.listarClientesTotaisServicosContratados());
		
		
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
