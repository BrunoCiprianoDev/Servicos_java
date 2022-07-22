package pessoas;

public class Horista extends Funcionario {
	private double salarioHora;
	private double totalHorasTrabalhadas;

	public Horista(String nome, String sobrenome, String email, boolean sexo, double salarioHora, double totalHorasTrabalhadas) {
		super(nome, sobrenome, email, sexo);
		this.salarioHora = salarioHora;
		this.totalHorasTrabalhadas = totalHorasTrabalhadas;
	}
	
	public Horista(String codigoFuncionario, String nome, String sobrenome, String email, boolean sexo, double salarioHora, double totalHorasTrabalhadas) {
		super(codigoFuncionario, nome, sobrenome, email, sexo);
		this.salarioHora = salarioHora;
		this.totalHorasTrabalhadas = totalHorasTrabalhadas;
	}
	
	
	public Horista(Horista horista) {
		super(horista);
		this.salarioHora = horista.salarioHora;
		this.totalHorasTrabalhadas = horista.totalHorasTrabalhadas;
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
	public Horista getFuncionario() {
		Horista horista = new Horista(
				super.getCodigoFuncionario(),
				super.getNome(), 
				super.getSobrenome(), 
				super.getEmail(), 
				super.getSexo(),
				this.getSalarioHora(),
				this.getTotalHorasTrabalhadas());	
		return horista;
	}
	
	@Override
	public double calcularSalario() {
		return this.salarioHora * this.totalHorasTrabalhadas;
	}

}
