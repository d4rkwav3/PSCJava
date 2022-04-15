package desafios.apostila_03_Strings;

import javax.swing.JOptionPane;

public class Exer001 {
    public static void main (String args []) {
        //Declaração das variáveis
        String nome, primeiroNome, sobrenome, resultado;

        //Solicita a inserção do nome e sobrenome do usuário e salva na variável nome
        nome = JOptionPane.showInputDialog("Digite seu nome e sobrenome, separado por espaços");

        /* Usa o método subString e indexOf para armazenar o primeiro nome na variável primeiroNome
        Note que ele vai armazenar todos os caracteres do início da string nome até a aparição do 
        primeiro espaço em nome, note também que o próprio caracter do espaço não é armazenado. */
        primeiroNome = nome.substring(0, (nome.indexOf(" ")));
        
        /* Usa o método subString e indexOf para armazenar o sobrenome na variável sobrenome
        Note que ele vai armazenar a string nome a partir do caracter de espaço + 1 até o final
        da string, isso porque não queremos que esse primeiro espaço seja incluido no sobrenome. */
        sobrenome = nome.substring((nome.indexOf(" ") + 1), nome.length());

        //Cria uma simples string formatada usando o método format e as variáveis criadas anteriormente
        resultado = String.format("Olá %s. Seu sobrenome é %s", primeiroNome, sobrenome);
        
        //Exibe o resultado
        JOptionPane.showMessageDialog(null, resultado);
    }
}
