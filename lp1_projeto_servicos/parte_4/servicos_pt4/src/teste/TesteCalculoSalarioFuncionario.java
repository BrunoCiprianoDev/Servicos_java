package teste;

import pessoas.Assalariado;
import pessoas.Comissionado;
import pessoas.Horista;
import services.Servico;

public class TesteCalculoSalarioFuncionario {
	public static void main(String[] args) {
		//Teste para o método 'calcularSalario()':
		Servico servicoUm = new Servico("Limpeza condominio", 50, 7, 36.5);
		Servico servicoDois = new Servico("Limpeza condominio", 140, 7, 36.5);
		Servico servicoTres = new Servico("Limpeza piscina", 50, 35, 38);
		
		Assalariado funcionarioUm = new Assalariado("Fulano", "de Tal", "ciclano911@empresa.com.br", true, 1100);
		Comissionado funcionarioDois = new Comissionado("Érbio", "Periodico", "er981@empresa.com.br", true, 0.25);
		Horista funcionarioTres = new Horista("TypewriterWoman", "Mouse", "benzenoo981@empresa.com.br", true, 25);
		
		System.out.println("funcionarioUm: "+funcionarioUm.calcularSalario(servicoUm));
		System.out.println("funcionarioDois: "+funcionarioDois.calcularSalario(servicoDois));
		System.out.println("funcionarioTres: "+funcionarioTres.calcularSalario(servicoTres));
	}
}
