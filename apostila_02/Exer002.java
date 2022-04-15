package desafios.apostila_02;

import javax.swing.JOptionPane;

public class Exer002 {
    public static void main (String args []) {
        //inicia as variáveis de números em ponto flutuante
        Double num1, num2, num3, num4, somaQuadrado;

        //atribuir um valor a cada variável a partir da entrada do usuário
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número:"));
        num4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto número:"));

        //Faz os quadrados das variáveis
        num1 *= num1;
        num2 *= num2;
        num3 *= num3;
        num4 *= num4;

        //Realizar a soma dos quadrados
        somaQuadrado = num1 + num2 + num3 + num4; 

        //Exibe o resultado
        JOptionPane.showMessageDialog(null, "Quadrados dos números é:\nNúmero 1: " + num1 + "\nNúmero 2: " + num2 + "\nNúmero 3: " + num3 + "\nNúmero 4: " + num4 + "\nA soma dos quadrados é " + somaQuadrado);

    }
}
