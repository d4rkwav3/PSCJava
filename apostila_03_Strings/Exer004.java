package desafios.apostila_03_Strings;

import javax.swing.JOptionPane;

public class Exer004 {
    public static void main (String args []) {
        //Declaração das variáveis que serão usadas
        String frase, palavra1, palavra2, resultado;
        Integer indiceEspaco;

        //Entrada de dados pelo usuário
        frase = JOptionPane.showInputDialog(null, "Digite uma frase com duas palavras separadas com um espaço:");

        //Armazena o número do índice aonde o espaço aparece
        indiceEspaco = frase.indexOf(" ");

        //Cria uma substring do índice 0 ao índice do espaço, lembrando que o próprio espaço não conta  
        palavra1 = frase.substring(0, indiceEspaco);

        //Cria outra substring do índice do espaço + 1 (não queremos que o espaço seja incluído) até o final da frase, que é o tamanho total da frase.
        palavra2 = frase.substring((indiceEspaco + 1), (frase.length()));

        //Cria uma string formatada com as duas substrings criadas anteriormente
        resultado = String.format("A Primeira palavra foi : %s\nA Segunda palavra foi : %s", palavra1, palavra2);

        //Exibe o resultado
        JOptionPane.showMessageDialog(null, resultado);
    }
}