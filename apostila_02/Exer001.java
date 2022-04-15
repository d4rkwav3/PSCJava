package desafios.apostila_02;

import javax.swing.JOptionPane;

public class Exer001 {
    public static void main (String args []) {
        //inicia as variáveis sem atribuir nenhum valor
        double dolar, real, resultado;

        //faz o usuário inserir um valor nas variáveis, convertendo elas em Double
        dolar = Double.parseDouble(JOptionPane.showInputDialog("Qual é a cotação do dolár hoje?"));
        real = Double.parseDouble(JOptionPane.showInputDialog("Quantos reais deseja converter em dolár?"));

        //com os valores já armazenados nas variáveis, é possível fazer a conversão usando a variável resultado
        resultado = real * dolar;

        //exibe os valores das variáveis e o resultado na tela.
        JOptionPane.showMessageDialog(null, "A cotação do dolár hoje é: " + dolar + "\nReais a converter: " + real + "\nValor convertido em dolár: " + resultado);

    }
}
