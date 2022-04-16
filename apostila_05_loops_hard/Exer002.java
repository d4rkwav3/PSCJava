package desafios.apostila_05_loops_hard;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Exer002 {
    private ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();
    private float soma;
    private float quantidade;
    private float media;
    private float maior;
    private float menor;
    private float mediaPares;

    public void adicionarNumeroALista (int numero) {
        this.listaDeNumeros.add(numero);
    }

    public void gerarSoma() {
        for (int indice = 0; indice >= this.listaDeNumeros.size() -1; indice++) {
            this.soma += listaDeNumeros.get(indice);
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
        this.menor = 999999999;
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
        Exer002 lista = new Exer002();
        String mensagem;

        while (numero > 0) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite qualquer valor INTEIRO.\nPara finalizar digite 0 ou um número negativo."));
            
            if (numero > 0) {
                lista.adicionarNumeroALista(numero);
            }
        }
        
        lista.gerarSoma();
        lista.gerarQuantidade();
        lista.gerarMedia();
        lista.gerarMaior();
        lista.gerarMenor();
        lista.gerarMediaPares();

        mensagem = String.format("Soma dos números: %.1f \nQuantidade de números digitados: %.0f \nMédia dos números: %.1f \nMaior número digitado: %.0f \nMenor número digitado: %.0f \nMédia dos números pares: %.1f ", lista.mostrarSoma(), lista.mostrarQuantidade(), lista.mostrarMedia(), lista.mostrarMaior(), lista.mostrarMenor(), lista.mostrarMediaPares());

        JOptionPane.showMessageDialog(null, mensagem);
    }
}