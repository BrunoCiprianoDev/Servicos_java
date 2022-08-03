package pessoas;

import interfaces.CalculadoraDeSalario;
import services.Servico;

public class Comissionado extends Funcionario implements CalculadoraDeSalario{
	
	private double taxaDeComissao;
	
	public Comissionado(String nome, String sobrenome, String email, boolean sexo, double taxaDeComissao) {
		super(nome, sobrenome, email, sexo);
		this.taxaDeComissao = taxaDeComissao;
	}
	
	public Comissionado(String codigoFuncionario, String nome, String sobrenome, String email, boolean sexo, double taxaDeComissao) {
		super(codigoFuncionario, nome, sobrenome, email, sexo);
		this.taxaDeComissao = taxaDeComissao;
	}

	public Comissionado(Comissionado comissionado) {
		super(comissionado);
		this.taxaDeComissao = comissionado.getTaxaDeComissao();
	}

	public double getTaxaDeComissao() {
		return this.taxaDeComissao;
	}
	
	public void setTaxaDeComissao(double taxaDeComissao) {
		this.taxaDeComissao = taxaDeComissao;
	}
		
	@Override
	public double calcularSalario(Servico servico) {
		return this.taxaDeComissao * servico.calcularValorEfetivamentePago();
	}
	

	@Override
	public Comissionado getFuncionario() {
		Comissionado comissionado = new Comissionado(
				super.getCodigoFuncionario(),
				super.getNome(), 
				super.getSobrenome(), 
				super.getEmail(), 
				super.getSexo(),
				this.getTaxaDeComissao());	
		return comissionado;
	}
	
}
