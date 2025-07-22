/*******************************************************
EjercicioFizzBuzz.java
Leandro Feliz 

Descripcion Basica: Este programa muestra una lista de
numeros del 1 al 100 pero intercambia los multiplos de
3 por la palabra "Fizz", multiplos de 5 por "Buzz", y
si es multiplo de ambos "FizzBuzz"
********************************************************/

public class EjercicioFizzBuzz
{
    public static void main (String[] args)
    {
        int numerosDelUnoAlCien;

        for(numerosDelUnoAlCien = 0; numerosDelUnoAlCien <= 100; numerosDelUnoAlCien++) //Realizamos 100 impresiones
        {
           if (numerosDelUnoAlCien%3 == 0 && numerosDelUnoAlCien%5 == 0) { // Si es multipli de 5 y 3 se imprime "FizzBuzz"
                System.out.println("FizzBuzz"); 
           }else if (numerosDelUnoAlCien%3 == 0) {  //Si es multiplo de 3 se imprime "Fizz"
                System.out.println("Fizz");
           }else if (numerosDelUnoAlCien%5 == 0) { //Si es multiplo de 5 se imprime "Buzz"
                System.out.println("Buzz");
           }else{
                System.out.println(numerosDelUnoAlCien); // Si no es multiplo de ninguno se imprime el numero de manera litera
           }
        }

        System.out.println("Good Work!");

    }
}