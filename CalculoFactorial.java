/********************************************************
CalculoFactorial.java
Leandro Feliz

Descripcion Basica: Este programa se encarga de 
calcular el factorial de un numero brindado por el 
usuario
********************************************************/

import java.util.Scanner;

public class CalculoFactorial 
{
    public static void main (String[] args)
    {

        Scanner entradaTeclado = new Scanner(System.in); //Inicializamos objeto Scanner y variables a usar
        double factorial = 1;
        int numeroUsuario = 0;

        System.out.print("Inserte un numero: ");
        numeroUsuario =  entradaTeclado.nextInt(); //Almacenamos numero escrito por el usuario

        if (numeroUsuario <= 0) { //Si el valor del usuario es menor o igual a 0 no se calcula el factorial
            
            System.out.println("Ups, valor incorrecto!");

        } else { //Si el valor del usuario es mayor a 0 se calcula el factorial

            for(int i = 1; i <= numeroUsuario; i++){ //El bucle se itera la cantidad de veces segun el valor del Usuario

                factorial *= i; //En cada iteracion se calcula el resultado de el factorial por el indice, y no se reasigna en cada iteracion, sino que se actualiza o suma al valor que posea

            }

        }

        System.out.println("El factorial de su numero es: " + factorial); //Se imprime resultado final
        System.out.println("Buen trabajo!"); //Se verifica que el programa se ejectute correctamente

    }    
}
