package desafios.apostila_05_introducao_poo;

import java.util.Scanner;

public class TesteCarro {
    public static void main(String[] args) {
        String nome1, nome2;
        int ano1, ano2;

        Scanner input = new Scanner(System.in);

        System.out.print("Qual o modelo do carro 1: ");
        nome1 = input.nextLine();
      
        System.out.print("Qual o ano do carro 1: ");
        ano1 = input.nextInt();
        input.nextLine();

        System.out.print("Qual o modelo do carro 2: ");
        nome2 = input.nextLine();
 
        System.out.print("Qual o ano do carro 2: ");
        ano2 = input.nextInt();
        input.close();

        Carro carro1 = new Carro(nome1, ano1);
        Carro carro2 = new Carro(nome2, ano2);

        System.out.printf("\nCarro 1: %s, ano: %d.\nCarro 2: %s, ano: %d.", carro1.getModelo(), carro1.getAno(), carro2.getModelo(), carro2.getAno());
    }
}
