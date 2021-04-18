package model;

public class Setor {
	private String categoria;
	private int prioridade;
	
	public Setor(String cat, int prio) {
		categoria = cat;
		prioridade = prio;
		
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public int getPrioridade() {
		return prioridade;
	}
	
	public void setPrioridade(int prio) {
		prioridade = prio;
	}
	
	public String toString() {
		return categoria + "/" + prioridade; 
	}

}
