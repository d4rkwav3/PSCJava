package desafios.apostila_08_heranca;

public class TesteAnimais {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Toddy");
        Gato cat = new Gato("Timóteo");

        System.out.printf("%s é um cachorro que adora brincar com %s que é um gato.\n", dog.nome, cat.nome);
    }
}
