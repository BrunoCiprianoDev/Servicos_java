package entidades;

import java.time.LocalDate;

public class Contrato {
	
	private static LocalDate parametroData = LocalDate.now();
	private static int parametroCodigo = 0;
	private String codigoPrestacaoServico;
	private int anoInicioContrato;
	private int mesInicioContrato;
	private Servico servico;
	private Cliente cliente;
	private Funcionario funcionario;
	
	public Contrato(Servico servico, Cliente cliente, Funcionario funcionario) {
		this.gerarCodigoPrestacaoServico();
		this.mesInicioContrato = Contrato.parametroData.getMonthValue();
		this.anoInicioContrato = Contrato.parametroData.getYear(); 
		this.servico = servico;
		this.cliente = cliente;
		this.funcionario = funcionario;
	}
	
	public Contrato(Contrato contrato) {
		this.codigoPrestacaoServico = contrato.getCodigoPrestacaoServico();
		this.anoInicioContrato = contrato.anoInicioContrato;
		this.mesInicioContrato = contrato.mesInicioContrato;
		this.servico = contrato.getServico();
		this.cliente = contrato.getCliente();
		this.funcionario = contrato.getFuncionario();
	}	
	
	private void gerarCodigoPrestacaoServico() {
		if(Contrato.parametroData.getYear() != LocalDate.now().getYear()) {
			Contrato.parametroData = LocalDate.now();
			Contrato.parametroCodigo = 0;
		}
		this.codigoPrestacaoServico = Contrato.parametroData.getYear()+"-"+(++Contrato.parametroCodigo);	
	}
	
	public String getCodigoPrestacaoServico() {
		return this.codigoPrestacaoServico;
	}

	public int getAnoInicioContrato() {
		return anoInicioContrato;
	}

	public int getMesInicioContrato() {
		return mesInicioContrato;
	}
	
	public Servico getServico() {
		return new Servico(this.servico);
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public Cliente getCliente() {
		return new Cliente(this.cliente);
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return this.funcionario;
	}
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public String toString() {
		return "\n Código de prestação serviço: "+this.codigoPrestacaoServico+
				"\n Mês de inicio do contrato: "+this.mesInicioContrato+
				"\n Ano de inicio do contrato: "+this.anoInicioContrato+
				"\n"+cliente.toString()+
				"\n"+funcionario.toString()+
				" ("+IdentificadorFuncionario.getIdentificacao(this.funcionario)+
				")\n"+servico.toString();
	}

}
