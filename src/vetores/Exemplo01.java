package vetores;

public class Exemplo01 {
    public static void main(String[] args) {
        /*
         * vetores são estrutura de dados que armazenam normalmente um
         * quantidade fica de dados de um certo tipo; por isso são conhecidos
         * como estruturas de dados
         */

        /*Na declaração de vetores devem ser fornecidas três informações
        1-) o nome do vetor
        2-) O número do vetor(o seu tamanho
        3-) O tipo de dado que será armazenado no vetor.
        A declaração de um vetor de um vetor para "inteiros", de nome "vetor" */

       // int vetor[]; // Declaração de um vetor do tipo inteiro com nome vetor!
        
        /*Podemos notar que as declarações de vetores são parecidas às declarações de variáveis, os elementos sintáticos
        diferenciam as váriaveis do tipo vetor das outras váriaveis são os colchetes[].
        Embora declarado, o vetor não está pronto para uso, sendo necessário reservar espaço na memória para seus elementos
        (uma operação de alocação de memória). */ 

        //vetor = new int[10];// alocação de espaço para vetor;

        /*Na alocação de espaço, não repetimos os colchetes e utilizamos o operador new (uma palavra reservada da linguagem)
        para reservar espaço para 10(dez) elementos do tipo int.
        As duas declarações podem ser combinadas em uma única senteça de código, mais compacta:*/

      //  int vetor01[] = new int [10];

        /*Exemplos de declarações
        Na linguagem java um vetor é uma classe, portando, deve-se utilizar o método new, que ativa o método construtor
        correspondente, para criar instâncias, ou exemplares, da classe vetor do tipo selecionado(int, double, float, char,
        String, long, byte...), por exemplo:      */

        //a-) declarando um vetor para armazenar 10 números inteiros;

      ///  int[] nro = new int[10];

        //b-) declarando um vetor para armazenar 10 valores do tipo real (ou monetários)

       // double[] salario = new double[10];

        //c-) declarando um vetor para armazenar o nome dos 12 meses do ano.

      //  String[] mes = new String[12];

        int n = 10; // tamanho do vetor

        int v[] = new int[n]; // declaração de um vetor de int que recebe o tamanho de n (10)

        int i; //indice ou posicao

        //processando os "n" elementos do vetor "v".
        for(i = 0; i<n; i++){

            v[i] = i; // na i-nésima posição do vetor "v" armazena o valor da variável "i"
            
            
            System.out.println("Valor do vetor: " + v + "\nPosição do vetor: " + v[i]);
        }

    }
}