//* Referente ao exercício 03 e 04

package desafios.apostila_08_heranca;

public class Animal {
    String nome;
    int qtndPatas;

    public Animal () {
        this.nome = "\"Desconhecido\"";
        this.qtndPatas = 0;
    }

    public Animal (String nome) {
        this.nome = nome;
    }

    public Animal (String nome, int qntdPatas) {
        this(nome);
        this.qtndPatas = qntdPatas;
    }
}
