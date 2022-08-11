package teste;

import comparadores.OrdenamentoValorServicoPrestadoCrescente;
import contratos.Contrato;
import exceptions.TotalHorasException;
import listas.Agrupamento;
import pessoas.Assalariado;
import pessoas.Cliente;
import pessoas.Comissionado;
import pessoas.Horista;
import services.Servico;

public class TesteAgrupamentoContratos {
	public static void main(String...args) {	

		// O objetivo desse teste é verificar o funcionamento dos métodos da classe Agrupamento<> para Contratos
		
		Servico servicoUm = novoServico("Limpeza da fachada", 50, 5, 100);
		Servico servicoDois = novoServico("Limpeza condominio", 50, 5, 100);
		Servico servicoTres = novoServico("Limpeza piscina", 50, 5, 100);
		
		Assalariado funcionarioUm = new Assalariado("Fulano", "de Tal", "ciclano911@empresa.com.br", true, 1100);
		Comissionado funcionarioDois = new Comissionado("Érbio", "Periodico", "er981@empresa.com.br", true, 0.07);
		Horista funcionarioTres = new Horista("TypewriterWoman", "Mouse", "benzenoo981@empresa.com.br", false, 50);
	
		Cliente clienteUm = new Cliente("Carlos", "da Sila", "dasilva981@ig.com.br", true);
		Cliente clienteDois = new Cliente("Darlene", "da Silva", "masilva980@ig.com.br", false);
		Cliente clienteTres = new Cliente("Fernanda", "Ribeiro", "ribeiro987@oi.com.br", false);
		
		Contrato contratoUm = new Contrato(servicoUm, clienteUm, funcionarioUm);
		Contrato contratoDois = new Contrato(servicoDois, clienteDois, funcionarioDois);
		Contrato contratoTres = new Contrato(servicoTres, clienteTres, funcionarioTres);
		
		Agrupamento<Contrato> agrupamentoDeContratos = new Agrupamento<Contrato>();
		agrupamentoDeContratos.adicionar(contratoUm);
		agrupamentoDeContratos.adicionar(contratoDois);
		agrupamentoDeContratos.adicionar(contratoTres);

		System.out.println("-------------------------------------------------------------------");
		System.out.println("Lista inicial: "+agrupamentoDeContratos.toString());
		agrupamentoDeContratos.adicionar(new Contrato(servicoTres, clienteUm, funcionarioTres)); 
		agrupamentoDeContratos.adicionar(new Contrato(servicoTres, clienteDois, funcionarioDois));
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Lista após adição de dois contratos: "+agrupamentoDeContratos.toString());
		System.out.println("-------------------------------------------------------------------");
		agrupamentoDeContratos.reorganizarElementosLista(new OrdenamentoValorServicoPrestadoCrescente()); //Servicos são ordenados a partir do valorHora
		System.out.println("Lista após aplicação do metodo reorganização: "+agrupamentoDeContratos.toString());
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Teste remoção 'contratoUm': "); //Servico são comparados a partir do codigoServico
		System.out.println(agrupamentoDeContratos.remover(new Contrato(contratoUm.getCodigoPrestacaoServico())));
		System.out.println(agrupamentoDeContratos.toString());
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Verificar contrato 1: "+agrupamentoDeContratos.verificarExistencia(new Contrato(contratoUm.getCodigoPrestacaoServico())));
		System.out.println("Verificar contrato 3: "+agrupamentoDeContratos.verificarExistencia(new Contrato(contratoTres.getCodigoPrestacaoServico())));	
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
