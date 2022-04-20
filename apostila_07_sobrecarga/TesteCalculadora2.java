package desafios.apostila_07_sobrecarga;

import java.util.Scanner;

public class TesteCalculadora2 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(); //Cria um objeto Calculadora
        Scanner input = new Scanner(System.in); //Cria um objeto Scanner (para ler o teclado)
        int opcao; //Variável responsável por selecionar a opção
        boolean continuar = true; //Essa variável vai controlar o loop
        //Variáveis de texto para o menu de opções
        String soma  = "\n1 - Soma";
        String sub   = "\n2 - Subtração";
        String multi = "\n3 - Multiplicação";
        String div   = "\n4 - Divisão";
        String sair  = "\n5 - Sair";

        while (continuar) {
            System.out.printf("\nSelecione uma opção: %s%s%s%s%s\n: ", soma, sub, multi, div, sair);
            opcao = input.nextInt(); //Captura o número digitado
            input.nextLine(); //Captura o restante da linha, necessário pois o método anterior só captura números inteiros

            switch (opcao) { //faz o cálculo conforme a opção selecionada
                case 1:
                    calc.inserirNumeros();
                    System.out.printf("\nA soma de %d mais %d é %d\n", calc.getA(), calc.getB(), calc.Soma(calc.getA(), calc.getB()));
                    break;
                case 2:
                    calc.inserirNumeros();
                    System.out.printf("\nA subtração de %d menos %d é %d\n", calc.getA(), calc.getB(), calc.Subtracao(calc.getA(), calc.getB()));
                    break;
                case 3:
                    calc.inserirNumeros();
                    System.out.printf("\nA multiplicação de %d vezes %d é %d\n", calc.getA(), calc.getB(), calc.Multiplicacao(calc.getA(), calc.getB()));
                    break;
                case 4:
                    calc.inserirNumeros();
                    System.out.printf("\nA divisão de %d dividido por %d é %.2f\n", calc.getA(), calc.getB(), calc.Divisao(calc.getA(), calc.getB()));
                    break;
                case 5:
                    System.out.println("Programa encerrado!");
                    continuar = false;
                default:
                    continue;
            }
        }
        input.close(); //Fecha a stream de entrada
        calc.fecharEntrada(); //Fecha a stream de entrada
    }
}