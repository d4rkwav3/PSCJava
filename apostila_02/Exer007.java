package desafios.apostila_02;

import javax.swing.JOptionPane;

public class Exer007 {
    public static void main (String args []) {
        //declaração das variáveis
        Integer dia, mes, ano, resultado;

        //Pede a entrada ao usuário e armazena nas variáveis
        dia = Integer.parseInt(JOptionPane.showInputDialog("Qual o dia do seu nascimento?"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Qual o mês do seu nascimento?"));
        ano = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano do seu nascimento?"));

        /*Calcula o resultado, porém nota-se que esse cálculo é EXTREMAMENTE simplório e é 
        apenas uma aproximação grosseira do que seria o valor real, um resultado mais preciso 
        envolve cálculos mais extensos e complexos, a classe Date Time pode nos auxiliar nisso,
        mas isso já fosse do escolpo desse exercício */
        resultado = dia + (mes * 30) + ((2022 - ano) * 365);

        //Exibe o resultado
        JOptionPane.showMessageDialog(null, "Você nasceu a aproximadamente " + resultado + " dias!" );
    }
}
