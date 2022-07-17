package entidades;

public abstract class Funcionario extends Pessoa {
	private static int parametroCodigoFuncionario = 0;
	private String codigoFuncionario;
	
	public Funcionario(String nome, String sobrenome, String email, boolean sexo) {
		super(nome, sobrenome, email, sexo);
		this.codigoFuncionario = this.gerarCodigo();
	}
	
	public Funcionario(Funcionario funcionario) {
		super(funcionario);
		this.codigoFuncionario = funcionario.codigoFuncionario;
	}
	
	public String getCodigoFuncionario() {
		return this.codigoFuncionario;
	}
	
	public abstract double calcularSalario();
	
	@Override
	public String toString() {
		return "\n Código do funcionario: "+this.codigoFuncionario+
				"\n Nome do funcionario: "+this.getNome()+" "+this.getSobrenome()+
				super.toString();
	}

	@Override
	public String tratarNome() {
			return (this.getSexo()==true) ? 
					"Prezado senhor "+this.getNome()+" "+this.getSobrenome() :
					"Prezada senhora "+this.getNome()+" "+this.getSobrenome() ;
	}
	
	@Override
	public String gerarCodigo() {
		return "F"+(++parametroCodigoFuncionario);
	}
	
	
}
