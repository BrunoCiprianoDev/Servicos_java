package identificadores;

import contratos.Contrato;

public class IdentificadorFuncionario {
	public static String getIdentificacao(Contrato contrato) {
		return "Funcionário "+contrato.getFuncionario().getClass().getSimpleName();
	}
}
