package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import controle.*;

public class MenuPrincipal implements ActionListener {
	
	private static JFrame janela = new JFrame("Lista de Compras");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton lista = new JButton("Lista de compras");
	//public static ControleDados dados = new ControleDados();
	
	public MenuPrincipal() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 150, 30);
		//curso.setBounds(140, 100, 100, 30);
		//prof.setBounds(140, 150, 100, 30);
		lista.setBounds(127, 50, 130, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(lista);
		//janela.add(curso);
		//janela.add(prof);
		
		janela.setSize(400, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		MenuPrincipal menu = new MenuPrincipal();
		
		lista.addActionListener(menu);
		//prof.addActionListener(menu);
		//curso.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == lista) {
			new TelaLista().mostrarDados(/*dados,*/ 1);
		}
			
		
		/**if(src == prof)
			new TelaPessoa().mostrarDados(dados, 2);
		
		if(src == curso)
			JOptionPane.showMessageDialog(null, 
					"Ainda precisam ser implementadas as funcionalidades\n"
					+ "relacionadas a curso e a matrícula", null, 
					JOptionPane.INFORMATION_MESSAGE);**/
	}
}
