package entidades;

public class Cliente extends Pessoa {
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
	public String toString() {
		return "\n Código do cliente: "+this.getCodigoCliente()+
				"\n Nome do cliente: "+this.getNome()+" "+this.getSobrenome()+
				super.toString();
	}

	@Override
	public String tratarNome() {
		return (this.getSexo()==true) ? 
				"Senhor "+this.getNome():
				"Senhora "+this.getNome();
	}

	@Override
	public String gerarCodigo() {	
		return "C"+(++parametroCodigoCliente);
	}
}
