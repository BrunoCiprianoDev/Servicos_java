package entidades;

public class Historico {

	private Contrato[] listaDeContratos;
	private int contadorDeContratos = 0;
	
	/* Correção da parte 2: 
	 * Erro: A inicialização do array listaDeContratos não foi feita no contrutor
	 * Obs: correção realizada na linha 14;
	 * */
	
	public Historico(Contrato contrato, int tamanho) {
		this.listaDeContratos = new Contrato[tamanho];
		this.listaDeContratos[contadorDeContratos++] = contrato;
	}
	
	public double calcularFaturamentoTotalPrevisto() {
		double totalOrcamentos = 0;
		for(int i=0; i<this.contadorDeContratos; i++) {
			totalOrcamentos += this.listaDeContratos[i].getServico().calcularValorOrcamento();
		}
		 return totalOrcamentos;
	}
	
	public double calcularTotalEfetivamentePago() {
		double totalEfetivamentePago = 0;
		for(int i=0; i<this.contadorDeContratos; i++) {
			totalEfetivamentePago += this.listaDeContratos[i].getServico().calcularValorEfetivamentePago();
		}
		 return totalEfetivamentePago;
	}
	
	public void setContrato(Contrato contrato) {
		if((this.contadorDeContratos == this.listaDeContratos.length)) {
			Contrato[] listaTemporaria = new Contrato[this.listaDeContratos.length+5];
			for(int i=0; i<this.contadorDeContratos; i++) {
				listaTemporaria[i] = this.listaDeContratos[i]; 
			}
			this.listaDeContratos = listaTemporaria;
		}
		this.listaDeContratos[contadorDeContratos++] = contrato;
	}
	
	public Contrato[] getContratos() {
		return this.listaDeContratos;
	}
	
	public String informacoesDeUmDeterminadoContrato(String codigoPrestacaoServico) {
		// Item 12 -> retornar todas as informações pertinentes para um determinado contrato;
		for(int i=0; i<this.contadorDeContratos; i++) {
			if(codigoPrestacaoServico.equals(listaDeContratos[i].getCodigoPrestacaoServico())) {
				return this.listaDeContratos[i].toString();
			}
		}
		return "Contrato não econtrado no histórico!";
	}
	
	@Override
	public String toString() {
		String texto = "\n";
		double totaOrcamento = 0;
		double totalEfetivamentePago = 0;
		for(int i=0; i<this.contadorDeContratos; i++) {
			texto = texto.concat(this.listaDeContratos[i].toString()+"\n-----------------------------------------------------------\n");
			totaOrcamento += this.listaDeContratos[i].getServico().calcularValorOrcamento();
			totalEfetivamentePago += this.listaDeContratos[i].getServico().calcularValorEfetivamentePago();
		}
		return texto.concat(" Total previsto nos orçamentos: $"+totaOrcamento+"\n Total efetivamente recebido: $"+totalEfetivamentePago);
	}

}
