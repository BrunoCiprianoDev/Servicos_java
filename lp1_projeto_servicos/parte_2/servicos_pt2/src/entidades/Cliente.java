package entidades;

public class Cliente {
	private static int parametroCodigo = 0;
	private String codigoCliente;
	private String nome;
	private String sobrenome;
	private String email;
	private String sexo;
	
	public Cliente(String nome, String sobrenome, String email, String sexo) {
		this.codigoCliente = "C"+(++parametroCodigo);
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.sexo = sexo;
	}
	
	public String getCodigoCliente() {
		return this.codigoCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "\n Código do cliente: "+this.codigoCliente+
				"\n Nome do cliente: "+this.nome+" "+this.sobrenome+
				"\n E-mail: "+this.email+
				"\n Sexo: "+this.sexo;
	}
}
