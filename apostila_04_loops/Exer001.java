package desafios.apostila_04_loops;

public class Exer001 {
    public static void main(String[] args) {
        //Declaração de variáveis
        Integer num = 1;

        //Loop while enquanto a variável num for menor ou igual a 100 o loop se repete
        while (num <= 100) {
            System.out.print(String.format("%d, ", num)); //Mostra o resultado no terminal usando tabulações
            num++; //Aumenta a variável num em 1 unidade
        }
        /*Loop for
        for (num = 1; num <= 100; num++) {
            System.out.print(num + "\t");
        }
        //Loop do while
        do {
            System.out.print(num++ + "\t");
        }
        while (num <= 100);*/
    }
}

