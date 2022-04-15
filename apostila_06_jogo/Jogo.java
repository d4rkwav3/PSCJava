package desafios.apostila_06_jogo;

public class Jogo {
    public static void main(String[] args) throws InterruptedException {
        Personagem perdido = new Personagem("Bruce", 10, 0, 0);
        Personagem soneca = new Personagem("Dorminhoco", 2, 6, 4);
        Personagem wilson = new Personagem("Wilson", 5, 5, 5);
        //perdido.status();
        //soneca.status();

         while (true) {
            perdido.cacar();
            soneca.dormir();
            wilson.comer();
            System.out.println("===============================");
            perdido.comer();
            soneca.cacar();
            wilson.dormir();
            System.out.println("===============================");
            perdido.dormir();
            soneca.comer();
            wilson.cacar();
            System.out.println("===============================");
            Thread.sleep(3 * 1000);
        }
    }
}
