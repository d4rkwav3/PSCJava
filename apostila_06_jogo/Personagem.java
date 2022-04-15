package desafios.apostila_06_jogo;

public class Personagem {
    private String nome;
    private int energia;
    private int fome;
    private int sono;

    public Personagem (int energia, int fome, int sono) {
        if (energia >= 0 && energia <= 10)
            this.energia = energia;
        if (fome >= 0 && fome <= 10)
            this.fome = fome;
        if (sono >= 0 && fome <= 10)
            this.sono = sono;
    }

    public Personagem (String nome, int energia, int fome, int sono) {
        this (energia, fome, sono);
        this.nome = nome;
    }

    void cacar () {
        if (energia >= 2) {
            System.out.println("\n" + nome + " caçando.");
            energia -= 2;
        }
        else {
            System.out.println("\n" + nome + " sem energia para caçar.");
        }
        fome = Math.min (fome + 1, 10);
        sono = Math.min (sono + 1, 10);
        this.status();
    }
        

    void comer () {
        if (fome >= 1) {
            System.out.println("\n" + nome + " comendo.");
            energia = Math.min (energia + 1, 10);
            fome -= 1;
        }
        else {
            System.out.println("\n" + nome + " sem fome.");
        }
        this.status();   
    }

    void dormir () {
        if (sono >= 1) {
            System.out.println("\n" + nome + " dormindo.");
            sono -= 1;
            energia = energia + 1 <= 10 ? energia + 1 :10;
        }
        else {
            System.out.println("\n" + nome + " sem sono.");
        }
        this.status();
    }

    void status () {
        System.out.printf("\n%s => Energia: %d, Fome: %d, Sono: %d\n", this.nome, this.energia, this.fome, this.sono);
    }

    int getSono () {
        return this.sono;
    }
}
