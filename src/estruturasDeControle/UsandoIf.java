package estruturasDeControle;

import java.util.Scanner;

public class UsandoIf {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a média: ");
        double media = entrada.nextDouble();

        if (media <= 10 && media >= 7.0) {
            System.out.println("Aprovado!");
            System.out.println("Parabéns!");

        }
        if (media < 7.0 && media >= 4.5) {
            System.out.println("Recuperação!");
            
        } else if (media < 4.5) {
            System.out.println("Reprovado!");

        } 

        entrada.close();

    }

}
