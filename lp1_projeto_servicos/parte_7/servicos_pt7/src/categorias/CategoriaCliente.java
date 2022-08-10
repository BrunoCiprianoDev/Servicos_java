package categorias;

public class CategoriaCliente {
	private char categoria;
	private double totalServicos;
	
	public CategoriaCliente(double totalServicos) {
		this.totalServicos = totalServicos;
		this.categoria = definirCategoria();	
	}
	
	public CategoriaCliente(CategoriaCliente categoriaCliente) {
		this.categoria = categoriaCliente.getCategoria();
		this.totalServicos = categoriaCliente.getTotalServicos();
	}
		
	public char getCategoria() {
		return categoria;
	}

	public double getTotalServicos() {
		return totalServicos;
	}

	public void setTotalServicos(double totalServicos) {
		this.totalServicos = totalServicos;
		this.categoria = definirCategoria(); 
	}
	
	public void adicionarValorServico(double valorServico) {
		this.totalServicos += valorServico;
		this.categoria = definirCategoria();
	}

	public char definirCategoria() {
		if(this.totalServicos > 30000) {
			return 'A';
		}else if(this.totalServicos > 10000) {
			return 'B';
		}
		return 'C';
	}
	
}
