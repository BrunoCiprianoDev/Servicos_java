package exceptions;

public class TotalHorasException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public TotalHorasException() {
		super("Número de horas totais invalido.");
	}
	
	public TotalHorasException(String mensagem) {
		super(mensagem);
	}
	
	
}
