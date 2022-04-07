package estruturaDeRepeticao;

public class SomaPar {
    public static void main(String[] args) {
        // Enunciado: Obter a soma dos n primeiros números pares positivos.
        // Esclarecimentos: O valor de n é dado, sendo n inteiro e positivo.
        int n = 4;
        int s = 0;

        // para i de 1 até n repita
        for (int i = 1; i <= n; i++) {
            int t = 2 * i;
            s += t;
            System.out.print( s + "+");
        }

    }

}