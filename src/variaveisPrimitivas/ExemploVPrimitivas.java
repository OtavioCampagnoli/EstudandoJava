/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variaveisPrimitivas;

/**
 *
 * @author otavi
 */
public class ExemploVPrimitivas {

    int quatro = 2 + 2;
    int tres = 5 - 2;
    int oito = 4 * 2;
    int dezesseis = 64 / 4;

    int um = 5 % 2; // 5 divido por 2 dá 2, e tem resto 1;
    // o operador % (módulo) pega o resto da divisão inteira.

    public static void main(String[] args) {
        //imprime a idade.
        int idade = 20;
        System.out.println(idade);

        // gera uma idade no ano que vem
        int idadeAnoQueVem;
        idadeAnoQueVem = idade + 1;

        //imprime a idade
        System.out.println(idadeAnoQueVem);
        // Ponto flutante
        double pi = 3.14;
        double x = 5 * 10;
        System.out.println(pi + "\n" + x);
        // O tipo boolean armazena um valor verdadeiro ou falso (true or false)
        boolean verdade = true;
        System.out.println(verdade);
        idade = 30;
        boolean menorDeIdade = idade < 18;
        System.out.println("Menor de idade: " + menorDeIdade);
        // Tipo char deve estar entre aspas simples ('c'), e não pode guardar um valor vazio (somente usando '')
        char letra = 'a';
        System.out.println(letra);
        
        
    }

}
