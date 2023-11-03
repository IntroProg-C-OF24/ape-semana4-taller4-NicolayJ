/*
Algoritmo-5
Generar un algoritmo que permita calcular y mostrar el costos de una computadora de escritorio. 
La misma es comprada por partes; CPU, teclado, pantalla, ratón. 
 */
package acpe_semana4_soluciones;

import java.util.Scanner;

public class CostoDeComputadora_5 {

    public static void main(String[] args) {
        double costoCpu, costoTeclado, costoPantalla, costoRaton, costoTotal;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el precio de la CPU: ");
        costoCpu = teclado.nextDouble();
        System.out.print("Ingrese el precio del Teclado: ");
        costoTeclado = teclado.nextDouble();
        System.out.print("Ingrese el precio de la Pantalla: ");
        costoPantalla = teclado.nextDouble();
        System.out.print("Ingrese el precio del Raton: ");
        costoRaton = teclado.nextDouble();
        costoTotal = (costoCpu + costoTeclado + costoPantalla + costoRaton);
        System.out.println("El costo total de la computadora de escritorio es: " + costoTotal);
    }
}