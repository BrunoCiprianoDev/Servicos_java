package teste;
import entidades.Contrato;
public class Teste {
	public static void main(String[] args) {
		Contrato contrato = new Contrato("José da Silva", "Limpeza da fachada do edifício", "Fulano da Silva");
		System.out.println(contrato.toString());
	}
}
