package desafios.apostila_03_Selecao;

import javax.swing.JOptionPane;

public class Exer005 {
    public static void main (String args []){
        //Declara a variável
        Integer mes;

        //Atribui um valor a variável a partir da entrada de dados do usuário
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro entre 1 a 12"));

        //Verifica qual o número inserido e responde o dia da semana correspondente
        switch (mes) {
            case 1:
                JOptionPane.showMessageDialog(null, "O mês correspondente a esse número é janeiro, \nEsse mês possui um total de 31 dias");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "O mês correspondente a esse número é fevereiro, \nEsse mês possui um total de 28 dias");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "O mês correspondente a esse número é março, \nEsse mês possui um total de 31 dias");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "O mês correspondente a esse número é abril, \nEsse mês possui um total de 30 dias");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "O mês correspondente a esse número é maio, \nEsse mês possui um total de 31 dias");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "O mês correspondente a esse número é junho, \nEsse mês possui um total de 30 dias");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "O mês correspondente a esse número é julho, \nEsse mês possui um total de 31 dias");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "O mês correspondente a esse número é agosto, \nEsse mês possui um total de 31 dias");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "O mês correspondente a esse número é setembro, \nEsse mês possui um total de 30 dias");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "O mês correspondente a esse número é outubro, \nEsse mês possui um total de 31 dias");
                break;
            case 11:
                JOptionPane.showMessageDialog(null, "O mês correspondente a esse número é novembro, \nEsse mês possui um total de 30 dias");
                break;
            case 12:
                JOptionPane.showMessageDialog(null, "O mês correspondente a esse número é dezembro, \nEsse mês possui um total de 31 dias");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Você inseriu um número fora do intervalo de 1 a 12 \nTente novamente usando o intervalo solicitado");
                break;
        }
    }   
}
