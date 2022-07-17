package entidades;

public class Horista extends Funcionario {
	private double salarioHora;
	private double totalHorasTrabalhadas;

	public Horista(String nome, String sobrenome, String email, boolean sexo, double salarioHora, double totalHorasTrabalhadas) {
		super(nome, sobrenome, email, sexo);
		this.salarioHora = salarioHora;
		this.totalHorasTrabalhadas = totalHorasTrabalhadas;
	}
	
	public Horista(Funcionario funcionario) {
		super(funcionario);
	}

	public double getSalarioHora() {
		return this.salarioHora;
	}
	
	public void setSalario(double salarioHora) {
		this.salarioHora = salarioHora;
	}
	
	public double getTotalHorasTrabalhadas() {
		return this.totalHorasTrabalhadas;
	}
	
	public void setTotalHorasTrabalhadas(double totalHorasTrabalhadas) {
		this.totalHorasTrabalhadas = totalHorasTrabalhadas;
	}
	
	@Override
	public double calcularSalario() {
		return this.salarioHora * this.totalHorasTrabalhadas;
	}


}
