/***************************************************
PracticaUnoLibro.java
Leandro Feliz

Descripcion Basica: Solo un ejercicio del libro
****************************************************/

public class PruebaMetodosMATH 
{
    public static void main(String[] args) 
    {
        
        double numero = -70;
        double valorAbsoluto = Math.abs(numero); //Devuelve el valor absoluto de un numero
        System.out.println((int)valorAbsoluto);

        double numeroDos = -90;
        double valorAbsolutoDos = Math.abs(numeroDos); //Devuelve el valor absoluto de un numero
        System.out.println((int)valorAbsolutoDos);


        double numeroTres = 70.7;
        double valorAbsolutoTres = Math.ceil(numeroTres); //Busca el entero mas pequeño posible que sea mayor o igual a este
        System.out.println(valorAbsolutoTres);

        double numeroCuatro = 2;
        double valorAbsolutoCuatro = Math.exp(numeroCuatro); //Devuelve la exponencia del numero de Euler (2.7 y pico) con el numero que demos
        System.out.println(valorAbsolutoCuatro);
        
        double numeroCinco = 455.3;
        double valorAbsolutoCinco = Math.floor(numeroCinco); //Busca el entero mas grande posible que sea mayor o igual a este
        System.out.println(valorAbsolutoCinco);

        double numeroSeis = 70.5, numeroSiete = 60;
        double valorAbsolutosSeis = Math.max(numeroSeis, numeroSiete); //Devuelve el mas grande de dos numeros
        System.out.println((int)valorAbsolutosSeis);

        double numeroOcho = 70.5, numeroNueve = 60;
        double valorAbsolutosSiete = Math.min(numeroSeis, numeroSiete); //Devuelve el mas grande de dos numeros
        System.out.println((int)valorAbsolutosSiete);

        double numeroDiez = 10, numeroOnce = 2;
        double valorAbsolutosOcho = Math.pow(numeroDiez, numeroOnce); //Devuelve el mas peque de dos numeros
        System.out.println((int)valorAbsolutosOcho);

        double numeroDoce = Math.random(); //Devuelve un numero aleatorio entre cero y 1
        System.out.println(numeroDoce);

        double numeroTrece= 70.5;
        long valorAbsolutosNueve = Math.round(numeroTrece); //Devuelve un numero redondeado
        System.out.println(valorAbsolutosNueve);

        double numeroCatorce = 9;
        double valorAbsolutosDiez = Math.sqrt(numeroCatorce); //Devuelve el mas grande de dos numeros
        System.out.println(valorAbsolutosDiez);

        System.out.println(Math.PI);
        System.out.println(Math.E);
        

    }
}
