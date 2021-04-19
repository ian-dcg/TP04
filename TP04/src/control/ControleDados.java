//Classe de Controle Geral de Dados

package control;

import model.*;

public class ControleDados {
	private Dados d = new Dados();
	
	public ControleDados() {
		d.preencherDadosAleatorios();
	}
	
	public Dados getDados() {
		return d;
	}
	
	public void setDados(Dados d) {
		this.d = d;
	}
	
	public Itens[] getItens() {
		return this.d.getItens();	
	}
	
	public int getNumItens() {
		return this.d.getNumItens();
	}
	
	
	/*public boolean inserirEditarItens(String[] dadosItens) {
		if(!dadosItens[3].matches("[0-9]+") || !dadosItens[4].matches("[0-9]+") || 
				!dadosItens[5].matches("[0-9]+") || !dadosItens[6].matches("[0-9]+")) {
			return false;
		} else {
			Itens it = new Itens(dadosItens[1], dadosItens[2], Integer.parseInt(dadosItens[3]), 
						Integer.parseInt(dadosAlunos[4]), new Setor(Integer.parseInt(dadosItens[5]),
								Integer.parseInt(dadosItens[6])));
				d.inserirEditarItens(a, Integer.parseInt(dadosAlunos[0]));
				return true;
		}
	}*/
	
	
}
