package desafios.apostila_07_sobrecarga;

public class Impressora {
    // 1.1
    public void Exibir (float number) {
        System.out.println(number);
    }
    //1.2
    public void Exibir (float number1, float number2) {
        System.out.println(number1 + " " + number2);
    }
    //1.3
    public void Exibir (float number, String texto) {
        System.out.println(number + texto);
    }
    //1.4
    public void Exibir (String texto, float number) {
        System.out.println(texto + number);
    }
    //1.5
    public void Exibir (String texto1, String texto2, String texto3) {
        System.out.println(texto1 + texto2 + texto3);
    }
    //1.6
    public void Exibir (int number1, int number2, String texto) {
        System.out.println(number1 + " " + number2 + texto);
    }
}
