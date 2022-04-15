package desafios.apostila_04_loops;

import javax.swing.JOptionPane;

public class Exer003 {
    public static void main(String[] args) {
        //Declaração de variáveis
        Integer num, fatorial = 1;

        //Entrada de dados
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número natural:"));

        //Processamento usando while
        while (num > 0) {
            fatorial *= num;
            num--;
        }
        //usando for
        for (fatorial = 1; num > 0; num--) {
            fatorial *= num;
        }
        //usando do while
        do {
            fatorial *= num;
            num--;
        }
        while (num > 0);

        //Saída
        JOptionPane.showMessageDialog(null, "Resultado: " + fatorial);
    }
}
