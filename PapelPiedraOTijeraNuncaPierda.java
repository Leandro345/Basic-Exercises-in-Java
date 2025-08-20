import java.util.*;
/************************************************************
PapelPiedraOTijeraQueNuncaPierda.java
Leandro Feliz

Descripcion Basica: Este programa segun la opcion que el 
usuario indique imprimira la opcion que corresponda para
ganar y nunca perdera.
************************************************************/

public class PapelPiedraOTijeraNuncaPierda {
    public static void main (String[] args)
    {
        Scanner entradaDesdeElTeclado = new Scanner(System.in); //Inicializamos objeto scanner y variable
        String opcionDelJugador, seguirJugando = "s";

        while (seguirJugando.equalsIgnoreCase("s")) {

        System.out.println("Bienvenido al programa de Piedra, Papel o Tijera que nunca pierde!");
        System.out.print("Si deseas comprobarlo, inserta una opción: ");
        opcionDelJugador = entradaDesdeElTeclado.nextLine();

        if (opcionDelJugador.equalsIgnoreCase("Piedra")){
            System.out.println("Papel! - Jaja, te dije que nunca pierdo");    
        } else if (opcionDelJugador.equalsIgnoreCase("Papel")) {
            System.out.println("Tijeras! - Jaja, nunca perdere");
        } else if (opcionDelJugador.equalsIgnoreCase("Tijeras")){
            System.out.println("Piedra! - Buen intento!");
        } else if (opcionDelJugador.equalsIgnoreCase("Tijera")) {
            System.out.println("Piedra! - Buen intento!");
        } else {
            System.out.println("Oops, opcion incorrecta hermano!");
        }

        System.out.print("¿Desea continuar jugando? s/n: ");
        seguirJugando = entradaDesdeElTeclado.nextLine();

        }
    
         System.out.println("Buen juego!");
        
    }    
}
