package teste;

import java.util.ArrayList;

import comparadores.*;
import contratos.Contrato;
import exceptions.TotalHorasException;
import historicos.Historico;
import pessoas.Assalariado;
import pessoas.Cliente;
import pessoas.Comissionado;
import pessoas.Horista;
import services.Servico;

public class TesteItemQuatroParteCinco {
	public static void main(String...args) {
		/**
		 * @author Bruno Cipriano
		 * O objetivo desse Teste é verificar a implementação da interface "Comparator"
		 * para ordenar os contratos de servicos em ordem alfabetica DECRESCENTE com base 
		 * nos nomes dos clientes.
		 * 
		 */
		
		//Instanciação dos servicos de cada contrato
		Servico servicoUm = novoServico("Limpeza da fachada", 45, 5, 6);
		Servico servicoDois = novoServico("Limpeza condominio", 50, 7, 6.5);
		Servico servicoTres = novoServico("Limpeza piscina", 70, 3, 3);
		Servico servicoQuatro = novoServico("Limpeza piscina grande", 70, 33, 30);
		Servico servicoCinco = novoServico("Limpeza piscina pequena", 70, 39, 45);
		Servico servicoSeis = novoServico("Limpeza quintal", 70, 59, 60);
		Servico servicoSete = novoServico("Limpeza janelas", 70, 65, 70);
		
		//Instanciação dos clientes de cada contrato
		Cliente clienteUm = new Cliente("Carlos", "da Sila", "dasilva981@ig.com.br", true);
		Cliente clienteDois = new Cliente("Darlene", "da Silva", "masilva980@ig.com.br", false);
		Cliente clienteTres = new Cliente("Fernanda", "Ribeiro", "ribeiro987@oi.com.br", false);
		Cliente clienteQuatro = new Cliente("Edimilson", "Ribeiro", "ribeiro987@oi.com.br", true);
		Cliente clienteCinco = new Cliente("Amanda", "Ribeiro", "ribeiro987@oi.com.br", false);
		Cliente clienteSeis = new Cliente("Bruno", "Ribeiro", "ribeiro987@oi.com.br", true);
		Cliente clienteSete = new Cliente("Gabriela", "Ribeiro", "ribeiro987@oi.com.br", false);
		
		//Instanciação dos funcionarios
		Assalariado funcionarioUm = new Assalariado("Fulano", "de Tal", "ciclano911@empresa.com.br", true, 1100);
		Comissionado funcionarioDois = new Comissionado("Érbio", "Periodico", "er981@empresa.com.br", true, 0.07);
		Horista funcionarioTres = new Horista("TypewriterWoman", "Mouse", "benzenoo981@empresa.com.br", false, 50);
		
		//Instanciação dos contratos de prestação de serviço:
		Contrato contratoUm = new Contrato(servicoUm, clienteUm, funcionarioUm);
		Contrato contratoDois = new Contrato(servicoDois, clienteDois, funcionarioDois);
		Contrato contratoTres = new Contrato(servicoTres, clienteTres, funcionarioTres);
		Contrato contratoQuatro = new Contrato(servicoQuatro, clienteQuatro, funcionarioUm);
		Contrato contratoCinco = new Contrato(servicoCinco, clienteCinco, funcionarioDois);
		Contrato contratoSeis = new Contrato(servicoSeis, clienteSeis, funcionarioTres);
		Contrato contratoSete = new Contrato(servicoSete, clienteSete, funcionarioUm);
		
		//Instanciação do historico que contém uma lista com cada contrato:
		Historico historico = new Historico(contratoUm);
		historico.adicionarContrato(contratoDois);
		historico.adicionarContrato(contratoTres);
		historico.adicionarContrato(contratoQuatro);
		historico.adicionarContrato(contratoCinco);
		historico.adicionarContrato(contratoSeis);
		historico.adicionarContrato(contratoSete);
		
		/* Método listarContratosDeServico() com parametro "new OrdenamentoValorServicoPrestadoCrescente" 
		 * ordena os contratos de serviço em ordem crescente dos valores cobrados em cada  contrato de 
		 * serviço.
		 */
		ArrayList<Contrato> listaContratosDeServicosPrestados = historico.listarContratosDeServico(new OrdenamentoValorServicoPrestadoCrescente());	
		
		//Verificação do resultado da listagem:
		for(Contrato contrato : listaContratosDeServicosPrestados) {
			System.out.println("Servico: "+contrato.getServico().getDescricao()+" Valor: R$"+contrato.getServico().getHorasTrabalhadas());
		}
		
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
