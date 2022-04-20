package desafios.apostila_07_sobrecarga;

public class TesteImpressora {
    public static void main(String[] args) {
        Impressora print = new Impressora();

        print.Exibir(12);
        print.Exibir(12, 24);
        print.Exibir(51, " Cachaça");
        print.Exibir("Cachaça ", 51);
        print.Exibir("Programar", " é muito ", "legal!!");
        print.Exibir(4, 8, " Teste");
    }
}
