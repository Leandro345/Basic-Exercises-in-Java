/***************************************************
PracticaUnoLibro.java
Leandro Feliz

Descripcion Basica: Solo un ejercicio del libro
****************************************************/

import java.util.Scanner;

public class PracticaCincoLibro 
{
    public static void main(String[] args)
    {
     
        int x = 0;
        Scanner entradaTeclado = new Scanner(System.in);

        do
        {

            x = entradaTeclado.nextInt();

            if (x != 0) {
              System.out.println("Cuadrado = " + (x*x));   
            } 
            else
            {
                System.out.println(" ¿Por que cero? :( ");
            }

        }while(x != 0);

    }
}
