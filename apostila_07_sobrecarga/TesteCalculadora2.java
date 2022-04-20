package desafios.apostila_07_sobrecarga;

import java.util.Scanner;

public class TesteCalculadora2 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner input = new Scanner(System.in);
        int opcao, a, b;
        boolean continuar = true;
        String soma  = "\n1 - Soma";
        String sub   = "\n2 - Subtração";
        String multi = "\n3 - Multiplicação";
        String div   = "\n4 - Divisão";
        String sair  = "\n5 - Sair";

        while (continuar) {
            System.out.printf("\nSelecione uma opção: %s%s%s%s%s\n: ", soma, sub, multi, div, sair);
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    a = input.nextInt();
                    input.nextLine();
                    System.out.print("Digite o segundo número: ");
                    b = input.nextInt();
                    input.nextLine();
                    System.out.printf("A soma de %d mais %d é %d", a, b, calc.Soma(a, b));
                    break;
                case 2:
                    System.out.print("Digite o primeiro número: ");
                    a = input.nextInt();
                    input.nextLine();
                    System.out.print("Digite o segundo número: ");
                    b = input.nextInt();
                    input.nextLine();
                    System.out.printf("A subtração de %d menos %d é %d", a, b, calc.Subtracao(a, b));
                    break;
                case 3:
                    System.out.print("Digite o primeiro número: ");
                    a = input.nextInt();
                    input.nextLine();
                    System.out.print("Digite o segundo número: ");
                    b = input.nextInt();
                    input.nextLine();
                    System.out.printf("A multiplicação de %d vezes %d é %d", a, b, calc.Multiplicacao(a, b));
                    break;
                case 4:
                    System.out.print("Digite o primeiro número: ");
                    a = input.nextInt();
                    input.nextLine();
                    System.out.print("Digite o segundo número: ");
                    b = input.nextInt();
                    input.nextLine();
                    System.out.printf("A divisão de %d dividido por %d é %d", a, b, calc.Divisao(a, b));
                    break;
                case 5:
                    continuar = false;
                default:
                    continue;
            }
        }
        input.close();
    }
}