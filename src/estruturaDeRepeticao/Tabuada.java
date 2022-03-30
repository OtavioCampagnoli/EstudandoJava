package estruturaDeRepeticao;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		int valor;
		Scanner reader = new Scanner(System.in);
		System.out.println("Informe o valor da tabuada.");
		valor = reader.nextInt();
		System.out.println("Tabuada do " + valor);
		/*
		 * INICIO i = 0; FIM i < 10; INCREMENTO i++ ou i=i+1
		 */
		for (int i = 0; i <= 10; i++) {

			System.out.println(valor + " X " + i + " = " + valor * i);

		}

		reader.close();

	}

}
