package teste;

import java.util.ArrayList;

import comparadores.OrdenamentoValorServicoPrestadoCrescente;
import contratos.Contrato;
import exceptions.TotalHorasException;
import listas.Agrupamento;
import pessoas.Assalariado;
import pessoas.Cliente;
import pessoas.Comissionado;
import pessoas.Horista;
import services.Servico;

public class TesteReorganizarAgrupamento {
	public static void main(String[] args) {
		Servico servicoUm = novoServico("Limpeza da fachada", 50, 5, 130);
		Servico servicoDois = novoServico("Limpeza condominio", 50, 5, 120);
		Servico servicoTres = novoServico("Limpeza piscina", 50, 5, 110);

		Assalariado funcionarioUm = new Assalariado("Fulano", "de Tal", "ciclano911@empresa.com.br", true, 1100);
		Comissionado funcionarioDois = new Comissionado("Érbio", "Periodico", "er981@empresa.com.br", true, 0.07);
		Horista funcionarioTres = new Horista("TypewriterWoman", "Mouse", "benzenoo981@empresa.com.br", false, 50);
	
		Cliente clienteUm = new Cliente("Danilo", "da Sila", "dasilva981@ig.com.br", true);
		Cliente clienteDois = new Cliente("Carlota", "da Silva", "masilva980@ig.com.br", false);
		Cliente clienteTres = new Cliente("Amelha", "Ribeiro", "ribeiro987@oi.com.br", false);
		
		Contrato contratoUm = new Contrato(servicoUm, clienteUm, funcionarioUm);
		Contrato contratoDois = new Contrato(servicoDois, clienteDois, funcionarioDois);
		Contrato contratoTres = new Contrato(servicoTres, clienteTres, funcionarioTres);
		
		Agrupamento<Contrato> agrupamentoDeContratos = new Agrupamento<Contrato>();
		agrupamentoDeContratos.adicionar(contratoUm);
		agrupamentoDeContratos.adicionar(contratoDois);
		agrupamentoDeContratos.adicionar(contratoTres);
		
		/*Lista foi reorganizada conforme o parametro padrao dos objetos contratos, ou seja,
		 *ordem dos nomes dos clientes
		 */
		agrupamentoDeContratos.reorganizarElementosLista(null);
		ArrayList<Contrato> lista = agrupamentoDeContratos.getListaElementos();
		for(Contrato contrato : lista) {
			System.out.println(contrato.getCliente().getNome()+" "+contrato.getServico().getHorasTrabalhadas());			
		}
		
		//Lista reorganizada conforme o valor do servico prestado em ordem crescente
		agrupamentoDeContratos.reorganizarElementosLista(new OrdenamentoValorServicoPrestadoCrescente());
		lista = agrupamentoDeContratos.getListaElementos();
		for(Contrato contrato : lista) {
			System.out.println(contrato.getCliente().getNome()+" "+contrato.getServico().getHorasTrabalhadas());			
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
