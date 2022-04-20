package desafios.apostila_07_sobrecarga;

public class TesteImpressora {
    public static void main(String[] args) {
        Impressora print = new Impressora(); //Cria um objeto Impressora

        //Testa os métodos com valores arbitrários
        print.Exibir(12);
        print.Exibir(12, 24);
        print.Exibir(51, " Cachaça");
        print.Exibir("Nobody likes you when you're ", 23);
        print.Exibir("Programar", " é muito ", "legal!!");
        print.Exibir(1, 2, " feijão com arroz!");
    }
}
