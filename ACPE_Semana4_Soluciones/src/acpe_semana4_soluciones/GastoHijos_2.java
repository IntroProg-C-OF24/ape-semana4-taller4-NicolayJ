/*
Algoritmo-2
Generar un algoritmo que permite ingresar los gastos de tres hijos de un padre de familia; 
calcular y mostrar el total de gastos de los hijos del padre de familia. 
 */
package acpe_semana4_soluciones;

import java.util.Scanner;

public class GastoHijos_2 {

    public static void main(String[] args) {
        double gastosHijo1, gastoHijo2, gastoHijo3, gastosTotales;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa los gastos del hijo 1: ");
        gastosHijo1 = teclado.nextDouble();
        System.out.println("Ingresa los gastos del hijo 2: ");
        gastoHijo2 = teclado.nextDouble();
        System.out.println("Ingresa los gastos del hijo 3: ");
        gastoHijo3 = teclado.nextDouble();
        gastosTotales = (gastosHijo1 + gastoHijo2 + gastoHijo3);
        System.out.println("Los gastos totales de los 3 hijos son: " + gastosTotales);
    }
}