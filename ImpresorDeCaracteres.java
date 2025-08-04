/**************************************************
ImpresorDeCaracteres.java
Leandro Feliz

Descripcion Basica: Este programa pide
al usuario un caracter aleatorio, despues
pide cantidad de renglones y columnas que desea
a imprimir, por ultimo se muestra el resultado.
**************************************************/

import java.util.Scanner;

public class ImpresorDeCaracteres 
{
    public static void main(String[] args) 
    {
        
        Scanner entradaTeclado = new Scanner(System.in); //Inicializamos variables y objeto Scanner
        int cantidadRenglones, cantidadColumnas;
        char caracterUsuario = ' ';

        System.out.print("Inserte un caracter aleatorio: ");
        caracterUsuario = entradaTeclado.nextLine().charAt(0); //Pedimos y almacenamos caracter

        System.out.print("Inserte cantidad de renglones: ");
        cantidadRenglones = entradaTeclado.nextInt(); //Pedimos y almacenamos cantidad de renglones

        entradaTeclado.nextLine(); //Limpiamos buffer

        System.out.print("Inserte cantidad de columnas: ");
        cantidadColumnas = entradaTeclado.nextInt();// Pedimos y almacenamos cantidad de columnas

        System.out.println("Resultado: ");

        for( int reg = 1; reg >= cantidadRenglones; reg++){

            for(int col = 1; col >= cantidadRenglones; col++){

                System.out.println(caracterUsuario);

            }//Final bucle "Col"


            System.out.println();

        }//Final bucle "Reg" 

        System.out.println("Buen trabajo!");

    } //Final metodo Main
}    // Final clase ImpresorDeCaracteres
