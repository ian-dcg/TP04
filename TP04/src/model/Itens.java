package model;

public class Itens {
	private String nomeProduto;
	private double preco;
	private boolean checkCarrinho;
	private boolean checkCancelado;
	private Unidade unidade;
	private Setor setor;
	private int quantidade;

	//Sobrecarga
	public Itens(String p, Unidade uni, int qtd, double val, Setor s, boolean check, boolean cCancelado) {
		nomeProduto = p;
		unidade = uni;
		quantidade = qtd;
		preco = val;
		setor = s;
		checkCarrinho = check ;
		checkCancelado = cCancelado;
	}
	
	public Itens(String p, double val, Unidade uni, int qtd, Setor s) {
		nomeProduto = p;
		unidade = uni;
		quantidade = qtd;
		preco = val;
		setor = s;
	}
	
	public String toString() {
		return "Item: " + nomeProduto + " - R$: " + preco + ". (Setor: " + setor + "), " + unidade + quantidade + ". ";
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
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
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
