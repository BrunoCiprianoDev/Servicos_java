package pessoas;
import services.Servico;

public class Assalariado extends Funcionario {
	
	private double salario;

	public Assalariado(String nome, String sobrenome, String email, boolean sexo, double salario) {
		super(nome, sobrenome, email, sexo);
		this.salario = salario;
	}
	
	public Assalariado(String codigoFuncionario, String nome, String sobrenome, String email, boolean sexo, double salario) {
		super(codigoFuncionario, nome, sobrenome, email, sexo);
		this.salario = salario;
	}
	
	public Assalariado(Assalariado assalariado) {
		super(assalariado);
		this.salario = assalariado.getSalario();	
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public double calcularSalario(Servico servico) {
		return this.salario;
	}

	@Override
	public Assalariado getFuncionario() {
			Assalariado assalariado = new Assalariado(
					super.getCodigoFuncionario(),
					super.getNome(), 
					super.getSobrenome(), 
					super.getEmail(), 
					super.getSexo(),
					this.getSalario());	
			return assalariado;
	}
	
}
