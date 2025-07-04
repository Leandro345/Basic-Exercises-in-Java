/*********************************************************************
ConvertidorTemperatura.java
Leandro Feliz

Descripción Básica: Este programa se encarga de convertir una
temperatura en grades Farenheit a Celsius
*********************************************************************/

public class ConvertidorTemperatura
{
  public static void main (String[] args)
  {
    final double PUNTO_CONGELACION = 32.0;
    final double FACTOR_CONVERSION = 5.0 / 9.0;
    double farenheit = 50; //Temperatura en Farenheit
    double celsius;        //Temperatura en Celsius

    celsius = FACTOR_CONVERSION * (farenheit - PUNTO_CONGELACION);
    System.out.println(farenheit + " grados en farenheit = " + celsius
    + " grados celsius."); // Impresion resultado final
  } //Fin metodo Main
}  //Fin clase