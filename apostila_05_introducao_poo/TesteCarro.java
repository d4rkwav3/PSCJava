package desafios.apostila_05_introducao_poo;

import java.util.Scanner;

public class TesteCarro {
    public static void main(String[] args) {
        // Declaração de variáveis
        String nome1, nome2;
        int ano1, ano2;
        // Criação de um objeto Scanner para ler do teclado
        Scanner input = new Scanner(System.in);
        // Mostra a seguinte mensagem
        System.out.print("Qual o modelo do carro 1: ");
        nome1 = input.nextLine(); // e captura o que foi digitado pelo usuário após ele apertar ENTER e salva na variável nome1
        // Mostra a seguinte mensagem
        System.out.print("Qual o ano do carro 1: ");
        ano1 = input.nextInt(); // e captura o que foi digitado pelo usuário após ele apertar ENTER e salva na variável nome1
        input.nextLine(); // O método acima captura apenas números, é necessário utilizar esse método sem nenhuma atribuição para "limpar" a entrada de dados
        // Mostra a seguinte mensagem
        System.out.print("Qual o modelo do carro 2: ");
        nome2 = input.nextLine(); // e captura o que foi digitado pelo usuário após ele apertar ENTER e salva na variável nome2
        // Mostra a seguinte mensagem
        System.out.print("Qual o ano do carro 2: ");
        ano2 = input.nextInt(); // e captura o que foi digitado pelo usuário após ele apertar ENTER e salva na variável nome1
        input.close(); // Esse método fecha a entrada de dados

        // Cria os objetos Carro com os dados inseridos pelo usuário
        Carro carro1 = new Carro(nome1, ano1);
        Carro carro2 = new Carro(nome2, ano2);
        // Exibe o resultado
        System.out.printf("\nCarro 1: %s, ano: %d.\nCarro 2: %s, ano: %d.", carro1.getModelo(), carro1.getAno(), carro2.getModelo(), carro2.getAno());
    }
}
