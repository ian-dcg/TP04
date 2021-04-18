package model;

public class Dados {
	private Itens[] itens = new Itens[50];
	private int numItens = 0;
	private Setor[] setor = new Setor[50];
	private int qtdStr = 0;
	//private Unidade[] unidade = new Unidade[50];
	//private Preco[] preco = new preco[50];
	//private double PrecoTotal;
	
	
	public void preencherDadosAleatorios() {
		for (int i = 0 ; i < 3; i++) {
			setor[i] = new Setor ("Setor"+i, 1);
			itens[i] = new Itens("Item"+i, i*1.11, "Unidade"+i, i, setor[i]);
		}
		numItens = 5;
	}
	
	public Itens[] getItens() {
		return itens;
	}
	
	public void setItens(Itens[] itens) {
		this.itens = itens;
	}
	
	public void inserirEditarItens(Itens it, int pos) {
		this.itens[pos] = it;
		if(pos == numItens) numItens++;
	}
	
	public int getNumItens() {
		return numItens;
	}
	
	public void setNumItens(int numItens) {
		this.numItens = numItens;
	}
	
	public Setor[] getSetor() {
		return setor;
	}
	
	public void setSetor(Setor[] setor) {
		this.setor = setor;
	}
	
	public int getQtdStr() {
		return qtdStr;
	}
	
	public void setQtdStr(int qtdStr) {
		this.qtdStr = qtdStr;
	}

}
