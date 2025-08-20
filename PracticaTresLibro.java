/***************************************************
PracticaUnoLibro.java
Leandro Feliz

Descripcion Basica: Solo un ejercicio del libro
****************************************************/

import java.util.Scanner;

public class PracticaTresLibro
{
    public static void main(String[] args) 
    {
      
        Scanner entradaTeclado = new Scanner(System.in);//Declaramos objeto Scanner y variables a usar
        int i,  num = 0, producto = 1;

        System.out.print("Introduzca un numero \'non\' positivo: ");
        num = entradaTeclado.nextInt(); //Pedimos y almacenamos numero a factorizar

        for(i = 1; i <= num; i++)
        {
            if (i % 2 == 0) {
                
                producto *= i;

            }//Fin IF

        } //Fin FOR

        System.out.println("Producto = " + producto);

    }//Fin metodo MAIN
}   //Fin clase PracticaTresLibro
