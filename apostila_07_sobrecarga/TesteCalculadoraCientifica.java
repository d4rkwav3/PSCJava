package desafios.apostila_07_sobrecarga;

public class TesteCalculadoraCientifica {
    public static void main(String[] args) {
        CalculadoraCientifica calc = new CalculadoraCientifica();
        int a = 2, b = 4;
        double c = 2.5, d = 6.4;
        String texto1 = "4", texto2 = "10.0";
        byte e = 0011, f = 0010;


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
