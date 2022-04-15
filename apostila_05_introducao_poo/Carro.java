package desafios.apostila_05_introducao_poo;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro (String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public Carro (String marca, String modelo, int ano) {
        this (modelo, ano);
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setNome(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}