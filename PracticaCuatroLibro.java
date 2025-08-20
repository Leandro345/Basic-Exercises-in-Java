/***************************************************
PracticaUnoLibro.java
Leandro Feliz

Descripcion Basica: Solo un ejercicio del libro
****************************************************/

import java.util.Scanner;

public class PracticaCuatroLibro 
{
    public static void main(String[] args) 
    {

        Scanner entradaTeclado = new Scanner(System.in);
        int marcador = 0;
        int marcadorTotal = 0;
        int cuenta = 0;
        double promedio = 0;
        boolean deseaRepetir = true;
        char respuestaUsuario = ' ';

        while (deseaRepetir)
        {
 
            while (marcador >= 0) 
            {

            System.out.println("Introduzca el marcador (-1 para salir): ");
            marcador = entradaTeclado.nextInt();

            marcadorTotal += marcador;
            cuenta ++;

            }

            if (marcadorTotal <= 0) {
            promedio = (double)marcadorTotal / cuenta;
            }
            else
            {
            promedio = 0;
            }

            System.out.println("El marcador promedio es: " + promedio);


            entradaTeclado.nextLine();

            System.out.println("Desea repetir? (s/n)");
            respuestaUsuario = entradaTeclado.nextLine().charAt(0);

            if (!(respuestaUsuario == 's') || !(respuestaUsuario == 's')) {
                deseaRepetir = false;
            }

        }

    }    
}
