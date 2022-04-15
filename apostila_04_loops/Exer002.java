package desafios.apostila_04_loops;

public class Exer002 {
    public static void main(String[] args) {
        //Declaração de variáveis
        Integer num = 100;
        
        //Loop while
        while (num >= 1) {
            System.out.print(num + "\t");
            num--;
        }
        //Loop for 
        for (num = 100; num >= 1; num--) {
            System.out.print(num + "\t");
        }
        //Loop do while
        do {
            System.out.print(num-- + "\t");
        }
        while (num >= 1);
    }
}
