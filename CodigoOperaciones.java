//Programa basico en JAVA

import java.util.Scanner;

public class P{
 public static void main(String [] args){

    int valor_uno = 0; // Aqui creamos todas las variables que usaremos
    int valor_dos = 0;
    int suma = 0;
    int resta = 0;
    int multiplicacion = 0;
    int division = 0;
    int valorDe = 0; 

    Scanner entrada = new Scanner(System.in); //Aqui creamos e inicializamos el objeto Scanner
    entrada = new Scanner(System.in);

    System.out.println("Que quieres que haga por ti?"); //Aqui le preguntamos que hacer al usuario
    System.out.println("");
    System.out.println("");
    System.out.println("Suma? digite el numero 1");
    System.out.println("");
    System.out.println("");
    System.out.println("Resta? digite el numero 2");
    System.out.println("");
    System.out.println("");
    System.out.println("Multiplicacion? digite el numero 3");
    System.out.println("");
    System.out.println("");
    System.out.println("Division? digite el numero 4");
    System.out.println("");
    valorDe = entrada.nextInt();

    if(valorDe == 1){ //Aqui le decimos que hacer si el usuario digita el numero 1

      System.out.println("");  
      System.out.println("Inserte el primer valor: "); 
      valor_uno = entrada.nextInt();

      System.out.println("");
      System.out.println("Inserte el segundo valor: ");
      valor_dos = entrada.nextInt();

      suma = valor_uno + valor_dos;

      System.out.println("El resultado de su suma es: " + suma);

    } else if(valorDe == 2){ //Aqui le decimos que hacer si el usuario digita el numero 2

      System.out.println("");  
      System.out.println("Inserte el primer valor: ");
      valor_uno = entrada.nextInt();

      System.out.println("");
      System.out.println("Inserte el segundo valor");
      valor_dos = entrada.nextInt();

      resta = valor_uno - valor_dos;

      System.out.println("El resultado de su resta es: " + resta);

    } else if(valorDe == 3){ //Aqui le decimos que hacer si el usuario digita el numero 3

      System.out.println("");  
      System.out.println("Inserte el primer valor: ");
      valor_uno = entrada.nextInt();

      System.out.println("");
      System.out.println("Inserte el segundo valor: ");
      valor_dos = entrada.nextInt();

      multiplicacion = valor_uno * valor_dos;

      System.out.println("El resultado de su multiplicacion es: " + multiplicacion);

    } else if(valorDe == 4){ //Aqui le decimos que hacer si el usuario digita el numero 4

      System.out.println("");  
      System.out.println("Inserte el primer valor: ");
      valor_uno = entrada.nextInt();

      System.out.println("");
      System.out.println("Inserte el segundo valor: ");
      valor_dos = entrada.nextInt();

      division = valor_uno / valor_dos;

      System.out.println("El resultado de su division es: " + division);  
    }
 }   
}