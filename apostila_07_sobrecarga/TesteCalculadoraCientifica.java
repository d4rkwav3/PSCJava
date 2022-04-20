package desafios.apostila_07_sobrecarga;

public class TesteCalculadoraCientifica {
    public static void main(String[] args) {
        CalculadoraCientifica calc = new CalculadoraCientifica(); //Cria um objeto CalculadoraCientifica
        //Algumas variáveis com valores para testar os métodos
        int a = 6, b = 3;
        double c = 100, d = 5;
        String texto1 = "10.0", texto2 = "4";
        byte e = 2, f = 3;

        //Testando os métodos usando as variáveis
        System.out.println(calc.Potenciacao(c, d));
        System.out.println(calc.Radiciacao(c, d));
        System.out.println(calc.Raiz(a));
        System.out.println(calc.Raiz(d));
        System.out.println(calc.Raiz(texto1));
        System.out.println(calc.Potenciacao(c, d));
        System.out.println(calc.Potencia(e, f));
        System.out.println(calc.Potencia(texto1, texto2));
        System.out.println(calc.Potencia(b, d));
    }
}
