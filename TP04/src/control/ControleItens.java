package control;

import model.*;

public class ControleItens {
	private Itens[] it;
	private int numItens;

	public ControleItens(ControleDados d) {
		it = d.getItens();
		numItens = d.getNumItens();
	}

	public String[] getNomeItens() {
		String[] s = new String[numItens];
		for(int i = 0; i < numItens; i++) {
			s[i] = it[i].getNomeProduto();
		}

		return s;
	}
	public int getNum() {
		return numItens;
	}

	public void setNum(int num) {
		this.numItens = num;
	}

	public String getNomeProduto(int i) {		
		return it[i].getNomeProduto();
	}

	public String getTipoUnidade(int i) {
		String tipoUnidade = String.valueOf(it[i].getTipoUnidade());
		return tipoUnidade;
	}

	public double getPreco(int i) {
		return it[i].getPreco();
	}

	public String getSetor(int i) {
		String setor = String.valueOf(it[i].getSetor());
		return setor;
	}
	
	public Unidade getUnidade(int i) {
		return it[i].getUnidade();
	}
	
	public int getQuantidade(int i) {
		return it[i].getQuantidade();
	}
	

}
