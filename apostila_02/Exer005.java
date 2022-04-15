package desafios.apostila_02;

import javax.swing.JOptionPane;

public class Exer005 {
    public static void main (String args []) {
        //inicia as variáveis
        Double base, altura, area;

        //Pede ao usuário qual o valor da base e da altura
        base = Double.parseDouble(JOptionPane.showInputDialog("Qual o tamanho da base do retângulo?"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Qual o tamanho da altura do retângulo?"));

        //Faz o cálculo da área do retângulo
        area = base * altura;

        //Exibe o resultado
        JOptionPane.showMessageDialog(null, "Base informada: " + base + "\nAltura informada: " + altura + "\nA área do retângulo é: " + area);

    }
}
