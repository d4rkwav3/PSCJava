package desafios.apostila_02;

import javax.swing.JOptionPane;

public class Exer011 {
    public static void main (String args []){
        double salario, valorTotalVendas, bonus, resultado;
        int numCarrosVendidos;

        numCarrosVendidos = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos carros vendeu esse mês?"));
        valorTotalVendas = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor total das suas vendas esse mês?"));
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário fixo:"));
        bonus = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da sua comissão fixa:"));

        resultado = salario + (valorTotalVendas * 0.05) + (bonus * numCarrosVendidos);

        JOptionPane.showMessageDialog(null, "Seu salário final será: " + resultado);
    }
}
