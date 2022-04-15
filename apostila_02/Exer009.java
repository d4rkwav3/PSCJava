package desafios.apostila_02;

import javax.swing.JOptionPane;

public class Exer009 {
    public static void main (String args []){
        double salario, reajuste, novoSalario;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário:"));
        reajuste = Double.parseDouble(JOptionPane.showInputDialog("Digite o reajuste:"));

        novoSalario = salario * reajuste;

        JOptionPane.showMessageDialog(null, "Seu novo salário é: " + (salario + novoSalario));
    }
}
