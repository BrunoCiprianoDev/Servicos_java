package pessoas;

import interfaces.TratadorDeNomes;

public class Cliente extends Pessoa implements TratadorDeNomes {
	private static int parametroCodigoCliente = 0;
	private String codigoCliente;
	
	public Cliente(String nome, String sobrenome, String email, boolean sexo) {
		super(nome, sobrenome, email, sexo);
		this.codigoCliente = this.gerarCodigo();	
	}
	
	public Cliente(Cliente cliente) {
		super(cliente);
		this.codigoCliente = cliente.getCodigoCliente();
	}
	
	public String getCodigoCliente() {
		return this.codigoCliente;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(this == obj) return true;
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		Cliente cliente = (Cliente) obj;	
		return codigoCliente != null && codigoCliente.equals(cliente.codigoCliente);
	}
	
	@Override
	public int hashCode() {
		return codigoCliente == null ? 0 : this.codigoCliente.hashCode();
	}

	@Override
	public String toString() {
		return "\n Código do cliente: "+this.getCodigoCliente()+
				"\n Nome do cliente: "+this.getNome()+" "+this.getSobrenome()+
				super.toString();
	}

	@Override
	public String tratarNome() {
		return (this.getSexo()==true) ? 
				"Prezado Senhor "+this.getSobrenome():
				"Prezada Senhora "+this.getSobrenome();
	}

	@Override
	public String gerarCodigo() {	
		return "C"+(++parametroCodigoCliente);
	}
}
