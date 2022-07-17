package entidades;

public class Contrato {
	private String cliente;
	private String servico;
	private String funcionario;
	
	public Contrato(String cliente, String servico, String funcionario) {
		this.cliente = cliente;
		this.servico = servico;
		this.funcionario = funcionario;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public String getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public String toString() {
		return "Cliente: "+this.cliente+" - Serviço: "+this.servico+"\nFuncionário responsavel: "+this.funcionario;
	}
}
