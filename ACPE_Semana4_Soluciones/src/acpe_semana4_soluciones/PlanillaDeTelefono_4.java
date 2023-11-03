/*
Algoritmo-4
Generar un algoritmo que permita calcular y mostrar el valor de la planilla de teléfono de un casa. 
Se debe ingresar el costo por minutos, el número de minutos consumidos en el mes.
 */
package acpe_semana4_soluciones;

import java.util.Scanner;

public class PlanillaDeTelefono_4 {

    public static void main(String[] args) {
        double costoPorMinuto, minutosConsumidos, valorPlanilla;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el costo por minuto: ");
        costoPorMinuto = teclado.nextDouble();
        System.out.print("Ingrese el numero de minutos consumidos en el mes: ");
        minutosConsumidos = teclado.nextDouble();
        valorPlanilla = costoPorMinuto * minutosConsumidos;
        System.out.println("El valor de la planilla del telefono es: " + valorPlanilla);
    }
}