package desafios.apostila_02;

import javax.swing.JOptionPane;

public class Exer010 {
    public static void main (String args []){
        double distribuidor, imposto, valorCarro, valorFinal;

        valorCarro = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do carro:"));
        
        imposto = valorCarro * 0.45;
        distribuidor = valorCarro * 0.28;
        valorFinal = valorCarro + imposto + distribuidor;

        JOptionPane.showMessageDialog(null, "O valor final do carro é: " + valorFinal);
    }
}
