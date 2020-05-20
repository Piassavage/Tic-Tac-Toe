import javax.swing.*;
import javax.swing.JPanel;

public class Login {

    public void show(){

        JFrame janela = new JFrame("Login");/* É criada uma janela em JFrame que registra o login do usuário*/
        janela.setSize( 300,175);/* Define o tamanho da janela de login*/
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);/* Define que o comando de fechar a janela, feche o aplicativo*/
        janela.setLocationRelativeTo(null);/* Faz com que a janela seja centralizada na tela*/

        JPanel painel = new JPanel();/* Cria um painel JPanel*/
        painel.setLayout(null);/* Deixa um layout nulo para o painel, onde se tem de definir a posição de cada componente*/

        JLabel labelUsuario = new JLabel("Usuário: ");/* Cria uma texto escrito 'usuário'*/
        labelUsuario.setBounds(20, 20, 60, 30);/* Define o tamanho e posicionamento da label de usuário*/

        JTextField textFieldUsuario = new JTextField();/* Cria um campo de texto para que o nome do usuário seja digitado*/
        textFieldUsuario.setBounds(75, 25, 175, 20);/* Define tamanho e posicionamento do campo de texto do Usuário*/

        JLabel labelSenha = new JLabel("Senha: ");/* Cria uma texto escrito 'senha' */
        labelSenha.setBounds(28, 55, 60, 30);/* Define o tamanho e posicionamento da label de senha*/

        JPasswordField textFieldSenha = new JPasswordField();/* Cria um campo de texto de senha para que a senha do usuário seja digitada*/
        textFieldSenha.setBounds(75, 60, 175, 20);/* Define tamanho e posicionamento do campo de texto da Senha*/

        JButton botaoEntrar = new JButton("Entrar");/* Cria um botao que quando clicado, a pessoa tenha acesso ao jogo*/
        botaoEntrar.setBounds(50, 95, 85,25);/* Define o tamanho e posicionamento do botão de acessar o jogo*/
        botaoEntrar.addActionListener(evt ->{

        });/* Cria um evento se o botão entrar for pressionado*/

        JButton botaoCancelar = new JButton("Cancelar");/* Cria um botao que quando clicado, a pessoa cancele o acesso ao jogo*/
        botaoCancelar.setBounds(160, 95, 90,25);/* Define o tamanho e posicionamento do botão de cancelar o acesso ao jogo*/
        botaoCancelar.addActionListener(evt ->{
            JFrame janela2 = new JFrame();
            janela2.setSize(100,150);
            janela2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janela2.setLocationRelativeTo(null);

            JPanel painel2 = new JPanel();
            painel2.setLayout(null);

            JLabel labelJanela2 = new JLabel("Obrigado por jogar!");
            labelJanela2.setBounds(10,20,10,50);

            janela2.add(labelJanela2);
            janela2.setVisible(true);
            janela.setVisible(false);
        });/* Cria um evento se o botão cancelar for pressionado*/

        janela.add(botaoEntrar);/* Adiciona o botão de entrar no jogo à janela*/
        janela.add(botaoCancelar);/* Adiciona o botão de cancelar o acesso ao jogo à janela*/
        janela.add(labelSenha);/* Adiciona a label de senha à janela*/
        janela.add(textFieldSenha);/* Adiciona o campo de texto da senha à janela*/
        janela.add(labelUsuario);/* Adiciona a label de usuário à janela*/
        janela.add(textFieldUsuario);/* Adiciona o campo de texto do usuário à janela*/
        janela.add(painel);/* Adiciona o painel à janela*/

        janela.setVisible(true);/* Faz com que a janela seja visível*/
    }
}
