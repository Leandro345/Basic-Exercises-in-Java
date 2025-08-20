/*****************************************************************
LetrasSiYNo.java
Leandro Feliz

Descripcion Basica: Este programa pide dos cadenas de caracteres
al usuario y devuelve el resultado de aquellas consonantes que
estan en la primera, pero no en la segunda, y las que estan en
la segunda pero no en la primera
*****************************************************************/

import java.util.*;

public interface LetrasSiYNo 
{
    public static void main(String[] args) 
    {
        
        Scanner entradaTeclado = new Scanner(System.in); //Inicializamos objeto y Scanner y objeto a utilizar
        String primeraPalabra = " ", segundaPalabra = " ", primeraNoSegunda = " ", segundaNoPrimera = " ";

        System.out.println("Bienvenido!");

        System.out.print("Inserte la primera palabra: "); 
        primeraPalabra = entradaTeclado.nextLine(); //Recibimos y almacenamos palabra en variable
        primeraPalabra = primeraPalabra.toLowerCase();

        System.out.print("Inserte la segunda palabra: ");
        segundaPalabra = entradaTeclado.nextLine(); //Recibimos y almacenamos palabra en variable
        segundaPalabra = segundaPalabra.toLowerCase();

        System.out.println("\nResultado: ");

        /*************************************************************************************************/
        //Codigo para hallar aquellas que estan en la primera, pero no en la segunda

        for(int i = 0; i <= primeraPalabra.length() - 1; i++)
        {    
            char caracterActual = primeraPalabra.charAt(i); //Guardamos el caracter o posicion actual para hacer la comparacion mas facil
            if (segundaPalabra.indexOf(caracterActual) == -1 && primeraNoSegunda.indexOf(caracterActual) == -1) { //Verificamos que no este ni en la segunda, ni en el resultado final para que no se repita
                primeraNoSegunda += caracterActual; //Si no esta, se guarda en el resultado
            }

        } //Final FOR
        
        System.out.println("Palabras en la primera pero no segunda:" + primeraNoSegunda);
        
        /*************************************************************************************************/
        //Bucle para hallar aquellas que estan en la segunda, pero no en la primera//
      
        for(int i = 0; i <= segundaPalabra.length() - 1; i++) //Bucle para confirmar cada posicion o 'indice' de la palabra y que letras o no se encuentran
        {
            char caracterActual = segundaPalabra.charAt(i); //Utilizamos una variable auxiliar para guardar el caracter que estamos comparando
            if (primeraPalabra.indexOf(caracterActual) == -1 && segundaNoPrimera.indexOf(caracterActual) == -1){ //Verificamos que no esta ni en la primera palabra, ni en resultado final
                segundaNoPrimera += caracterActual; //Concantenamos todo, no actualizamos
            }
        }

          System.out.println("Palabras en la segunda pero no en la primera:" + segundaNoPrimera);

        System.out.println("Buen trabajo!");

    }    
}
