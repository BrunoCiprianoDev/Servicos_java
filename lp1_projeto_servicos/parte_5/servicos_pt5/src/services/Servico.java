package services;

import exceptions.TotalHorasException;

public class Servico {
	private static int parametroCodigo = 0;
	private String codigoServico;
	private String descricao;
	private double valorHora;
	private double horasPrevistas;
	private double horasTrabalhadas;
	
	public Servico(String descricao, double valorHora, double horasPrevistas, double horasTrabalhadas){
		this.codigoServico = "S"+(++Servico.parametroCodigo);
		this.descricao = descricao;
		this.valorHora = valorHora;
		setHorasPrevistas(horasPrevistas);
		setHorasTrabalhadas(horasTrabalhadas);	
	}
	
	public Servico(Servico servico) {
		this.codigoServico = servico.codigoServico;
		this.descricao = servico.descricao;
		this.valorHora = servico.valorHora;
		this.horasPrevistas = servico.horasPrevistas;
		this.horasTrabalhadas = servico.horasTrabalhadas;
	}
	
	public double calcularValorOrcamento() {
		return this.horasPrevistas * this.valorHora;
	}
	
	public double calcularValorEfetivamentePago() {
		return this.horasTrabalhadas * this.valorHora;
	}
	
	public String getCodigoServico() {
		return this.codigoServico;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {	
		this.valorHora = valorHora;
	}

	public double getHorasPrevistas() {
		return horasPrevistas;
	}

	public void setHorasPrevistas(double horasPrevistas) throws TotalHorasException{
		if(horasPrevistas > 2400) {throw new TotalHorasException("Esse valor não pode ser maior que 2400 horas");}
		this.horasPrevistas = horasPrevistas;
		/**
		 * @Param horasPrevistas não pode ser maior que 2400
		 * @throws TotalHorasException caso horasPrevistas > 2400
		 * @return
		 */
		
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas)throws TotalHorasException {
		if(horasTrabalhadas > 2400) {throw new TotalHorasException("Esse valor não pode ser maior que 2400 horas");}
		this.horasTrabalhadas = horasTrabalhadas;
		/**
		 * @Param horasTrabalhadas não pode ser maior que 2400
		 * @throws TotalHorasException caso horasTrabalhadas > 2400
		 * @return
		 */
	}

	@Override
	public String toString() {
		return  "\n Código do serviço: "+this.codigoServico+
				"\n Descrição serviço: "+this.descricao+
				"\n Valor cobrado pela hora: R$"+this.valorHora+
				"\n Total de horas previstas: "+this.horasPrevistas+
				"\n Total horas trabalhadas: "+this.horasTrabalhadas+
				"\n Valor do orçamento: $"+this.calcularValorOrcamento()+
				"\n Valor efetivamente pago: $"+this.calcularValorEfetivamentePago();
	}
}
