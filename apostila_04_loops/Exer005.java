package desafios.apostila_04_loops;

import javax.swing.JOptionPane;

public class Exer005 {
    //Define dois atributos para a classe
    private float a, b;
    //Esse método atribui um valor ao atributo a e retorna ele
    public float escolherPrimeiroNumero () {
        a = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número:"));
        return a;
    }
    //Esse método atribui um valor ao atributo b e retorna ele
    public float escolherSegundoNumero () {
        b = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número:"));
        return b;
    }
    //Esse método mostra uma mensagem de erro
    public void opcaoInvalida () {
        JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
    }
    //Esse método recebe dois argumentos e retorna a soma do primeiro mais o segundo
    private float soma (float num1, float num2) {
        return num1 + num2;
    }
    //Esse método recebe dois argumentos e retorna a subtração do primeiro menos o segundo
    private float subtracao (float num1, float num2) {
        return num1 - num2;
    }
    //Esse método recebe dois argumentos e retorna a multiplicação do primeiro vezes o segundo
    private float multiplicacao (float num1, float num2) {
        return num1 * num2;
    }
    //Esse método recebe dois argumentos e retorna a divisão do primeiro dividido pelo segundo
    private float divisao (float num1, float num2) {
        return num1 / num2;
    }

public static void main(String[] args) {
        //Defição de variáveis da Main
        float num1, num2; //Essa variável vai armazenar os valores digitados pelo usuário
        boolean continuar = true; //Essa variável vai controlar o loop
        int opcaoSelecionada; //Essa variável vai armazenar a opção selecionada pelo usuário
        //Perceba que podemos usar variáveis com os mesmo nomes dos atributos da classe, pois pertencem a escolpos diferentes
        String a = "1 - Adição", b = "2 - Subtração", c = "3 - Multiplicação", d = "4 - Divisão", e = "5 - Sair";
        //Cria-se um novo objeto (ou instância) da classe para que seja possível usar seus métodos e atríbutos
        Exer005 calc = new Exer005();
        //Loop Do While, ele vai pedir um número e armazenar na variável opcaoSelecionada
        do {
            opcaoSelecionada = Integer.parseInt(JOptionPane.showInputDialog(String.format("Selecione uma opção:\n%s\n%s\n%s\n%s\n%s\n", a, b, c, d, e)));
            //Caso o número atribuido a variável esteja entre o intervalo 1 >= X <= 4
            if (opcaoSelecionada >= 1 && opcaoSelecionada <= 4) {
                //Usamos os métodos para atribuir valores nos atributos do objeto que por sua vez vai retorna-los e serão armazenados nas variáveis
                num1 = calc.escolherPrimeiroNumero();
                //Perceça que especificamos explicitamente o objeto criado anteriormente, pois os métodos não são "static"
                num2 = calc.escolherSegundoNumero();
                //Verifica novamente a variável opcaoSeleciona e executa a tarefa correspondente
                switch (opcaoSelecionada) {
                    case 1: //Exibe o resultado usando uma string formatada, perceba que o ultimo argumento da String.Format é justamente o método da tarefa selecionada
                        JOptionPane.showMessageDialog(null, String.format("A soma de %.1f + %.1f é: %.1f", num1, num2, calc.soma(num1, num2)));     
                        break;
                    case 2://Perceba que os métodos usam como argumentos as variáveis criadas anteriormente com os valores que o usuário digitou
                        JOptionPane.showMessageDialog(null, String.format("A subtração de %.1f + %.1f é: %.1f", num1, num2, calc.subtracao(num1, num2)));
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, String.format("A multiplicação de %.1f + %.1f é: %.1f", num1, num2, calc.multiplicacao(num1, num2)));
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, String.format("A divisão de %.1f + %.1f é: %.1f", num1, num2, calc.divisao(num1, num2)));
                        break;
                } 
            }//Caso o valor da variável opcaoSelecionada seja o 5, torna falsa a variável booleana continuar e isso vai encerra o loop na próxima verificação
            else if (opcaoSelecionada == 5) {
                continuar = false;
            }//Caso o usuário digite qualquer valor que não seja 1, 2, 3, 4 ou 5, invoca o método que exibe a mensagem de erro e continua o loop
            else {
                calc.opcaoInvalida();
            }//Enquanto a variável continuar tiver o valor verdadeiro, o loop vai se repetir   
        } while (continuar);
    }
}