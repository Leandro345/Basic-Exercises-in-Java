/**********************************************************************
 SumaNumerosPares.java
 Leandro Feliz

 Descripcion Basica: Este programa pide al usuario una cantidad 
 de 4 numeros a insertar, despues muestra en pantalla los numeros
 que inserto y el resultado de la suma de unicamente los que son
 pares.
 *********************************************************************/

import java.util.Scanner;

public class SumaNumerosPares
{
  public static void main (String[] args)
  {
    
    int valorUno = 0, valorDos = 0, valorTres = 0, valorCuatro = 0, resultadoFinal = 0, variableBucle = 0; //Declaramos variables
    Scanner entradaTeclado = new Scanner(System.in); //Inicializamos el objeto de entrada Scanner
  
    while(variableBucle <= 4)
    {
        variableBucle++;

        if(variableBucle == 1) // If & Else para saber donde guardar los valores insertados
        {
             System.out.println("Inserte cuatro valores siguientes");
            valorUno = entradaTeclado.nextInt();

            if (valorUno%2 == 0) { // Verificamos si es par
                resultadoFinal = resultadoFinal + valorUno; 
            }
        }else if (variableBucle == 2) 
        {
            System.out.println("Inserte valor");
            valorDos = entradaTeclado.nextInt();  
            
            if (valorDos%2 == 0) { // Verificamos si es par
                resultadoFinal = resultadoFinal + valorDos; 
            }  
        }else if (variableBucle == 3)
        {
            System.out.println("Inserte valor");
            valorTres = entradaTeclado.nextInt();

             if (valorTres%2 == 0) { // Verificamos si es par
                resultadoFinal = resultadoFinal + valorTres; 
            }
        }else if (variableBucle == 4) {
            System.out.println("Inserte valor");
            valorCuatro = entradaTeclado.nextInt();

             if (valorCuatro%2 == 0) { // Verificamos si es par
                resultadoFinal = resultadoFinal + valorCuatro; 
            }    
        }
    }  
 
    System.out.println("Los numeros que inserto fueron: " + valorUno + " "
    + valorDos + " " + valorTres + " " + valorCuatro);
     
    System.out.println("El resultado de la suma de numeros pares es: " + resultadoFinal);

  } //Final metodo Main
}  // Final clase SumaNumerosPares
