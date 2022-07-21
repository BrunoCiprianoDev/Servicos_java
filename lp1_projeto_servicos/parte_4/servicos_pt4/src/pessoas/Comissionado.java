package pessoas;

public class Comissionado extends Funcionario {
	private double taxaDeComissao;
	private double totalEmServicos;
	
	public Comissionado(String nome, String sobrenome, String email, boolean sexo, double taxaDeComissao, double totalEmServicos) {
		super(nome, sobrenome, email, sexo);
		this.taxaDeComissao = taxaDeComissao;
		this.totalEmServicos = totalEmServicos;
	}
	
	public Comissionado(String codigoFuncionario, String nome, String sobrenome, String email, boolean sexo, double taxaDeComissao, double totalEmServicos) {
		super(codigoFuncionario, nome, sobrenome, email, sexo);
		this.taxaDeComissao = taxaDeComissao;
		this.totalEmServicos = totalEmServicos;
	}

	public Comissionado(Comissionado comissionado) {
		super(comissionado);
		this.taxaDeComissao = comissionado.getTaxaDeComissao();
		this.totalEmServicos = comissionado.getTotalEmServicos();
	}

	public double getTaxaDeComissao() {
		return this.taxaDeComissao;
	}
	
	public void setTaxaDeComissao(double taxaDeComissao) {
		this.taxaDeComissao = taxaDeComissao;
	}
	
	public double getTotalEmServicos() {
		return this.totalEmServicos;
	}
	
	public void setTotalEmServicos(double totalEmServicos) {
		this.totalEmServicos = totalEmServicos;
	}
	
	@Override
	public double calcularSalario() {
		return this.taxaDeComissao * this.totalEmServicos;
	}

	@Override
	public Comissionado getFuncionario() {
		Comissionado comissionado = new Comissionado(
				super.getCodigoFuncionario(),
				super.getNome(), 
				super.getSobrenome(), 
				super.getEmail(), 
				super.getSexo(),
				this.getTaxaDeComissao(),
				this.getTotalEmServicos());		
		return comissionado;
	}
	
}
