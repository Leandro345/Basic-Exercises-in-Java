/******************************************************
DimensionesCasa.java
Leandro Feliz

Descripcion Basica: Este programa pide al usuario las
dimensiones de longitud y anchura de cada recamara de 
una casa.
******************************************************/

import java.util.Scanner;

public class DimensionesCasa 
{
    public static void main(String[] args) 
    {
        Scanner entradaTeclado = new Scanner(System.in); //Inicializamos objeto scanner y variables a usar
        String registroRecamaras = " ";
        char deseaRepetir = ' ';

        do //Creamos bucle el cual se repetira al menos una vez
        {
            System.out.print("Inserte nombre/numero de habitacion: ");   //Pedimos nombre de habitacion
            registroRecamaras += entradaTeclado.nextLine() + " = ";

            System.out.print("Inserte ancho de habitacion: ");
            registroRecamaras += entradaTeclado.nextLine() + " ancho x "; //Pedimos largo de habitacion

            System.out.print("Inserte largo de habitacion: ");
            registroRecamaras += entradaTeclado.nextLine() + " largo. \n"; //Pedimos ancho de habitacion

            System.out.print("¿Desea repetir?: "); //Preguntamos si desea repetir el proceso
            deseaRepetir = entradaTeclado.nextLine().charAt(0);

        }while( deseaRepetir == 's'|| deseaRepetir == 'S' ); //Confirmamos que desea continuar o no

        if (!(registroRecamaras.equals(""))) {
            
            System.out.print("");
            System.out.print("Registro de habitaciones: \n" + 
            registroRecamaras);

        } //Fin IF

        System.out.println();
        System.out.println("Buen trabajo!");


    }
}