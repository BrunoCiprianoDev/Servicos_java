package teste;

import pessoas.Assalariado;
import pessoas.Comissionado;
import pessoas.Horista;

public class TesteCalculoSalarioFuncionario {
	public static void main(String[] args) {
		
		//Teste focado no método calcular salário dos funcionários:
		Assalariado funcionarioUm = new Assalariado("Fulano", "de Tal", "ciclano911@empresa.com.br", true, 1100);
		Comissionado funcionarioDois = new Comissionado("Érbio", "Periodico", "er981@empresa.com.br", true, 0.05, 3000);
		Horista funcionarioTres = new Horista("TypewriterWoman", "Mouse", "benzenoo981@empresa.com.br", true, 15, 80);

		System.out.println(funcionarioUm.calcularSalario());
		System.out.println(funcionarioDois.calcularSalario());
		System.out.println(funcionarioTres.calcularSalario());
	}
}
