package model;

public abstract class Mercado {
	protected int numItens = 0;
	protected double valorTotal;
	protected Itens itens;
	
	public void setItens(Itens itens) {
		this.itens = itens;
	}
	
	public int getNumItens() {
		return numItens;
	}
	
	public void setNumItens(int numItens) {
		this.numItens = numItens;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	

}
