package desafios.apostila_02;

import javax.swing.JOptionPane;

public class Exer008 {
    public static void main (String args []){
        //Inicia as variáveis
        Integer eleitores, brancos, nulos, validos;
        Double totalBrancos, totalNulos, totalValidos;

        //Pede ao usuário os dados e armazena nas variáveis apropriadas
        eleitores = Integer.parseInt(JOptionPane.showInputDialog("Qual o número total de eleitores no município?"));
        brancos = Integer.parseInt(JOptionPane.showInputDialog("Qual o número total de votos brancos?"));
        nulos = Integer.parseInt(JOptionPane.showInputDialog("Qual o número total de votos nulos?"));
        validos = Integer.parseInt(JOptionPane.showInputDialog("Qual o número total de votos válidos?"));

        //cálcula as porcentagens de cada variável
        totalValidos = ((validos - (brancos + nulos)) * 100.0 / validos);
        totalBrancos = ((brancos * 100.0) / validos);
        totalNulos = ((nulos * 100.0) / validos);

        //Exibe o resultado
        JOptionPane.showMessageDialog(null, "Total de Eleitores: " + eleitores + "\nTotal de votos brancos: " + totalBrancos + "%" + "\nTotal de votos nulos: " + totalNulos + "%" + "\nTotal de votos válidos: " + totalValidos + "%");
    }
}
