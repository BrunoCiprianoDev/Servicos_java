package entidades;

import java.util.ArrayList;

public class Historico {

	private ArrayList<Contrato> listaDeContratos;
	
	public Historico(Contrato contrato) {
		this.listaDeContratos = new ArrayList<>();
		this.listaDeContratos.add(contrato);
	}
	
	public double calcularFaturamentoTotalPrevisto() {
		double totalOrcamentos = 0;
		for(Contrato contrato: this.listaDeContratos) {
			totalOrcamentos += contrato.getServico().calcularValorOrcamento();
		}
		 return totalOrcamentos;
	}
	
	public double calcularTotalEfetivamentePago() {
		double totalEfetivamentePago = 0;
		for(Contrato contrato : this.listaDeContratos) {
			totalEfetivamentePago += contrato.getServico().calcularValorEfetivamentePago();
		}
		 return totalEfetivamentePago;
	}
	
	public void setContrato(Contrato contrato) {
		listaDeContratos.add(contrato);
	}
	
	public ArrayList<Contrato> getContratos() {
		return new ArrayList<Contrato>(this.listaDeContratos);
	}
	
	public boolean removerContrato(String codigoPrestacaoServico) {
		for(Contrato contrato : this.listaDeContratos) {
			if(codigoPrestacaoServico.equals(contrato.getCodigoPrestacaoServico())) {
				this.listaDeContratos.remove(contrato);
				return true;
			}
		}
		return false;
	}
	
	public boolean verificarExistenciaDeUmContrato(String codigoPrestacaoServico) {
		for(Contrato contrato : this.listaDeContratos) {
			if(codigoPrestacaoServico.equals(contrato.getCodigoPrestacaoServico())) {
				return true;
			}
		}
		return false;
	}
	
	public String informacoesDeUmDeterminadoContrato(String codigoPrestacaoServico) {
		for(Contrato contrato : this.listaDeContratos) {
			if(codigoPrestacaoServico.equals(contrato.getCodigoPrestacaoServico())) {
				return contrato.toString();
			}
		}
		return "Contrato não econtrado no histórico!";
	}
	
	@Override
	public String toString() {
		String texto = "\n";
		double totaOrcamento = 0;
		double totalEfetivamentePago = 0;
		for(Contrato contrato : this.listaDeContratos) {
			texto = texto.concat(contrato.toString()+"\n-----------------------------------------------------------\n");
			totaOrcamento += contrato.getServico().calcularValorOrcamento();
			totalEfetivamentePago += contrato.getServico().calcularValorEfetivamentePago();
		}
		return texto.concat(" Total previsto nos orçamentos: $"+totaOrcamento+"\n Total efetivamente recebido: $"+totalEfetivamentePago);
	}

}
