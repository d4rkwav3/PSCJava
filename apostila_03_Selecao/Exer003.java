package desafios.apostila_03_Selecao;

import javax.swing.JOptionPane;

public class Exer003 {
    public static void main (String args []){
        //Declaração das variáveis
        Double a, b, c;

        //Entrada de dados e salvando nas variáveis
        a = Double.parseDouble(JOptionPane.showInputDialog("Insira um número qualquer"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Insira um outro número qualquer \nque seja diferente do anterior"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Insira um último número qualquer \nque seja diferente dos dois anteriores"));

        //Estrutura de seleção para verificar qual das variáveis possui o maior valor
        //Primeiro verica se a é maior que b
        if (a > b) {
            //Caso a seja maior que b, verifica se a é maior que c
            if (a > c) {
                JOptionPane.showMessageDialog(null, "O maior número digitado foi : " + a);
            }
            //Se a não é maior que c, então c é maior que a (excluindo que eles possam ser iguais)
            else {
                JOptionPane.showMessageDialog(null, "O maior número digitado foi : " + c);
            }
        }
        //Caso a seja menor que b, verifica se b é maior que c
        else if (b > c) {
            JOptionPane.showMessageDialog(null, "O maior número digitado foi : " + b);
        }
        //Se a for menor que b e b for menor que c, então c é o maior número
        else {
            JOptionPane.showMessageDialog(null, "O maior número digitado foi o: " + c);
        }
    }
}
