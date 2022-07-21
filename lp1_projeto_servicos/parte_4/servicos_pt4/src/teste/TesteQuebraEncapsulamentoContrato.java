package teste;


import contratos.Contrato;
import pessoas.Assalariado;
import pessoas.Cliente;
import pessoas.Comissionado;
import pessoas.Horista;
import services.Servico;

public class TesteQuebraEncapsulamentoContrato {
	public static void main(String...args) {	
		/*Esse teste é focado nos mecanismos que impedem a quebra de encapsulamento da classe Contrato. 
		 * -> Considerando que 'if(Obj1==Obj2)' compara os endereços de referencia de cada objeto;*/
		Servico servicoUm = new Servico("Limpeza da fachada", 45, 5, 6);
		Servico servicoDois = new Servico("Limpeza condominio", 50, 7, 6.5);
		Servico servicoTres = new Servico("Limpeza piscina", 70, 3, 3);
		
		Assalariado funcionarioUm = new Assalariado("Fulano", "de Tal", "ciclano911@empresa.com.br", true, 1100);
		Comissionado funcionarioDois = new Comissionado("Érbio", "Periodico", "er981@empresa.com.br", true, 0.05, 3000);
		Horista funcionarioTres = new Horista("TypewriterWoman", "Mouse", "benzenoo981@empresa.com.br", true, 15, 80);
		
		Cliente clienteUm = new Cliente("José", "da Sila", "dasilva981@ig.com.br", true);
		Cliente clienteDois = new Cliente("Maria", "da Silva", "masilva980@ig.com.br", false);
		Cliente clienteTres = new Cliente("Lucia", "Ribeiro", "ribeiro987@oi.com.br", false);
		
		Contrato contratoUm = new Contrato(servicoUm, clienteUm, funcionarioUm);
		Contrato contratoDois = new Contrato(servicoDois, clienteDois, funcionarioDois);
		Contrato contratoTres = new Contrato(servicoTres, clienteTres, funcionarioTres);
	
		/*Comparação entre os endereços apontado pelos objetos originais com aqueles retornados pelos contratos:*/		
		System.out.println("Teste método: 'contrato.getServico()'");
		System.out.println("ServicoUm & contratoUm.getServico(): "+((contratoUm.getServico() == servicoUm) ? "Endereços iguais": "Endereços diferentes"));
		System.out.println("ServicoDois & contratoDois.getServico(): "+((contratoDois.getServico() == servicoDois) ? "Endereços iguais": "Endereços diferentes"));
		System.out.println("ServicoTres & contratoTres.getServico(): "+((contratoTres.getServico() == servicoTres) ? "Endereços iguais": "Endereços diferentes")+"\n");
		
		System.out.println("Teste método: 'contrato.getCliente()'");
		System.out.println("ClienteUm & contratoUm.getCliente(): "+((contratoUm.getCliente() == clienteUm) ? "Endereços iguais": "Endereços diferentes"));
		System.out.println("ClienteDois & contatoDois.getCliente(): "+((contratoDois.getCliente() == clienteDois) ? "Endereços iguais": "Endereços diferentes"));
		System.out.println("ClienteTres & contratoTres.getCliente(): "+((contratoTres.getCliente() == clienteTres) ? "Endereços iguais": "Endereços diferentes")+"\n");
		
		System.out.println("Teste método: 'contrato.getFuncionario()'");
		System.out.println("FuncionarioUm & contratoUm.getFuncionario(): "+((contratoUm.getFuncionario() == funcionarioUm) ? "Endereços iguais": "Endereços diferentes"));
		System.out.println("FuncionarioDois & contratoDois.getFuncionario(): "+((contratoDois.getFuncionario() == funcionarioDois) ? "Endereços iguais": "Endereços diferentes"));
		System.out.println("FuncionarioTres & contratoTres.getFuncionario(): "+((contratoTres.getFuncionario() == funcionarioTres) ? "Endereços iguais": "Endereços diferentes"));		
	
		System.out.println(contratoUm.getFuncionario().toString());
	}
		
}
