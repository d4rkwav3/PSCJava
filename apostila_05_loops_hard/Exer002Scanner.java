package desafios.apostila_05_loops_hard;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer002Scanner {
    private ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();
    private float soma = 0;
    private float quantidade = 0;
    private float media = 0;
    private float maior = 0;
    private float menor = 999999999;
    private float mediaPares = 0;

    public void adicionarNumeroALista (int numero) {
        this.listaDeNumeros.add(numero);
    }

    public void gerarSoma() {
        for (int indice = 0; indice <= this.listaDeNumeros.size() - 1; indice++) {
            this.soma += this.listaDeNumeros.get(indice);
        }
    }

    public float mostrarSoma() {
        return this.soma;
    }

    public void gerarQuantidade() {
        this.quantidade = this.listaDeNumeros.size();
    }

    public float mostrarQuantidade() {
        return this.quantidade;
    }

    public void gerarMedia() {
        this.media = this.soma / this.listaDeNumeros.size();
    }
    
    public float mostrarMedia() {
        return this.media;
    }

    public void gerarMaior() {
        this.maior = 0;
        for (int indice = 0; indice <= this.listaDeNumeros.size() - 1; indice++) {
            if (this.listaDeNumeros.get(indice) > this.maior)
                this.maior = this.listaDeNumeros.get(indice);
        }
    }

    public float mostrarMaior() {
        return this.maior;
    }

    public void gerarMenor() {
        for (int indice = 0; indice <= this.listaDeNumeros.size() - 1; indice++) {
            if (this.listaDeNumeros.get(indice) < this.menor)
                this.menor = this.listaDeNumeros.get(indice);
        }
    }

    public float mostrarMenor() {
        return this.menor;
    }

    public void gerarMediaPares() {
        ArrayList<Integer> listaTemporaria = new ArrayList<Integer>();
        int somaPares = 0;

        for (int indice = 0; indice <= this.listaDeNumeros.size() - 1; indice++) {
            if (this.listaDeNumeros.get(indice) % 2 == 0) {
                listaTemporaria.add(listaDeNumeros.get(indice));
            }
        }
        for (int indice = 0; indice <= listaTemporaria.size() - 1; indice++) {
            somaPares += listaTemporaria.get(indice);
        }
        this.mediaPares = somaPares / listaTemporaria.size();
    }

    public float mostrarMediaPares() {
        return this.mediaPares;
    }

    public static void main(String[] args) {
        int numero = 1;
        Exer002Scanner lista = new Exer002Scanner();
        Scanner input = new Scanner(System.in);
        String mensagem;

        System.out.println("Digite qualquer valor INTEIRO.\nPara finalizar digite 0 ou um número negativo.");

        while (numero > 0) {
            System.out.print(": ");
            numero = input.nextInt();
            input.nextLine();
            
            if (numero > 0) {
                lista.adicionarNumeroALista(numero);
            }
        }
        
        input.close();
        lista.gerarSoma();
        lista.gerarQuantidade();
        lista.gerarMedia();
        lista.gerarMaior();
        lista.gerarMenor();
        lista.gerarMediaPares();

        mensagem = String.format("\nSoma dos números: %.1f \nQuantidade de números digitados: %.0f \nMédia dos números: %.1f \nMaior número digitado: %.0f \nMenor número digitado: %.0f \nMédia dos números pares: %.1f ", lista.mostrarSoma(), lista.mostrarQuantidade(), lista.mostrarMedia(), lista.mostrarMaior(), lista.mostrarMenor(), lista.mostrarMediaPares());

        System.out.println(mensagem);
    }
}
