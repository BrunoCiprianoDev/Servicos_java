package identificadores;

import contratos.Contrato;

public class IdentificadorFuncionario {
	public static String getIdentificacao(Contrato contrato) {
		return "Funcionário "+contrato.getFuncionario().getClass().getSimpleName();
	}
	/*Item 5(Parte 4): "Crie uma classe de nome IdentificadorDeFuncionario que seja capaz de
	 * identificar o tipo de funcionário de um determinado contrato"*/
}
