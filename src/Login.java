import javax.swing.*;
import javax.swing.JPanel;

public class Login {

    public void show(){

        JFrame janela = new JFrame("Login");/* É criada uma janela em JFrame que registra o login do usuário*/
        janela.setSize( 300,150);/* Define o tamanho da janela de login*/
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

        janela.add(labelSenha);/* Adiciona a label de senha à janela*/
        janela.add(textFieldSenha);/* Adiciona o campo de texto da senha à janela*/
        janela.add(labelUsuario);/* Adiciona a label de usuário à janela*/
        janela.add(textFieldUsuario);/* Adiciona o campo de texto do usuário à janela*/
        janela.add(painel);/* Adiciona o painel à janela*/

        janela.setVisible(true);/* Faz com que a janela seja visível*/
    }
}
