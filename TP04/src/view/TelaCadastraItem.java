package view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadastraItem {
	private JFrame janela = new JFrame("Cadastra item");
	private JTextField tfNomeItem = new JTextField();
	private JTextField tfQuantidade = new JTextField();
	private JTextField tfUnidade = new JTextField();
	private JTextField tfPreco = new JTextField();
	private JTextField tfSetor = new JTextField();
	private JButton btnCriar = new JButton("Cadastrar");
	private JButton btnCancelar = new JButton("Cancelar");
	public TelaCadastraItem() {
		
		JLabel lblNewLabel = new JLabel("Novo Item");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 21));
		lblNewLabel.setBounds(10, 10, 147, 40);
		janela.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 79, 85, 33);
		janela.add(lblNewLabel_1);
		
		tfNomeItem.setFont(new Font("Arial", Font.PLAIN, 15));
		tfNomeItem.setBounds(72, 86, 177, 19);
		janela.add(tfNomeItem);
		tfNomeItem.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Quantidade:");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 131, 106, 19);
		janela.add(lblNewLabel_2);
		
		tfQuantidade.setFont(new Font("Arial", Font.PLAIN, 15));
		tfQuantidade.setBounds(115, 131, 85, 19);
		janela.add(tfQuantidade);
		tfQuantidade.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Unidade:");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_3.setBounds(262, 132, 85, 18);
		janela.add(lblNewLabel_3);
		
		tfUnidade.setBounds(350, 132, 135, 21);
		janela.add(tfUnidade);
		tfUnidade.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Preço:");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_4.setBounds(10, 180, 68, 19);
		janela.add(lblNewLabel_4);
		
		tfPreco.setFont(new Font("Arial", Font.BOLD, 15));
		tfPreco.setBounds(72, 180, 85, 19);
		janela.add(tfPreco);
		tfPreco.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Setor:");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_5.setBounds(217, 180, 58, 18);
		janela.add(lblNewLabel_5);
		
		
		tfSetor.setFont(new Font("Arial", Font.PLAIN, 15));
		tfSetor.setBounds(277, 180, 147, 19);
		janela.add(tfSetor);
		tfSetor.setColumns(10);
		
		
		btnCriar.setFont(new Font("Arial", Font.BOLD, 16));
		btnCriar.setBounds(277, 275, 112, 33);
		janela.add(btnCriar);
		
		btnCancelar.setFont(new Font("Arial", Font.BOLD, 16));
		btnCancelar.setBounds(150, 275, 112, 33);
		janela.add(btnCancelar);
		
		janela.setLayout(null);
		
		janela.setSize(600,500);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
		
	}

}
