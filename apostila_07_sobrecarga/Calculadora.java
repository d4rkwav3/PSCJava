package desafios.apostila_07_sobrecarga;

public class Calculadora {
    // private int a, b;

    public int Soma(int number1, int number2) {
        // a = number1;
        // b = number2;
        return number1 + number2;
    }

    public int Subtracao(int number1, int number2) {
        return number1 - number2;
    }

    public int Multiplicacao(int number1, int number2) {
        return number1 * number2;
    }

    public float Divisao(float number1, int number2) {
        return number1 / number2;
    }
}