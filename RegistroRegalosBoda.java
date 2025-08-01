/********************************************************
RegistroRegalosBoda
Leandro Feliz 

Descripcion Basica: Este programa se encarga de guardar
los registros de regalos para una boda.
********************************************************/
import java.util.Scanner;

public class RegistroRegalosBoda 
{
    public static void main(String[] args) 
    {
        Scanner entradaTeclado = new Scanner(System.in); //Inicializamos variables a usar y objeto Scanner
        String registroRegalos = "";
        char deseaMas = ' ';
        
        System.out.print("¿Desea crear una lista de regalos para la boda? (s/n): "); //Preguntamos al usuario
        deseaMas = entradaTeclado.nextLine().charAt(0);

        while ((deseaMas == 's') || (deseaMas == 'S')) { //El bucle confirma la decision del usuario y ejecuta o no.
            
            System.out.print("Introduzca el nombre del articulo: "); 
            registroRegalos += entradaTeclado.nextLine() + " - "; //Almacenamos nombre y concatenamos guion para el nombre de la tienda

            System.out.print("Tienda: ");
            registroRegalos += entradaTeclado.nextLine() + "\n";//Almacenamos nombre de tienda y concatenamos un salto de linea para el siguiente articulo


            System.out.print("¿Desea insertar otro articulo?: "); //Preguntamos si desea insertar mas
            deseaMas = entradaTeclado.nextLine().charAt(0);// Almacenamos respuesta

        } //Fin while

        if (!(registroRegalos.equals(" "))) { //Verificamos que el usuario haya insertado contenido
            
            System.out.println();
            System.out.println("Registro de regalos: \n"
            + registroRegalos);

        } //Fin if

        System.out.print(""); //Creamos linea en blanco entre registro y mensaje final
        System.out.println("Buen trabajo!"); //Confirmamos que todo se ejecute completo

    }    
}