package desafios.apostila_02;

import javax.swing.JOptionPane;

public class Exer006 {
    public static void main (String args []){
        //inicia as variáveis
        Integer idade, ano = 365, tempoPassado;

        //Pede a idade do usuário
        idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a tua idade?"));

        //Faz o cálculo
        tempoPassado = ano * idade;

        //Exibe o resultado
        JOptionPane.showMessageDialog(null, "Idade inserida: " + idade + "\nJá se passaram " + tempoPassado + " desde o seu nascimento!");
    }
}
