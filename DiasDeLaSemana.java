/****************************************************
DiasDeLaSemana.java 
Leandro Feliz

Descripcion Basica: Este programa se encarga de
pedir un numero al usuario, del 1 al 7, e imprimir
un el nombre de un dia de la semana correspondiente
al numero.
****************************************************/

import java.util.Scanner;

public class DiasDeLaSemana 
{
    public static void main (String[] args)
    {

        int diaSemana = 0; // Inicializacion de variables y objeto Scanner
        Scanner entradaTeclado = new Scanner(System.in);
        String deseaRepetir = "s";

        System.out.println("Bienvenido al programa!");


        while (deseaRepetir.equalsIgnoreCase("s")) { //Mientras la respuesta sea igual a "s" se repetira de manera indefinida

        System.out.print("Introduzca un numero para la impresion de un dia de la semana: ");
        diaSemana = entradaTeclado.nextInt(); //Recibimos y almacenamos numero

        entradaTeclado.nextLine(); //Limpiamos saltos de linea


            switch (diaSemana) {
            case 1:
                System.out.println("Lunes!"); // Colocamos un dia en relacion a cada numero del 1-7
                break;
            case 2:
                System.out.println("Martes!");
            break;

            case 3:
                System.out.println("Miercoles!");
            break;

            case 4:
                System.out.println("Jueves!");
            break;
            
            case 5:
                System.out.println("Viernes!");
            break;

            case 6:
                System.out.println("Sabado!");
            break;

            case 7:
                System.out.println("Domingo!");
            break;

            default:
                System.out.println("Ups, fuera de rango! intente de nuevo."); // Opcion alternativa si el usuario inserta un numero mayor a 7
                break;
           }

           System.out.println("¿Desea iniciar de nuevo? (s/n)"); //Verificamos si el usuario desea repetir
           deseaRepetir = entradaTeclado.nextLine(); //Guardamos respuesta
        }

        System.out.println("Buen trabajo!"); // Verificamos que el programa se ejecute completo

    } //Fin metodo Main
}    // Fin clase DiasDeLaSemana
