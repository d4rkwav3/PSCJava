package desafios.apostila_02;

import javax.swing.JOptionPane;

public class Exer004 {
    public static void main (String args []) {
        //inicia a variável de número inteiro
        int number;

        //Pede um input do usuário e converte em um número inteiro
        number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro para saber seu antecessor:"));

        //Exibe o resultado
        JOptionPane.showMessageDialog(null, "Você inseriu o número: " + number + "\nO antecessor desse número é: " + (number - 1));

    }
}
