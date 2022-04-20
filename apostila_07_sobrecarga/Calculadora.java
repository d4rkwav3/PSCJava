package desafios.apostila_07_sobrecarga;

import java.util.Scanner;

public class Calculadora {
    private int a, b;
    private Scanner entrada = new Scanner(System.in);

    public int Soma(int number1, int number2) {
        return number1 + number2;
    }

    public int Subtracao(int number1, int number2) {
        return number1 - number2;
    }

    public int Multiplicacao(int number1, int number2) {
        return number1 * number2;
    }

    public float Divisao(int number1, int number2) {
        return number1 / number2;
    }

    public void inserirNumeros() {
        System.out.print("Insira o primeiro número: ");
        this.a = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Insira o segundo número: ");
        this.b = entrada.nextInt();
        entrada.nextLine();
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public void fecharEntrada() {
        this.entrada.close();
    }
}