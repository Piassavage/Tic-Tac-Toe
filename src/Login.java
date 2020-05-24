import javax.swing.*;

public class Login {

    public void show(){

        JFrame janela = new JFrame("Jogadores");/* É criada uma janela em JFrame que registra os nomes dos jogadores*/
        janela.setSize( 300,175);/* Define o tamanho da janela de login*/
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);/* Define que o comando de fechar a janela, feche o aplicativo*/
        janela.setLocationRelativeTo(null);/* Faz com que a janela seja centralizada na tela*/

        JPanel painel = new JPanel();/* Cria um painel JPanel*/
        painel.setLayout(null);/* Deixa um layout nulo para o painel, onde se tem de definir a posição de cada componente*/

        JLabel labelUsuario1 = new JLabel("Jogador 1: ");/* Cria uma texto escrito 'usuário'*/
        labelUsuario1.setBounds(20, 20, 80, 30);/* Define o tamanho e posicionamento da label de usuário*/

        JTextField textFieldUsuario1 = new JTextField();/* Cria um campo de texto para que o nome do 1º Usuário seja digitado*/
        textFieldUsuario1.setBounds(90, 25, 175, 20);/* Define tamanho e posicionamento do campo de texto do 1º Usuário*/

        JLabel labelUsuario2 = new JLabel("Jogador 2: ");/* Cria uma texto escrito 'senha' */
        labelUsuario2.setBounds(20, 55, 80, 30);/* Define o tamanho e posicionamento da label de senha*/

        JTextField textFieldUsuario2 = new JTextField();/* Cria um campo de texto para que o nome do 2º Usuário seja digitado*/
        textFieldUsuario2.setBounds(90, 60, 175, 20);/* Define tamanho e posicionamento do campo de texto do 2º Usuário*/

        JButton botaoEntrar = new JButton("Entrar");/* Cria um botao que quando clicado, a pessoa tenha acesso ao jogo*/
        botaoEntrar.setBounds(50, 95, 85,25);/* Define o tamanho e posicionamento do botão de acessar o jogo*/
        botaoEntrar.addActionListener(evt ->{
            janela.setVisible(false);

            Nome nome = new Nome();
            nome.jogador1 = textFieldUsuario1.getText();
            nome.jogador2 = textFieldUsuario2.getText();

            Jogo game = new Jogo();
            game.show();
        });/* Cria um evento se o botão entrar for pressionado*/

        JButton botaoCancelar = new JButton("Cancelar");/* Cria um botao que quando clicado, a pessoa cancele o acesso ao jogo*/
        botaoCancelar.setBounds(160, 95, 90,25);/* Define o tamanho e posicionamento do botão de cancelar o acesso ao jogo*/
        botaoCancelar.addActionListener(evt ->{
            janela.setVisible(false);/* Faz com que a primeira janela mostrada, fique invisível*/

            JOptionPane.showMessageDialog(null, "       Obrigado por jogar!");/* Mostra uma mensagem ao Usuário*/
            janela.dispose();/* Fecha o programa principal*/
        });/* Cria um evento se o botão cancelar for pressionado*/

        painel.add(botaoEntrar);/* Adiciona o botão de entrar no jogo ao painel*/
        painel.add(botaoCancelar);/* Adiciona o botão de cancelar o acesso ao jogo ao painel*/
        painel.add(labelUsuario2);/* Adiciona a label de senha ao painel*/
        painel.add(textFieldUsuario2);/* Adiciona o campo de texto da senha ao painel*/
        painel.add(labelUsuario1);/* Adiciona a label de usuário ao painel*/
        painel.add(textFieldUsuario1);/* Adiciona o campo de texto do usuário ao painel*/


        janela.getRootPane().setDefaultButton(botaoEntrar);/* Atribui à tecla enter a opção de entrar*/
        janela.add(painel);/* Adiciona o painel à janela*/
        janela.setVisible(true);/* Faz com que a janela seja visível*/
    }
}
