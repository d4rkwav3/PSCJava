package desafios.apostila_05_introducao_poo;

public class Carro {
    //Atributos da classe encapsulados
    private String marca;
    private String modelo;
    private int ano;
    //Construtor
    public Carro (String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }
    //Outro construtor, esse utiliza o construtor acima, assim não é necessário reescrever o mesmo código
    public Carro (String marca, String modelo, int ano) {
        this (modelo, ano);
        this.marca = marca;
    }
    //Método para saber o valor do atributo Marca
    public String getMarca() {
        return this.marca;
    }
    //Método para alterar o valor do atributo Marca
    public void setMarca(String marca) {
        this.marca = marca;
    }
    //Método para saber o valor do atributo Modelo
    public String getModelo() {
        return this.modelo;
    }
    //Método para alterar o valor do atributo Modelo
    public void setNome(String modelo) {
        this.modelo = modelo;
    }
    //Método para saber o valor do atributo ano
    public int getAno() {
        return this.ano;
    }
    //Método para alterar o valor do atributo ano
    public void setAno(int ano) {
        this.ano = ano;
    }
}