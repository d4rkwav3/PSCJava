package desafios.apostila_03_Selecao;

import javax.swing.JOptionPane;

public class Exer001 {
    public static void main (String args []) {
        //Declaração da variável e entrada do número
        Integer num = Integer.parseInt(JOptionPane.showInputDialog("Digite qualquer número inteiro:"));

        //Verifica se número é maior que zero
        if (num > 0) {
            JOptionPane.showMessageDialog(null, "O número " + num + " é positivo!");
        } 
        //Caso ele não seja maior que zero, verifica se é menor que zero
        else if (num < 0) {
            JOptionPane.showMessageDialog(null, "O número " + num + " é negativo!");
        }
        //Caso ele não seja nem positivo e nem negativo, consequentemente ele é zero
        else {
            JOptionPane.showMessageDialog(null, "O número " + num + " é neutro!");
        }
    }
}

