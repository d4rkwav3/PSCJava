package desafios.apostila_07_sobrecarga;

import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner input = new Scanner(System.in);

        System.out.println(calc.Soma(12, 4));
        System.out.println(calc.Subtracao(12, 4));
        System.out.println(calc.Multiplicacao(12, 4));
        System.out.printf("%.3f", calc.Divisao(12, 4));

        input.close();
    }
}
