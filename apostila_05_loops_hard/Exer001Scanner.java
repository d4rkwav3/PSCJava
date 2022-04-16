package desafios.apostila_05_loops_hard;

import java.util.Scanner;

public class Exer001Scanner {
    private float a, b;
    private Scanner input = new Scanner(System.in);

    public float escolherPrimeiroNumero () {
        System.out.print("Digite o primeiro número: ");
        this.a = input.nextInt();
        input.nextLine();
        return this.a;
    }

    public float escolherSegundoNumero () {
        System.out.print("Digite o segundo número: ");
        this.b = input.nextInt();
        input.nextLine();
        return this.b;
    }

    public void fecharInput() {
        this.input.close();
    }

    public void opcaoInvalida () {
        System.out.println("\nOpção inválida! Tente novamente.\n");
    }

    public float soma (float num1, float num2) {
        return num1 + num2;
    }

    public float subtracao (float num1, float num2) {
        return num1 - num2;
    }

    public float multiplicacao (float num1, float num2) {
        return num1 * num2;
    }

    public float divisao (float num1, float num2) {
        return num1 / num2;
    }

public static void main(String[] args) {

        float num1, num2; 
        boolean continuar = true; 
        int opcaoSelecionada; 
        
        String a = "\n1 - Adição", b = "\n2 - Subtração", c = "\n3 - Multiplicação", d = "\n4 - Divisão", e = "\n5 - Sair";
        
        Exer001Scanner calc = new Exer001Scanner();
        Scanner entrada = new Scanner(System.in);
        
        do {
            System.out.printf("\nSelecione uma opção: %s %s %s %s %s\n: ", a, b, c, d, e);
            opcaoSelecionada = entrada.nextInt();
            entrada.nextLine();
            
            if (opcaoSelecionada >= 1 && opcaoSelecionada <= 4) {
                num1 = calc.escolherPrimeiroNumero();
                num2 = calc.escolherSegundoNumero();
                switch (opcaoSelecionada) {
                    case 1:
                        System.out.printf("\n%.1f mais %.1f é: %.1f\n", num1, num2, calc.soma(num1, num2));     
                        break;
                    case 2:
                        System.out.printf("\n%.1f menos %.1f é: %.1f\n", num1, num2, calc.subtracao(num1, num2));
                        break;
                    case 3:
                        System.out.printf("\n%.1f multiplicado por %.1f é: %.1f\n", num1, num2, calc.multiplicacao(num1, num2));
                        break;
                    case 4:
                        System.out.printf("\n%.1f dividido por %.1f é: %.1f\n", num1, num2, calc.divisao(num1, num2));
                        break;
                } 
            }
            else if (opcaoSelecionada == 5) {
                System.out.println("\nPrograma encerrado!\n");
                continuar = false;
            }
            else {
                calc.opcaoInvalida();
            }
        } while (continuar);
        entrada.close();
        calc.fecharInput();
    }
}

