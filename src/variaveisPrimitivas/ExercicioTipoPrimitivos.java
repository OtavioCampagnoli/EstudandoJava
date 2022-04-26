/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variaveisPrimitivas;

/**
 *
 * @author otavi
 */
public class ExercicioTipoPrimitivos {

    /* Na empresa em que trabalhamos, há tabelas com o gasto de cada mês. Para fechar o balanço do
primeiro trimestre, precisamos somar o gasto total. Sabendo que, em janeiro, foram gastos 15 mil
reais, em fevereiro, 23 mil reais e, em março, 17 mil reais, faça um programa que calcule e imprima
a despesa total no trimestre e a média mensal de gastos.*/
    public static void main(String[] args) {

        double gastoTotal, mediaMensalDeGastos;
        double janeiro = 15000, fevereiro = 23000, marco = 17000;

        gastoTotal = janeiro + fevereiro + marco;
        mediaMensalDeGastos = (gastoTotal) / 3;

        System.out.println("Gasto Trimestral: R$" + gastoTotal + "\nMédia mensal de gastos: R$" + mediaMensalDeGastos);

    }

}
