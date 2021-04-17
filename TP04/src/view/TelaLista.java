package view;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaLista implements ActionListener {
	private static JFrame janela = new JFrame("Lista de Compras");
	private static JButton btnItem = new JButton("Adicionar item");
	private static JLabel titulo = new JLabel("Minha Lista");
	
	public TelaLista() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(33, 10, 119, 28);
		btnItem.setBounds(545,13,119,29);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(btnItem);
		
		
		
		janela.setSize(700,600);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
	}

	public static void main(String[] args) {
		TelaLista lista = new TelaLista();
		
		btnItem.addActionListener(lista);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == btnItem) {
			new TelaCadastraItem();
		}
		
	}

}
