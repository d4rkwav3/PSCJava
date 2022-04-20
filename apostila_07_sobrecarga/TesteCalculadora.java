package desafios.apostila_07_sobrecarga;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(); //Cria um objeto Calculadora
 
        //Testa os métodos com alguns valores arbitrários
        System.out.println(calc.Soma(12, 4));
        System.out.println(calc.Subtracao(12, 4));
        System.out.println(calc.Multiplicacao(12, 4));
        System.out.printf("%.3f", calc.Divisao(12, 4));

    }
}
