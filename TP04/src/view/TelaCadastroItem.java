package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
//import controle.*;

public class TelaCadastroItem implements ActionListener {

	private JFrame janela;
	private JLabel labelNome = new JLabel("Produto: ");
	private JTextField valorNome;
	private JLabel labelHoraAula = new JLabel("Preço (R$): ");
	private JTextField valorHoraAula;
	private JLabel labelEnd = new JLabel("Endereco: ");
	private JTextField valorEnd;
	private JLabel labelCPF = new JLabel("Setor: ");
	private JTextField valorCPF;
	private JLabel labelID = new JLabel("Unidade: ");
	private JTextField valorID;
	private JLabel labelTelefone = new JLabel("Quantidade:  ");
	private JTextField valorDDD;
	//private JTextField valorTelefone;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[9];
	//private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;

	public void inserirEditar(int op,/* ControleDados d,*/ 
			TelaLista p, int pos) {

		opcao = op;
		posicao = pos;
		//dados = d;
		
		// AS OPÇOES POSSIVEIS SAO 2 E 4 
		//	2- CADASTRAR ITEM
		//  4 - EDITAR ITEM EXISTENTE
		
		// if (op == 1) s = "Cadastro de Aluno"; // sera apagado
		if (op == 2) s = "Cadastro de Item";   //transformar em opçao 1
		// if (op == 3) s = "Detalhe de Aluno"; // sera apagado
		if (op == 4) s = "Detalhe de Item";  //transformar em opção 2 

		janela = new JFrame(s);

		//Preenche dados com dados do professor clicado
		if (op == 4) {/*  
			valorNome = new JTextField(dados.getProfessores()[pos].getNome(), 200);
			valorHoraAula = new JTextField(String.valueOf(
					dados.getProfessores()[pos].getValorHoraAula()),200);
			valorEnd = new JTextField(200);
			valorCPF = new JTextField(String.valueOf(dados.getProfessores()[pos].getCPF()), 200);
			valorID = new JTextField(String.valueOf(dados.getProfessores()[pos].getNumID()), 200);
			valorDDD = new JTextField(
					String.valueOf(dados.getProfessores()[pos].getNumTel().getDDD()), 3);
			valorTelefone = new JTextField(
					String.valueOf(dados.getProfessores()[pos].getNumTel().getNumero()), 10);

		*/} else { //Não preenche com dados

			valorNome = new JTextField(200);
			valorEnd = new JTextField(200);
			valorHoraAula = new JTextField(200);
			valorCPF = new JTextField(200);
			valorID = new JTextField(200);
			valorDDD = new JTextField(3);
			//valorTelefone = new JTextField(10);

			botaoSalvar.setBounds(245, 175, 115, 30);
		}

		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelEnd.setBounds(30, 50, 150, 25);
		valorEnd.setBounds(180, 50, 180, 25);
		labelHoraAula.setBounds(30, 50, 180, 25);
		valorHoraAula.setBounds(180, 50, 180, 25);		
		labelCPF.setBounds(30, 80, 150, 25);
		valorCPF.setBounds(180, 80, 180, 25);
		labelID.setBounds(30, 110, 150, 25);
		valorID.setBounds(180, 110, 180, 25);
		labelTelefone.setBounds(30, 140, 150, 25);
		valorDDD.setBounds(180, 140, 28, 25);
		//valorTelefone.setBounds(210, 140, 65, 25);

		//Coloca botoes de excluir e salvar (caso seja detalhe item)
		if (op == 4) {
			botaoSalvar.setBounds(120, 175, 115, 30);
			botaoExcluir.setBounds(245, 175, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelHoraAula);
		this.janela.add(valorHoraAula);
		this.janela.add(labelCPF);
		this.janela.add(valorCPF);
		this.janela.add(labelID);
		this.janela.add(valorID);
		this.janela.add(labelTelefone);
		this.janela.add(valorDDD);
		//this.janela.add(valorTelefone);
		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 250);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}


	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		/*if(src == botaoSalvar) {
			try {
				boolean res;
				if (opcao == 2) // cadastro de novo prof
					novoDado[0] = Integer.toString(dados.getQtdProfs());
				else // edicao de dado existente
					novoDado[0] = Integer.toString(posicao);

				novoDado[1] =  valorNome.getText();
				novoDado[3] =  valorCPF.getText();
				novoDado[4] =  valorID.getText();
				novoDado[5] =  valorDDD.getText();
				novoDado[6] =  valorTelefone.getText();

				if (opcao == 1 || opcao == 3) {
					novoDado[2] =  valorEnd.getText();
					res = dados.inserirEditarAluno(novoDado);
				} else {
					novoDado[2] =  valorHoraAula.getText();
					res = dados.inserirEditarProf(novoDado);
				}

				if(res) {
					mensagemSucessoCadastro();
				}
				else mensagemErroCadastro();

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
		}

		if(src == botaoExcluir) {
			boolean res = false;

			if (opcao == 3) {//exclui aluno
				res = dados.removerAluno(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoAluno(); 
			}
				
			if (opcao == 4){ //exclui professor
				res = dados.removerProfessor(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoProf(); 
			}


			
		}*/
	}

	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
				+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
				+ "1. Nem todos os campos foram preenchidos \n"
				+ "2. CPF, identidade, DDD e telefone não contém apenas números", null, 
				JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoAluno() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se o aluno está matriculado\n"
				+ "em alguma disciplina. Se sim, cancele\n "
				+ "a matricula e tente novamente.", null, 
				JOptionPane.ERROR_MESSAGE);
	}
	
	public void mensagemErroExclusaoProf() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se o professor está responsável\n"
				+ "por alguma disciplina. Se sim, substitua\n "
				+ "o professor e tente novamente.", null, 
				JOptionPane.ERROR_MESSAGE);
	}

}
