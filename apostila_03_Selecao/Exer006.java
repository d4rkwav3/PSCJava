package desafios.apostila_03_Selecao;

import javax.swing.JOptionPane;

public class Exer006 {
    public static void main (String args []){
        //Declara a variável
        Integer ano;

        //Atribui um número a variável ano
        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite um ano qualquer"));

        //Estrutura de seleção para verificar se o ano é bissexto ou comum
        //Se o resto da divisão do ano divido por 4 for diferente de zero, o ano é comum
        if ((ano % 4) != 0) {
            JOptionPane.showMessageDialog(null, "O ano " + ano + " é um ano comum.");
        }
        //Se o resto da divisão do ano divido por 100 for diferente de zero, o ano é bissexto
        else if ((ano % 100) != 0) {
            JOptionPane.showMessageDialog(null, "O ano " + ano + " é um ano bissexto.");
        }
        //Se o resto da divisão do ano divido por 400 for diferente de zero, o ano é comum
        else if ((ano % 400) != 0) {
            JOptionPane.showMessageDialog(null, "O ano " + ano + " é um ano comum.");
        }
        //Se nenhuma das anteriores for verdadeira, o ano é bissexto
        else {
            JOptionPane.showMessageDialog(null, "O ano " + ano + " é um ano bissexto.");
        }
    }
}
