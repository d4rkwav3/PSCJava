package desafios.apostila_02;

import javax.swing.JOptionPane;

public class Exer003 {
    public static void main (String args []) {
        //Iniciar as variáveis atribuindo valor apenas a comissão que é a porcentagem de 5%
        Double preçoPeça, valorVenda, valorComissao, taxaComissao = (5.0 / 100);
        Integer quantidadeVendida;

        //Pede o input do usuário para saber a quantidade de peças vendidas e o preço delas
        quantidadeVendida = Integer.parseInt(JOptionPane.showInputDialog("Quantas peças você vendeu?"));
        preçoPeça = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de peças vendidas: " + quantidadeVendida + "\nQual o preço das peças vendidas?"));

        //Faz o cálculo
        valorVenda = preçoPeça * quantidadeVendida;
        valorComissao = valorVenda * taxaComissao;

        //Exibe o resultado
        JOptionPane.showMessageDialog(null, "Peças vendidas " + quantidadeVendida + "\nPreço das peças: " + preçoPeça + "\nTaxa de comissão = 5% do valor total da venda" + "\nSua comissão será de " + valorComissao + " Reais");
    }
}
