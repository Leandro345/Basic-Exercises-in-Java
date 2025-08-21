/********************************************************
AñoBiesiestosSiguientes.java
Leandro Feliz 

Descripcion Basica: Este programa genera una clave
aleatoria para el usuario.
*********************************************************/

import java.util.*;

public class GeneradorDeClaves 
{
    public static void main(String[] args) 
    {

        Scanner entradaTeclado = new Scanner(System.in); //Declaramos objeto Scanner y variables a usar
        final String ABC = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
        String contrasenaSegura = "";
        int numeroAleatorio = 0;
        int longitudContrasena = 0;
        char deseaContinuar = 's';

        System.out.println("Bienvenido al generador de contraseñas!");

        while (deseaContinuar == 's') { //Solo si el usuario desea se ejecuta
            
            contrasenaSegura = "";

            System.out.println("\n¿De cuantos caracteres la desea?: ");
            longitudContrasena = entradaTeclado.nextInt(); //Almacenamos longitud de esta

            entradaTeclado.nextLine();

            for(int i = 0; i <= longitudContrasena; i++)
            {
                numeroAleatorio = (int)(Math.random() * 52 - 1);
                contrasenaSegura += (char)(ABC.charAt(numeroAleatorio)); //Se elige un caracter aleatorio

            }// Final FOR

            System.out.println("Contraseña segura: " + contrasenaSegura);

            System.out.print("\n¿Desea continuar? (s/n): ");
            deseaContinuar = entradaTeclado.nextLine().charAt(0); //Almacenamos respuesta usuario

        }// Final WHILE

        System.out.println("\nHasta luego!");

    } //Fin metodo MAIN
}    // Fin clase GeneradorDeClaves
