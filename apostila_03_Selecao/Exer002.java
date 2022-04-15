package desafios.apostila_03_Selecao;

import javax.swing.JOptionPane;

public class Exer002 {
    public static void main (String args []) {
        //Declaração das variaveis
        Double a, b, c, delta, x1, x2;
        String eq = "(ax² + bx + c = 0)";

        //Entrada dos dados
        a = Double.parseDouble(JOptionPane.showInputDialog("Para calcular uma equação de segundo grau:\n" + eq + "\ninsira o valor de A:"));
        b = Double.parseDouble(JOptionPane.showInputDialog( eq + "\nAgora insira o valor de B, caso não exista digite 0:"));
        c = Double.parseDouble(JOptionPane.showInputDialog( eq + "\nAgora insira o valor de C, caso não exista digite 0:"));

        //Processamento do valor de delta usando a classe Math
        delta = (Math.pow(b, 2) - (4 * a * c));

        //Verifica se o delta é igual a zero e caso positivo calcula a raiz
        if (delta == 0) {
            //Atenção ao uso dos parênteses para que as operações sejam feitas na ordem correta
            x1 = ((-b) - 0) / (2 * a);
            x2 = ((-b) + 0) / (2 * a);
            //Sendo o delta igual a zero, ambas as raízes devem ter o mesmo valor, portanto podemos usar qualquer uma delas para exibir o resultado
            JOptionPane.showMessageDialog(null, "O valor de delta é: " + delta + "\nEssa equação possui uma única raiz válida: " + x1); 
        }
        //Verifica se o delta é maior que zero e caso positivo calcula as duas raízes
        else if (delta > 0) {
            //Atenção ao uso dos parênteses para que as operações sejam feitas na ordem correta
            x1 = ((-b) - (Math.sqrt(delta))) / (2 * a);
            x2 = ((-b) + (Math.sqrt(delta))) / (2 * a);
            //Após os cálculos podemos exibir as raízes
            JOptionPane.showMessageDialog(null, "O valor de delta é: " + delta + "\nEssa equação possui duas raízes válidas!" + "\nx¹: " + x1 + "\nx²: " + x2); 
        }
        //Se o valor de delta não for igual ou maior que zero, consequentemente ele é negativo e portanto não possui qualquer raiz
        else {
            JOptionPane.showMessageDialog(null, "O valor de delta é um número negativo: " + delta + "\nEssa equação não possui raízes!");
        }
    }
}
