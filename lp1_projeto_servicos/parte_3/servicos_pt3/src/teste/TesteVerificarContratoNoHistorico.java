package teste;

import entidades.Cliente;
import entidades.Contrato;
import entidades.Funcionario;
import entidades.Historico;
import entidades.Servico;

public class TesteVerificarContratoNoHistorico {
	public static void main(String[] args) {
		/*Teste método 'verificarExistenciaDeUmContrato(codigoPrestacaoServico)' da classe Historico*/
		Servico servicoUm = new Servico("Limpeza da fachada", 45, 5, 6);
		Servico servicoDois = new Servico("Limpeza condominio", 50, 7, 6.5);
		Servico servicoTres = new Servico("Limpeza piscina", 70, 3, 3);
		Servico servicoQuatro = new Servico("Limpeza vidraça", 50, 4, 4);
	
		Cliente clienteUm = new Cliente("José", "da Sila", "dasilva981@ig.com.br", "masculino");
		Cliente clienteDois = new Cliente("Maria", "da Silva", "masilva980@ig.com.br", "feminino");
		Cliente clienteTres = new Cliente("Lucia", "Ribeiro", "ribeiro987@oi.com.br", "femino");
		Cliente clienteQuatro = new Cliente("Adenosina", "Trifosfato", "atplva987@uai.com.br", "feminino");

		Funcionario funcionarioUm = new Funcionario("Fulano", "de Tal", "ciclano911@empresa.com.br", "masculino");
		Funcionario funcionarioDois = new Funcionario("Érbio", "Periodico", "er981@empresa.com.br", "masculino");
		Funcionario funcionarioTres = new Funcionario("TypewriterWoman", "Mouse", "benzenoo981@empresa.com.br", "feminino");
		Funcionario funcionarioQuatro = new Funcionario("Fulana", "de Tal", "ciclana981@empresa.com.br", "feminino");

		Contrato contratoUm = new Contrato(servicoUm, clienteUm, funcionarioUm);
		Contrato contratoDois = new Contrato(servicoDois, clienteDois, funcionarioDois);
		Contrato contratoTres = new Contrato(servicoTres, clienteTres, funcionarioTres);
		Contrato contratoQuatro = new Contrato(servicoQuatro, clienteQuatro, funcionarioQuatro);
		
		Historico historico = new Historico(contratoUm);
		historico.adicionarContrato(contratoDois);
		historico.adicionarContrato(contratoTres);
		historico.adicionarContrato(contratoQuatro);
		
		/*Adicionando o codigo de prestação de servico de cada objeto Contrato em variaveis: */
		String codigoContratoUm = contratoUm.getCodigoPrestacaoServico();
		String codigoContratoDois = contratoDois.getCodigoPrestacaoServico();
		String codigoContratoTres = contratoTres.getCodigoPrestacaoServico();
		String codigoContratoQuatro = contratoQuatro.getCodigoPrestacaoServico();
		
		/*Verificação de cada contrato no Histórico com base no codigo de cada um: */
		System.out.println("Verificar contratoUm: "+historico.verificarExistenciaDeUmContrato(codigoContratoUm));
		System.out.println("Verificar contratoDois: "+historico.verificarExistenciaDeUmContrato(codigoContratoDois));
		System.out.println("Verificar contratoTres: "+historico.verificarExistenciaDeUmContrato(codigoContratoTres));
		System.out.println("Verificar contratoQuatro: "+historico.verificarExistenciaDeUmContrato(codigoContratoQuatro));
		System.out.println("Verificar contratoAleatorio: "+historico.verificarExistenciaDeUmContrato("2022-5"));
		
	}
}
