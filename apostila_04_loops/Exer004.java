package desafios.apostila_04_loops;

import javax.swing.JOptionPane;

public class Exer004 {
    public static void main(String[] args) {
        //Variáveis
        Integer num = 1, divisor = 0, passo = 1;
        Double resultado;

        //Entrada
        resultado = Double.parseDouble(JOptionPane.showInputDialog("Digite um número natural:"));

        /*
        Processamento
        Enquanto a variável num for menor que o número digitado pelo usuário, o loop vai se repetir
        */
        while (resultado >= num) {
            //Essa parte é visível apenas no terminal, use-a para verificar cada iteração do loop e entende-lo melhor
            System.out.println(String.format("Passo %-3d: %.0f / %d = %.3f", passo, resultado, num, (resultado / num)));

            //Se for encontrado um número divisor
            if (resultado % num == 0) {
                //Aumenta a variável divisor em 1
                divisor++;
                //Essa parte é visível apenas no terminal, monstra quando um divisor é localizado
                System.out.println(String.format("\t** Divisor encontrado: %.0f / %d = %.0f **", resultado, num, (resultado / num)));
            }
            //Incremento do loop
            num++;
            passo++;
        }
        //Após o loop, verifica se foram encontrados divisores, caso apenas dois forem encontrados o número é primo, caso contrário não é.
        if (divisor == 2) {
            JOptionPane.showMessageDialog(null, String.format("O número %.0f é primo!", resultado));
        }
        else {
            JOptionPane.showMessageDialog(null, String.format("O número %.0f NÃO é primo!", resultado));
        }
    }
}
