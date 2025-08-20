/************************************************************
CalculadorDeLitros.java
Leandro Feliz 

Descripción Básica: Este programa pide al usuario la 
capacidad maxima de agua de su tanque, y finalmente muestra
el proceso de llenado de este, cuanto se toma en llenarse,
con una cantidad de constante de 2 litros por minuto.
************************************************************/

import java.util.Scanner;

public class CalculadorDeLitros 
{
    public static void main(String[] args) 
    {
        
        Scanner entradaTeclado =  new Scanner(System.in); //Inicializamos objeto Scanner y variables a utilizar
        double cantidadAguaActual = 0, cantidadMaximaTanque, litrosPorMinuto = 2;
        int minutoActual = 0; 

        System.out.println("Bienvenido al programa calculador de litros!");

        System.out.print("Inserte la capacidad maxima de su tanque (en litros): ");
        cantidadMaximaTanque = entradaTeclado.nextDouble();
        
        entradaTeclado.nextLine(); //Limpiamos Buffer de saltos de linea

        while (cantidadAguaActual + litrosPorMinuto <= cantidadMaximaTanque) {
            minutoActual += 1; //Incremetamos la cantidad de minutos cada vez que se repita el bucle

            cantidadAguaActual += litrosPorMinuto; //Aumentamos la cantidad de agua en el tanque en cada iteracion

            if (cantidadAguaActual + litrosPorMinuto >= cantidadMaximaTanque) { //Hacemos que cuando vaya a pasarse en la proxima iteracion se iguale al maximo, haciendo que de esta manera en la proxima iteracion la condicion sea falsa.
                cantidadAguaActual = cantidadMaximaTanque;
            }

            System.out.println(minutoActual + " minutos: " + cantidadAguaActual + " litros."); //Imprimimos el proceso de cada iteracion

        }

        System.out.println("Tanque lleno en un total de " + minutoActual + " minutos.");
        System.out.println("Buen trabajo!");

    }
}
