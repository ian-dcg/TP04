package model;

public class Lista  extends Mercado {
	private String nomeLista;
	private Itens [] itensRegistrados = new Itens[50];
	
	
	//Sobrecarga
	public Lista (String nome) {
		nomeLista = nome;
	}
	
	public Lista (String nome, int num, double tot) {
		nomeLista = nome;
		numItens = num;
		valorTotal = tot;
	}
	
	public String toString() {
		return "Nome da Lista: " + nomeLista;
	}
	
	public Itens[] getItens() {
		return this.itensRegistrados;
	}
	
	public void setArrayItensRegistrados(Itens[] a) {
		this.itensRegistrados = a;
	}
	
	public String getNomeLista() {
		return nomeLista;
	}
	
	public void setNomeLista(String nome) {
		this.nomeLista = nome;
	}
	
	@Override
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
	
	public String consultarItensRegistrados() {
		String registro = "Lista de Itens Registrados; \n";
		for (int i = 0; i < numItens; i++) {
			System.out.println(i);
			registro = registro + "\n" + itensRegistrados[i].toString();
		}
		
		return registro;
	}

}
