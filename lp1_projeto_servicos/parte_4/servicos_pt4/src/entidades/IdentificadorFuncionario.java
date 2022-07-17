package entidades;

public class IdentificadorFuncionario {
	public static String getIdentificacao(Funcionario funcionario) {
		return "Funcionário "+funcionario.getClass().getSimpleName();
	}
}
