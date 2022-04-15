package desafios.apostila_03_Selecao;

import javax.swing.JOptionPane;

public class Exer004 {
    public static void main (String args []) {
        //Declara a variável
        Integer diaSemana;

        //Atribui um valor a variável a partir da entrada de dados do usuário
        diaSemana = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro entre 1 a 7"));

        //Verifica qual o número inserido e responde o dia da semana correspondente
        switch (diaSemana) {
            case 1:
                JOptionPane.showMessageDialog(null, "O dia correspondente a esse número é o domingo");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "O dia correspondente a esse número é o segunda");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "O dia correspondente a esse número é o terça");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "O dia correspondente a esse número é o quarta");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "O dia correspondente a esse número é o quinta");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "O dia correspondente a esse número é o sexta");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "O dia correspondente a esse número é o sábado");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Você inseriu um número fora do intervalo de 1 a 7 \nTente novamente usando o intervalo solicitado");
                break;
        }
    }   
}
