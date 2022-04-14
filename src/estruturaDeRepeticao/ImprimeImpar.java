package estruturaDeRepeticao;

import java.util.Scanner;

public class ImprimeImpar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // declarando n
        int n = 0;
        // leia n;
        System.out.println("Informe um número\n");
        n = entrada.nextInt();
        entrada.close(); //fechando leitura
        
        // para i de 1 até n repita
        for (int i = 1; i <= n;) {
            int t = 2 * i - 1;
            i++; //atualizando o contador, i++ é a mesma coisa de i = i + 1
            System.out.println(t);
        }

    }

}
