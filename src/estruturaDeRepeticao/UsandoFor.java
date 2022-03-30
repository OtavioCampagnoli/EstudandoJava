package estruturaDeRepeticao;

import java.util.*;

public class UsandoFor {
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int times;

		System.out.println("Informe um número a fazer a contagem.\n ");
		times = read.nextInt();

		for (int n = 0; n <= times; n++) {
			System.out.println(n + "\n");
		}
		read.close();
	}
}
