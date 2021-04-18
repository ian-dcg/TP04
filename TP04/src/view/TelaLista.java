package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
//import controle.*;


public class TelaLista implements ActionListener, ListSelectionListener {		
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroItem;
	private JButton refreshItem;
	//private static ControleDados dados;
	private JList<String> listaItensCadastrados;
	private String[] listaItens = new String[50];

	public void mostrarDados(/*ControleDados d,*/ int op){
		//dados = d;

		switch (op) {
		case 1:// Mostrar dados de alunos cadastrados (JList)
			//listaItens = new ControleAluno(dados).getNomeAluno();
			listaItensCadastrados = new JList<String>(listaItens);
			janela = new JFrame("Lista");
			titulo = new JLabel("Itens Cadastrados");
			cadastroItem = new JButton("Cadastrar");
			refreshItem = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaItensCadastrados.setBounds(20, 50, 350, 120);
			listaItensCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaItensCadastrados.setVisibleRowCount(10);

			cadastroItem.setBounds(70, 177, 100, 30);
			refreshItem.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaItensCadastrados);
			janela.add(cadastroItem);
			janela.add(refreshItem);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroItem.addActionListener(this);
			refreshItem.addActionListener(this);
			listaItensCadastrados.addListSelectionListener(this);

			break;


		default:
			JOptionPane.showMessageDialog(null,"Opção não encontrada!", null, 
					JOptionPane.ERROR_MESSAGE);
		}

	}



	//Captura eventos relacionados aos botões da interface
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		//Cadastro de novo item
		/*if(src == cadastroItem)
			new TelaDetalhePessoa().inserirEditar(1, dados, this, 0);
		*/

		// Atualiza a lista de nomes de alunos mostrada no JList
		/*if(src == refreshItem) {
			listaItensCadastrados.setListData(new ControleAluno(dados).getNomeAluno());			
			listaItensCadastrados.updateUI();
		}*/



	}

	//Captura eventos relacionados ao JList
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		/*if(e.getValueIsAdjusting() && src == listaItensCadastrados) {
			new TelaDetalhePessoa().inserirEditar(3, dados, this, 
					listaItensCadastrados.getSelectedIndex());
		}*/

	}

}