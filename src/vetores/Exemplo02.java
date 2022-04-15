package vetores;

import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n = 10; /// tamanho do vetor
        int v[] = new int[n]; // declaracao do vetor "v"
        int i; // indice ou posicao

        // Entrada de Dados

        for (i = 0; i < n; i++) {
            System.out.printf("Informe %2d. valor de %d: ", (i + n), n);

            v[i] = entrada.nextInt();
            
        }
        entrada.close();
        

        // Processamento: Somar todos os valores, definir o maior e o menor valor

        int soma = 0;
        int menor = v[0]; // v[0] = 10. valor armazenado do vetor "v"
        int maior = v[0];

        for (i = 0; i < n; i++) {

            soma += v[i]; // ou soma = soma + v[i];

            if (v[i] < menor) {

                menor = v[i];

            }

            if (v[i] > maior) {
                maior = v[i];

            }

        }

        // Saída (resultados)
        System.out.printf("\n");

        for (i = 0; i < n; i++) {
            if (v[i] == menor) {
                System.out.printf("v[%d] = %2d <--- menor valor\n", i, v[i]);

            } else if (v[i] == maior) {
                System.out.printf("v[%d] = %2d <--- maior valor \n", i, v[i]);

            } else
                System.out.printf("\nSoma = %d\n", soma);

        }
        

    }

}