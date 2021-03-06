package entidades;
public class Funcionario {
	private static int parametroCodigo = 0;
	private String codigoFuncionario;
	private String nome;
	private String sobrenome;
	private String email;
	private String sexo;
	
	public Funcionario(String nome, String sobrenome, String email, String sexo) {
		this.codigoFuncionario = "F"+(++parametroCodigo);
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.sexo = sexo;
	}
	
	public Funcionario(Funcionario funcionario) {
		this.codigoFuncionario = funcionario.getCodigoFuncionario();
		this.nome = funcionario.nome;
		this.sobrenome = funcionario.sobrenome;
		this.email = funcionario.email;
		this.sexo = funcionario.sexo;
	}
	
	
	public String getCodigoFuncionario() {
		return this.codigoFuncionario;
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
		return  "\n Código do funcionario: "+this.codigoFuncionario+
				"\n Nome do funcionario: "+this.nome+" "+this.sobrenome+
				"\n E-mail: "+this.email+
				"\n Sexo: "+this.sexo;
	}
}
