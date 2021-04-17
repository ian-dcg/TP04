package model;

public class Teste {
	static Lista l;
	static Setor s;
	static Unidade u;
	

	public static void main(String[] args) {
		Itens aux;
		
		s = new Setor ("Drogaria", 1);
		u = new Unidade ("qtd", 1);
		l = new Lista ("Lista Teste");
		
		
		aux = new Itens("remédio", u, 1.58, s);
		
		System.out.println(l.toString());
		System.out.println(aux.toString());
		
	}

}
