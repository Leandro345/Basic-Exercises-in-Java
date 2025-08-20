/************************************************************
InvertidorDeCadenas.java
Leandro Feliz 

Descripcion Basica: Este programa recibe de parte del usuario 
una secuencia de caracteres y devuelve la misma al reves
o invertida.
************************************************************/

import java.util.*;

public class InvertidorDeCadenas {
    public static void main (String[] args)
    {
       Scanner entradaDesdeElTeclado = new Scanner(System.in); //Inicializamos entrada del teclado con objeto Scanner
       String palabraARecibir; // Inicializamos variables
       int cantidadDeCaracteres;


       System.out.println("Bienvenido al programa invertidor de cadenas!");
       System.out.println("Inserte una palabra que desea invertir");
       palabraARecibir = entradaDesdeElTeclado.nextLine(); // Asignamos la palabra a la variable
       cantidadDeCaracteres = palabraARecibir.length();   // Guardamos la cantidad de consonantes en esta variable

       for(int i = cantidadDeCaracteres - 1; i >= 0; i--)
       {
            System.out.print(palabraARecibir.charAt(i));
       }

       System.out.print(" - Palabra invertida!"); 
       System.out.println( "\n" +"Buen trabajo!"); // Confirmamos que todo haya salido correcto y el programa se completa.

    }    
}
