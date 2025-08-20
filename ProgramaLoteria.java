/****************************************************
ProgramaLoteria.java
Leandro Feliz

Descripcion Basica: Este programa pide al usuario un
numero para adivinar otro, si adivina, gana 
un millon de dolares, de lo contrario puede seguir 
intentanda hasta que gane o no tenga mas balance
****************************************************/

import java.util.*;

public class ProgramaLoteria 
{
    public static void main(String[] args) 
    {
        Scanner entradaTeclado = new Scanner(System.in); //Declaramos objetos Scanner y variables a usar
        int numeroUsuario = 0, numeroAletorio = 0, balanceUsuario = 10, intentos = 0, adivinados = 0;
        char deseaContinuar = ' ';
        boolean deseaContinuarMaquina = false;

        System.out.println("Bienvenido a la loteria!"); 
        
        do
        {

            if (intentos == 0) {                           //Unicamente se imprimir "su balance inicial" en el primer intento
                System.out.print("Su balance inicial es de " + balanceUsuario + ", indique un numero para adivinar: ");
                numeroUsuario = entradaTeclado.nextInt(); //Almacenamos numero dado
                intentos += 1;                           //Aumentamos cantidad de intentos y disminuimos el balance en cada iteracion
                balanceUsuario -= 1;

                entradaTeclado.nextLine();             //Limpiamos buffer para evitar errores

            }// Final IF

            else
            {
                System.out.print("Su balance es de: " + balanceUsuario + ", indique un numero para adivinar: "); //Si no es el primer intento no se imprime "Su balance inicial"
                numeroUsuario = entradaTeclado.nextInt(); //Almacenamos numero dado
                intentos += 1;                            //Aumentamos cantidad de intentos y disminuimos el balance en cada iteracion
                balanceUsuario -= 1;

                entradaTeclado.nextLine();               //Limpiamos vuffer para evitar errores

            }//Final ELSE

            numeroAletorio = (int)(Math.random() * 11); //Creamos el numero random 

            if (!(numeroUsuario == numeroAletorio))  //Codigo a ejecutar si no son iguales
            {

                System.out.println("\nUps!");
                System.out.println("Su numero: " + numeroUsuario);
                System.out.println("Numero a adivinar: " + numeroAletorio);

                System.out.print("\n¿Desea continuar?: (s/n): ");
                deseaContinuar = entradaTeclado.nextLine().charAt(0); //Almacenamos respuesta

                    if (deseaContinuar == 's')                            //Codigo a ejecutar si desea continuar
                    {
                        deseaContinuarMaquina = true;
                    }//Final IF

                    else                                               //Codigo a ejecutar si no se desea continuar
                    {
                        deseaContinuarMaquina = false;               //Se asigna a false
                        System.out.println("\nBalance final:  " + balanceUsuario);
                        System.out.println("Intentos:  " + balanceUsuario);
                        System.out.println("Adivinados:  " + adivinados);
                    }// Final ELSE

            }//Final IF

            else //Codigo a ejecutar si son iguales
            {
                System.out.println("\nHAS GANADO 1 MILLON!");
                System.out.println("\nSu numero: " + numeroUsuario);
                System.out.println("Numero a adivinar: " + numeroAletorio);

                System.out.println("\nBalance final:  " + (balanceUsuario + 1000000));
                System.out.println("Intentos:  " + balanceUsuario);
                System.out.println("Adivinados:  " + (adivinados + 1));

                deseaContinuarMaquina = false; //Se asigna false automaticamente para que el usuario no siga
            }

        }while(deseaContinuarMaquina && balanceUsuario < 0); //Final DO-WHILE

        if (balanceUsuario == 0) { //Se verifica al terminar si este se quedo sin balance para avisarle
            System.out.println("Al parecer te quedaste sin balance!");
        }

        System.out.println("\nHasta luego!");

    } // Fin metodo MAIN   
}    // Fin clase Programa Loteria
