/***********************************************************
CaloriasComidas.java
Leandro Feliz

Descripcion Basica: Este programa pide un alimento y la
cantidad de kcal de este al usuario, dandole la oportunidad
de repetir el proceso las veces que quiera. Al final, se
muestran todos los alimentos insertados con sus respectivas
calorias y un numero total de calorias.
**********************************************************/
import java.util.Scanner;

public class CaloriasComidas
{
    public static void main (String[] args)
    {

        Scanner entradaTeclado = new Scanner(System.in); //Inicializamos variables y objeto Scanner
        double kcalTotal = 0, kcalActual;
        String resultadoComidas = "";
        char deseaRepetir = ' ';
        
        System.out.println("Bienvenido al programa de comidas y calorias!"); //Damos bienvenida

        do{
            System.out.print("Inserta el nombre de un alimento!: ");
            resultadoComidas += entradaTeclado.nextLine() + " - "; //Pedimos alimento, pero no se actualiza nada solo se concatena todo de manera consecutiva con operador +=

            System.out.print("Inserta la caloria de este alimento!: ");
            kcalActual = entradaTeclado.nextDouble(); //Guardamos primeramente de manera provisional en "kcalActual"
            resultadoComidas += kcalActual + " kcal \n"; //La concatenamos al resultado que se imprimir al final junto a su nombre
            kcalTotal += kcalActual; //Lo sumamos a la variable de kcal totales
            System.out.println();

            entradaTeclado.nextLine(); //Limpiamos buffer de saltos de linea

            System.out.print("¿Desea insertar otro alimento? (s/n): "); //Le damos la opcion de insertar mas alimentos   
            deseaRepetir = entradaTeclado.nextLine().charAt(0);
            System.out.println();

        } while(deseaRepetir == 's' || deseaRepetir == 'S'); //Fin estructura DO-WHILE

        if (!(resultadoComidas.equals(" "))) {
            
            System.out.println("Alimentos insertados: \n"
            + resultadoComidas); //Imprimimos resultados finales

            System.out.println("Kcal totales: " + kcalTotal+ "."); //Imprimimos kcal totales


        } //Final estructura "IF"

        System.out.println("Buen trabajo!"); //Verificamos que todo este en orden


    }
} 