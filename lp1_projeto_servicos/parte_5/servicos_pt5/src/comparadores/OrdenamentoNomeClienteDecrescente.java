package comparadores;
import java.util.Comparator;

import contratos.Contrato;

public class OrdenamentoNomeClienteDecrescente implements Comparator<Contrato>{

	@Override
	public int compare(Contrato contratoUm, Contrato contratoDois) {
		return -(contratoUm.getCliente().getNome().compareTo(contratoDois.getCliente().getNome()));
	}
}
