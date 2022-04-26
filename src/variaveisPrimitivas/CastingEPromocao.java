package variaveisPrimitivas;

public class CastingEPromocao {

  public static void main(String[] args) {
    //  double d = 3.1415;
    // int i = d; // não compila
    // A mesma coisa
    // int i = 3.14;

    /*O mais interessnate é que nem mesmo o seguinte código compila: 
    double d = 5; ok, double pode conter numero inteiro.

    int i = d; -> Não compila;


    */
    // O casting foi feito para moldar a variável d3 como um int. O valor de i agora é 3.
    //O mesmo caso ocorre entre valores int e long.
    double d3 = 3.84;
    int i = (int) d3;
    System.out.println(i);
    long x = 10000;
    int i2 = (int) x; // Não compila pois estamos perdendo informação
    System.out.println(i2);

    /*CASOS NÃO TÃO COMUNS DE CASTING E ATRIBUIÇÃO
    Alguns castings aparecem também:
    float x = 0.0;
    O código acima não compila, pois todos os literais com ponto flutuante são considerados double pelo Java.
    E float não pode receber um double sem a perda de informação. Para fazê-lo funcionar, podemos escrever:
   
    float x = 0.0f;
    
    A letra f, que pode ser maiúscula ou minúscula, indica que aquele literal deve ser tratado como float .

    Outro caso que é mais comum:

    double d = 5;
    float f = 3;
    float x = f + (float) d;

    Você precisa do casting porque o Java faz as contas e vai armazenando sempre no maior tipo
que apareceu durante as operações, neste caso, o double .
E uma observação: no mínimo, o Java armazena o resultado em um int na hora de fazer as
contas.

    Até casting com variáveis do tipo char podem ocorrer. O único tipo primitivo que não pode
ser atribuído a nenhum outro tipo é o boolean . */

  }
}
