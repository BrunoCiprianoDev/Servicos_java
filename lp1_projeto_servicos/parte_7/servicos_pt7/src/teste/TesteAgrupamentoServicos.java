package teste;

import exceptions.TotalHorasException;
import listas.Agrupamento;
import services.Servico;

public class TesteAgrupamentoServicos {
	public static void main(String[] args) {
		
		// O objetivo desse teste é verificar o funcionamento dos métodos da classe Agrupamento<> para Servicos
		Servico servicoUm = novoServico("Limpeza da fachada", 40, 5, 110);
		Servico servicoDois = novoServico("Limpeza condominio", 50, 5, 120);
		Servico servicoTres = novoServico("Limpeza piscina", 60, 5, 130);
		Servico servicoQuatro = novoServico("Limpeza piscina grande", 70, 5, 140);
		Servico servicoCinco = novoServico("Limpeza piscina pequena", 80, 5, 150);		
	
		Agrupamento<Servico> agrupamentoServicos = new Agrupamento<Servico>();
		agrupamentoServicos.adicionar(servicoUm);
		agrupamentoServicos.adicionar(servicoDois);
		agrupamentoServicos.adicionar(servicoTres);
		agrupamentoServicos.adicionar(servicoQuatro);
		agrupamentoServicos.adicionar(servicoCinco);
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Lista inicial: "+agrupamentoServicos.toString());
		agrupamentoServicos.adicionar(novoServico("Limpeza quintal", 50, 5, 100)); 
		agrupamentoServicos.adicionar(novoServico("Limpeza janelas", 50, 5, 100));
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Lista após adição de dois Servicos: "+agrupamentoServicos.toString());
		System.out.println("-------------------------------------------------------------------");
		agrupamentoServicos.reorganizarElementosLista(null); //Servicos são ordenados a partir do valorHora
		System.out.println("Lista após aplicação do metodo reorganização: "+agrupamentoServicos.toString());
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Teste remoção 'servicoUm': "); //Servico são comparados a partir do codigoServico
		System.out.println(agrupamentoServicos.remover(new Servico(servicoUm.getCodigoServico())));
		System.out.println(agrupamentoServicos.toString());
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Verificar servico 5: "+agrupamentoServicos.verificarExistencia(new Servico(servicoCinco.getCodigoServico())));
		System.out.println("Verificar servico 1: "+agrupamentoServicos.verificarExistencia(new Servico(servicoUm.getCodigoServico())));
		
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
