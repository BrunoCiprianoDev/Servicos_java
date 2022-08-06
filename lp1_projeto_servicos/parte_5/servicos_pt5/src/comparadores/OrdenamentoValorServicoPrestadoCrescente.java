package comparadores;
import java.util.Comparator;

import contratos.Contrato;

public class OrdenamentoValorServicoPrestadoCrescente implements Comparator<Contrato> {

	@Override
	public int compare(Contrato contratoUm, Contrato contratoDois) {
		if(contratoUm.getServico().getHorasTrabalhadas() > contratoDois.getServico().getHorasTrabalhadas()) {
			return 1;
		}else if(contratoUm.getServico().getHorasTrabalhadas() < contratoDois.getServico().getHorasTrabalhadas()) {
			return -1;
		}
		return 0;
	}

}
