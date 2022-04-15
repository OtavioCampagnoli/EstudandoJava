package estruturaDeRepeticao;

import java.util.Scanner;

public class ImpriveImparInvertido {

    public static void main(String[] args) {
        // declarando variavel n
        int n = 0;
        // declarando metodo de leitura
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número ímpar");
        n = entrada.nextInt();

        entrada.close();
        // para i de n até 1 passo de -1 repita o bloco
        for (int i = -10; i < n; i++) {

            int t = 2 * i - 1;
            System.out.println(t);
        }
    }

}
