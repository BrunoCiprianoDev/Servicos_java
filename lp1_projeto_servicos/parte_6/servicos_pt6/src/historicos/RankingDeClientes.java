package historicos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import contratos.Contrato;
import pessoas.*;
public class RankingDeClientes {
	
	private Map<Cliente, Double> clienteTotalServicos;
	
	public RankingDeClientes(Historico historico) {
		this.setClienteTotalServicos(calcularTotalServicosDeClientes(historico));
	}
	
	public Map<Cliente, Double> getClienteTotalServicos() {
		return clienteTotalServicos;
	}

	private void setClienteTotalServicos(Map<Cliente, Double> clienteTotalServicos) {
		this.clienteTotalServicos = clienteTotalServicos;
	}
	
	public void atualizarEstrutura(Historico historico) {
		this.setClienteTotalServicos(calcularTotalServicosDeClientes(historico));
	}
	
	public Map<Cliente, Double> calcularTotalServicosDeClientes(Historico historico) {
		ArrayList<Contrato> listaDeContratos = historico.getListaDeContratos();
		Map<Cliente, Double> mapTotalCliente = new HashMap<Cliente, Double>();
		for(Contrato contrato : listaDeContratos) {
			 Cliente cliente = contrato.getCliente();
			 if(mapTotalCliente.containsKey(cliente)) {
				 double valorAtualChave = mapTotalCliente.get(cliente);
				 double novoValorChave = valorAtualChave + contrato.getServico().calcularValorEfetivamentePago();
				 mapTotalCliente.replace(cliente, valorAtualChave , novoValorChave);
			 }else {
				 mapTotalCliente.put(cliente, contrato.getServico().calcularValorEfetivamentePago());
			 }
		 }
		return mapTotalCliente;	
	}
	
	public String listarClientesTotaisServicosContratados() {
		String listagem = "";
		for(Entry<Cliente, Double> entry : this.clienteTotalServicos.entrySet()) {
			listagem = listagem.concat((entry.getKey().getNome()+" R$"+entry.getValue()+"\n"));
		}
		return listagem;
	}
	
	public Double consultarValorTotalDosServicosCliente(Cliente cliente) {
		return this.clienteTotalServicos.get(cliente);
	}
	
	public String consultarCategoriaCliente(Cliente cliente) {
		if(this.clienteTotalServicos.get(cliente) > 30000) {
			return "Categoria A";
		}else if(this.clienteTotalServicos.get(cliente) > 10000) {
			return "Categoria B";
		}
		return "Categoria C";
	}


}
