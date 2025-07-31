/**************************************************
CalificacionsEnMatematicas.java
Leandro Feliz 

Descripcion Basica: Este programa se encarga
de pedir al usuario su letra de calificacion
en Matematicas y dependiendo de la respuesta
imprimira: "Excelente!", "Bien!", "No esta mal!",
etc.
**************************************************/

import java.util.Scanner;

public class CalificacionesEnMatematicas 
{
    public static void main(String[] args) 
    {

        char calificacionUsuario = ' '; //Inicializamos variable de calificacion y objeto Scanner
        Scanner entradaTeclado = new Scanner(System.in);
        String deseaRepetir = "s";

        System.out.println("Bienvenido!");



        while (deseaRepetir.equalsIgnoreCase("s")) { //Siempre que la respuesta sea "s" se repetira

        System.out.print("Inserte se letra de notificacion aqui (Mayusculas): ");
        calificacionUsuario = entradaTeclado.nextLine().charAt(0); // Pedimos y almacenamos letra

         //Limpiamos Buffer

             switch (calificacionUsuario) {
            case 'A':
                System.out.println("Excelente, Superrr!"); //Comparamos cada caso y se imprime segun la respuesta
                break;

            case 'B':
                System.out.println("Excelente!");
                break; 
            
            case 'C':
                System.out.println("Bien");
                break;    
        
            case 'D':
                System.out.println("No esta mal");
                break;
                
            default:
                System.out.println("Ups!, fuera de rango o letra no en mayusculas.");
                break;
            }

        System.out.println("¿Desea repetir? (s/n)");
        deseaRepetir = entradaTeclado.nextLine(); //Preguntamos si desea repetir y guardamos respuesta

        }

        System.out.println("Buen trabajo!"); //Verificamos que el programa se ejecute completo

    }// Fin metodo Main    
}   // Fin clase CalificacionesEnMatematicas
