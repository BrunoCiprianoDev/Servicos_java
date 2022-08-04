package pessoas;

import interfaces.SalarioVariavel;
import services.Servico;

public class Horista extends Funcionario implements SalarioVariavel {
	
	private double salarioHora;

	public Horista(String nome, String sobrenome, String email, boolean sexo, double salarioHora) {
		super(nome, sobrenome, email, sexo);
		this.salarioHora = salarioHora;
	}
		
	public Horista(String codigoFuncionario, String nome, String sobrenome, String email, boolean sexo, double salarioHora) {
		super(codigoFuncionario, nome, sobrenome, email, sexo);
		this.salarioHora = salarioHora;
	}
	
	
	public Horista(Horista horista) {
		super(horista);
		this.salarioHora = horista.salarioHora;
	}

	public double getSalarioHora() {
		return this.salarioHora;
	}
	
	public void setSalario(double salarioHora) {
		this.salarioHora = salarioHora;
	}
	
	@Override
	public Horista getFuncionario() {
		Horista horista = new Horista(
				super.getCodigoFuncionario(),
				super.getNome(), 
				super.getSobrenome(), 
				super.getEmail(), 
				super.getSexo(),
				this.getSalarioHora());	
		return horista;
	}
	
	@Override
	public double calcularSalario(Servico servico) {
		return this.salarioHora * servico.getHorasTrabalhadas();
	}

}
