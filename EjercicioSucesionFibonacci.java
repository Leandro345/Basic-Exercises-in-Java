/**************************************************
EjercicioSucesionFibonacci.java
Leandro Feliz

Descripcion Basica: Este programa muestra
una cantidad de 8 impresiones de la
sucesion fibonacci
**************************************************/


public class EjercicioSucesionFibonacci {
    public static void main (String[] args)
    {
        int a = 0, b = 1, c = 0, limiteFibonacci = 8;

        for(int i = 0; i <= limiteFibonacci; i++)
        {
           System.out.println(c + ", ");
           c = a + b;
           a = b;
           b = c;

           if (i == limiteFibonacci) {
                System.out.println(c);
           }
        }
    }
}
