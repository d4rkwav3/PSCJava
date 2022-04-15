package desafios.apostila_03_Strings;

import javax.swing.JOptionPane;

public class Exer002 {
    public static void main (String args []) {
        //Declaração das variáveis que serão usadas
        String senha;
        Character checkChar;
        Integer contador, checkInt;
        Boolean temNumero = false, temNumImpar = false, inicialValida, tamanho4;

        //Entrada de dados do usuário
        senha = JOptionPane.showInputDialog("Digite uma senha:");

        //Verifica se a senha tem tamanho de 4 caracteres
        switch (senha.length()) {
            case 4:
                //Caso tenha, armazena o valor Verdadeiro na variável tamanho4
                tamanho4 = true;
                break;
            default:
                //Caso contrário, armazena o valor Falso na variável tamanho4
                tamanho4 = false;
        }

        //Verifica qual é o primeiro símbolo da senha
        switch (senha.charAt(0)) {
            case 'A':
            case 'a':
                //Caso seja A ou a, armazena o valor Verdadeiro na variável inicialValida
                inicialValida = true;
                break;
            default:
                //Caso contrário, armazena o valor Falso na variável inicialValida
                inicialValida = false;
        }
        /* 
        Cria um loop para iterar sobre os caracteres restantes
        Atribui a variável contador o valor 1, pois o primeiro símbolo da senha já foi verificado
        Enquanto o valor da variável contador for menor ou igual ao tamanho da senha o loop vai se repetir
        Toda vez que o loop repetir, a variável contador vai aumentar em 1
        */
        for (contador = 1; contador <= (senha.length() - 1); contador++) {
            //Vai armazenar o caracter presente no índice definido pela variável contador
            checkChar = senha.charAt(contador);

            //Verifica se o caracter na variável checkChar é um digito númerico
            if (Character.isDigit(checkChar)) {
                //Caso seja um número, armazena o valor Verdadeiro na variável temNumero
                temNumero = true;
                //Armazena a forma númerica em checkInt do caracter que está armazenado na variável checkChar
                checkInt = Integer.parseInt(String.valueOf(checkChar));

                //Verifica que o número em checkInt é ímpar
                if (checkInt % 2 != 0) {
                    //Se o número for ímpar, armazena o valor Verdadeiro na variável temNumeroImpar
                    temNumImpar = true;
                }
                //Caso contrário simplesmente continua
                else {
                    continue;
                }
            }
        }
        //Verifica se as variáveis booleanas tem todos os valores como Verdadeiro
        if (temNumero && temNumImpar && inicialValida && tamanho4) {
            //Caso TODAS as variáveis booleanas tenhas valores Verdadeiros, exibe a mensagem de sucesso.
            JOptionPane.showMessageDialog(null, "Parabéns! Sua senha é válida!");
        }
        else {
            //Se AO MENOS UMA das variáveis booleanas tiver o valor Falso, exibe a mensagem de erro.
            JOptionPane.showMessageDialog(null, "Senha inválida!\nSua senha deve conter:\nAo menos um número ímpar;\nPrimeiro simbólo 'A' ou 'a'\nNo máximo 4 caracteres.");
        }
    }
}
