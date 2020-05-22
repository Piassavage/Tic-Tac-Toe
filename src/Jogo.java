import javax.swing.*;
import java.awt.*;

public class Jogo {

	private String usuarioAtual = "X";
	private int jogadas = 0;

	private JButton[][] botoes = {
			{ new JButton(), new JButton(), new JButton()},
			{ new JButton(), new JButton(), new JButton()},
			{ new JButton(), new JButton(), new JButton()}
	};

	public void show() {

		// cria interface

		JFrame frame = new JFrame("Jogo da Velha");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30,30, 30,30));
		panel.setLayout(new GridLayout(3, 3));
		panel.setPreferredSize(new Dimension(500, 500));

		for (int i = 0; i < botoes.length; i++) {
			for (int j = 0; j < botoes[0].length; j++ ) {

				// para cada botao, adiociona a funcao a ser executada quando este
				// for clicado

				JButton botaoAtual = botoes[i][j];
				panel.add(botaoAtual);

				botaoAtual.addActionListener(e -> aoPressionarBotao(botaoAtual));

			}
		}

		frame.add(panel);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

	private void aoPressionarBotao(JButton botaoAtual) {

		// lógica do jogo

		if (!botaoAtual.getText().equals("")) return; // se botão não está vazio, não faz nada.

		botaoAtual.setText(usuarioAtual);
		jogadas++;
		boolean venceu = houveVencedor(); // testa se houve um vencedor

		if (venceu) {
			// se houve um vencedor, mostra o vencedor e reinicia o jogo
			JOptionPane.showMessageDialog(null, "O vencedor foi " + usuarioAtual);
			reiniciarJogo();
		}
		else {
			// se nao houve vencedor ...
			if (jogadas == 9) {
				// se foi a ultima jogada, mostra o resultado de empate e reinicia o jogo
				JOptionPane.showMessageDialog(null, "O jogo empatou!");
				reiniciarJogo();
			}
			else {
				// se nao foi a ultima jogada, troca o jogador e continua o jogo
				usuarioAtual = (usuarioAtual.equals("X")) ? "O" : "X";
			}
		}
	}

	private boolean houveVencedor() {

		// verifica se houve vencedor:
		// retorna true se houve um vencedor ou false, caso contrário.

		// obtem textos dos botoes
		String b00 = botoes[0][0].getText();
		String b01 = botoes[0][1].getText();
		String b02 = botoes[0][2].getText();
		String b10 = botoes[1][0].getText();
		String b11 = botoes[1][1].getText();
		String b12 = botoes[1][2].getText();
		String b20 = botoes[2][0].getText();
		String b21 = botoes[2][1].getText();
		String b22 = botoes[2][2].getText();

		//  a matriz de botoes tem o formato abaixo:

		//  b00   b01  b02
		//  b10   b11  b12
		//  b20   b21  b22

		// testa cada linha, coluna e diagonal para ver se todos os
		// botoes (da linha, coluna ou diagonal) têm o mesmo texto.
		// se tem, é porque o jogo acabou e alguém venceu.

		// linha 1
		if (!b00.equals("") && b00.equals(b01) && b00.equals(b02)) {
			return true;
		}
		// linha 2
		if (!b10.equals("") && b10.equals(b11) && b10.equals(b12)) {
			return true;
		}
		// linha 3
		if (!b20.equals("") && b20.equals(b21) && b20.equals(b22)) {
			return true;
		}

		// coluna 1
		if (!b00.equals("") && b00.equals(b10) && b00.equals(b20)) {
			return true;
		}
		// coluna 2
		if (!b01.equals("") && b01.equals(b11) && b01.equals(b21)) {
			return true;
		}
		// coluna 3
		if (!b02.equals("") && b02.equals(b12) && b00.equals(b22)) {
			return true;
		}

		// diagonal 1
		if (!b00.equals("") && b00.equals(b11) && b00.equals(b22)) {
			return true;
		}

		// diagonal 2
		if (!b02.equals("") && b02.equals(b11) && b02.equals(b20)) {
			return true;
		}

		// retorna false se nenhum teste acima retornou true
		return false;

	}

	private void reiniciarJogo() {
		// reinicia o jogo
		for (int i = 0; i < botoes.length; i++) {
			for (int j = 0; j < botoes[0].length; j++) {
				botoes[i][j].setText(""); // reseta o texto do botao
				jogadas = 0;  // reseta o contador de jogadas
				usuarioAtual = "X"; // primeiro jogador é 'X'
			}
		}
	}

}