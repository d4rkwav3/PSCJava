package desafios.apostila_07_sobrecarga;

public class CalculadoraCientifica {
    public double Potenciacao(double number1, double number2) {
        return Math.pow(number1, number2);
    }
    public double Radiciacao(double number1, double number2) {
        return Math.pow(number1, (1.0 / number2));
    }
    public double Raiz(int number) {
        return Math.sqrt(number);
    }
    public double Raiz(Double number) {
        return Math.sqrt(number);
    }
    public double Raiz(String texto) {
        double StringConvertida = Double.parseDouble(texto);
        return Math.sqrt(StringConvertida);
    }
    public double Potencia(byte a, byte b) {
        return Math.pow(a, b);
    }
    public double Potencia(String s1, String s2) {
        double string1 = Double.parseDouble(s1);
        double string2 = Double.parseDouble(s2);
        return Math.pow(string1, string2);
    }
    public double Potencia(int a, double b){
        return Math.pow(a, b);
    }
}
