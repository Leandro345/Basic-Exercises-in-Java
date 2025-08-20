/*************************************************************
TeoremaDePitagoras.java
Leandro Feliz

Descripcion Basica: Este pide al usuario longitud de base 
y altura de un triangulo rectangulo, posteriormente devuelve
la medida de la hipotenusa, que es lo que se esta buscando, 
en pocas palabras actua como el teorema de Pitagoras. 
**************************************************************/

import java.util.Scanner;

public class TeoremaDePitagoras 
{
    public static void main(String[] args) 
    {
        
        double base = 0, altura = 0, hipotenusa;
        Scanner entradaTeclado = new Scanner(System.in); //Inicializamos variables y objeto Scanner

        System.out.print("Bienvenido, ingrese la base del triangulo rectangulo: ");
        base = entradaTeclado.nextDouble(); //Pedimos y almacenamos base

        System.out.print("Ingrese la altura del triangulo rectangulo:  ");
        altura = entradaTeclado.nextDouble(); //Pedimos y almacenamos base

        hipotenusa = Math.sqrt(base * base + altura * altura); //Calculamos la raiz con metodo 'Sqrt'

        System.out.println("\nLa longitud de su hipotenusa es: " + hipotenusa); //Devolvemos valor de la hipotenusa
        System.out.println("Buen trabajo!");

    } //Fin metodo Main 
}    // Fin clase TeoremaDePitagoras
