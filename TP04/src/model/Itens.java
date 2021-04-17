package model;

public class Itens {
	private String nomeProduto;
	private double preco;
	private boolean checkCarrinho;
	private boolean checkCancelado;
	private Unidade quantidade;
	private Setor setor;

	//Sobrecarga
	public Itens(String p, Unidade qtd, double val, Setor s, boolean check, boolean cCancelado) {
		nomeProduto = p;
		quantidade = qtd;
		preco = val;
		setor = s;
		checkCarrinho = check ;
		checkCancelado = cCancelado;
	}
	
	public Itens(String p, Unidade qtd, double val, Setor s) {
		nomeProduto = p;
		quantidade = qtd;
		preco = val;
		setor = s;
	}
	
	public String toString() {
		return "Item: " + nomeProduto + " - R$: " + preco + ". (Setor: " + setor + "), " + quantidade;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}
	
	public Unidade getUnidade() {
		return quantidade;
	}

	public void setUnidade(Unidade quantidade) {
		this.quantidade = quantidade;
	}

	public boolean getCheckCarrinho() {
		return checkCarrinho;
	}

	public void setCheckCarrinho(boolean checkCarrinho) {
		this.checkCarrinho = checkCarrinho;
	}
	
	public boolean getCheckCancelado() {
		return checkCancelado;
	}

	public void setCheckCancelado(boolean cCancelado) {
		this.checkCancelado = cCancelado;
	}
}
