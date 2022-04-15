package desafios.apostila_03_Strings;

import javax.swing.JOptionPane;

public class Exer003 {
    public static void main (String args []) {
        //Declaração das variáveis que serão usadas
        String s, resultado;
        Integer a, b;

        //Pede ao usuário dados e armazena nas variáveis correspondentes
        s = JOptionPane.showInputDialog("Digite uma frase qualquer:");
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro, esse número deve ser menor\ndo que a quantidade total de caracteres da frase."));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro, esse número deve ser maior\ndo que o número digitado anteriormente."));

        //Cria uma substring com os dados inseridos
        resultado = s.substring(a, (b + 1));

        //Exibe o resultado
        JOptionPane.showMessageDialog(null, "O string resultante é:\n" + resultado);
    }
}
