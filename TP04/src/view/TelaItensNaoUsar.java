package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaItensNaoUsar extends JFrame {

	private JPanel contentPane;
	private JTextField tfNomeItem;
	private JTextField tfQuantidade;
	private JTextField tfUnidade;
	private JTextField tfPreco;
	private JTextField tfSetor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaItensNaoUsar frame = new TelaItensNaoUsar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaItensNaoUsar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Novo Item");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 21));
		lblNewLabel.setBounds(10, 10, 147, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 79, 85, 33);
		contentPane.add(lblNewLabel_1);
		
		tfNomeItem = new JTextField();
		tfNomeItem.setFont(new Font("Arial", Font.PLAIN, 15));
		tfNomeItem.setBounds(72, 86, 177, 19);
		contentPane.add(tfNomeItem);
		tfNomeItem.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Quantidade:");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 131, 106, 19);
		contentPane.add(lblNewLabel_2);
		
		tfQuantidade = new JTextField();
		tfQuantidade.setFont(new Font("Arial", Font.PLAIN, 15));
		tfQuantidade.setBounds(115, 131, 85, 19);
		contentPane.add(tfQuantidade);
		tfQuantidade.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Unidade:");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_3.setBounds(262, 132, 85, 18);
		contentPane.add(lblNewLabel_3);
		
		tfUnidade = new JTextField();
		tfUnidade.setBounds(350, 132, 135, 21);
		contentPane.add(tfUnidade);
		tfUnidade.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Pre\u00E7o:");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_4.setBounds(10, 180, 68, 19);
		contentPane.add(lblNewLabel_4);
		
		tfPreco = new JTextField();
		tfPreco.setFont(new Font("Arial", Font.BOLD, 15));
		tfPreco.setBounds(72, 180, 85, 19);
		contentPane.add(tfPreco);
		tfPreco.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Setor:");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_5.setBounds(217, 180, 58, 18);
		contentPane.add(lblNewLabel_5);
		
		tfSetor = new JTextField();
		tfSetor.setFont(new Font("Arial", Font.PLAIN, 15));
		tfSetor.setBounds(277, 180, 147, 19);
		contentPane.add(tfSetor);
		tfSetor.setColumns(10);
		
		JButton btnCriar = new JButton("Cadastrar");
		btnCriar.setFont(new Font("Arial", Font.BOLD, 16));
		btnCriar.setBounds(277, 275, 112, 33);
		contentPane.add(btnCriar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Arial", Font.BOLD, 16));
		btnCancelar.setBounds(150, 275, 112, 33);
		contentPane.add(btnCancelar);
	}
}
