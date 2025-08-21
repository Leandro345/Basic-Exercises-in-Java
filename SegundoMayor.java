/*********************************************************
SegundoMayor.java
Leandro Feliz

Descripcion Basica: Este programa pide numeros al usuario
hasta que este decida detenerse, posteriormente muestra
la lista final de todos los numeros y el segundo mayor. 
**********************************************************/

import java.util.*;

public class SegundoMayor 
{
    public static void main(String[] args) 
    {
        Scanner entradaTeclado = new Scanner(System.in);
        Integer numeroActual = 0; //Declaramos variables
        String listaFinal = " ";
        int segundoMayor = 0;
        int primerMayor = 0;
        char otroNumero = 'n';
        int iteracion = 0;


        System.out.println("Bienvenido! ");

        do
        {

            System.out.print("Inserte un numero: ");
            numeroActual = entradaTeclado.nextInt();

            if (iteracion == 0) {
                primerMayor = numeroActual;
                listaFinal = numeroActual.toString(numeroActual);
                iteracion += 1;
            }

            else
            {

                listaFinal += numeroActual + " ";

                if (numeroActua)
                {
                    
                }

            }

        }while(otroNumero == 's');

    } //Final metodo MAIN
}    // Final clase SegundoMayor
