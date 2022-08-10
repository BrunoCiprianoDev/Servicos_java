package listas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import categorias.CategoriaCliente;
import contratos.Contrato;

import pessoas.*;
public class RankingDeClientes {
	
	private Map<Cliente, CategoriaCliente> mapClienteCategoria;
	
	public RankingDeClientes(Agrupamento<Contrato> agrupamento) {
		this.mapClienteCategoria = new HashMap<Cliente, CategoriaCliente>();
		atualizarMapClienteTotalServicos(agrupamento);
	}
	
	public Map<Cliente, CategoriaCliente> getMapClienteCategoria() {
		return mapClienteCategoria;
	}

	public void setMapClienteCategoria(Map<Cliente, CategoriaCliente> mapClienteCategoria) {
		this.mapClienteCategoria = mapClienteCategoria;
	}

	public void atualizarMapClienteTotalServicos(Agrupamento<Contrato> agrupamento) {
		ArrayList<Contrato> listaDeContratos = agrupamento.getListaElementos();
		this.mapClienteCategoria.clear();
		for(Contrato contrato : listaDeContratos) {
			 Cliente cliente = contrato.getCliente();
			 if(this.mapClienteCategoria.containsKey(cliente)) {
				 CategoriaCliente categoriaCliente = this.mapClienteCategoria.get(cliente);
				 categoriaCliente.adicionarValorServico(contrato.getServico().calcularValorEfetivamentePago());
				 this.mapClienteCategoria.put(cliente, categoriaCliente);
			 }else {
				 this.mapClienteCategoria.put(cliente, new CategoriaCliente(contrato.getServico().calcularValorEfetivamentePago()));
			 }
		 }
	}	
	
	public String listarClientesTotaisServicosContratados() {
		String listagem = "";
		for(Entry<Cliente, CategoriaCliente> entry : this.mapClienteCategoria.entrySet()) {
			listagem = listagem.concat((entry.getKey().getNome()+" R$"+entry.getValue().getTotalServicos()+"\n"));
		}
		return listagem;
	}
	
	public char consultarCategoriaCliente(Cliente cliente) {
		if(this.mapClienteCategoria.containsKey(cliente)) {
			return this.mapClienteCategoria.get(cliente).getCategoria();
		}
		return '0';		
	}
	
	public double consultarValorTotalServicosCliente(Cliente cliente) {
		if(this.mapClienteCategoria.containsKey(cliente)) {
			return this.mapClienteCategoria.get(cliente).getTotalServicos();
		}
		return 0;	
	}

}
