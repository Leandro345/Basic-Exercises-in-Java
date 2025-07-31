import java.util.Scanner;

public class EjercicioAreaRectangulo {
    public static void main (String[] args)
    {
       int largoRectangulo = 0, anchoRectangulo = 0, resultadoArea = 0;
       Scanner entradaDelTeclado = new Scanner(System.in);
       
       System.out.println("Bienvenido al programa calculador de areas de rectangulos!");
       
       System.out.println("Inserte el largo del rectangulo:");
       largoRectangulo = entradaDelTeclado.nextInt();

       System.out.println("Inserte el ancho del rectangulo:");
       anchoRectangulo = entradaDelTeclado.nextInt();

       resultadoArea = largoRectangulo * anchoRectangulo;

       System.out.println("El area de su rectangulo es igual a: " + resultadoArea);

       entradaDelTeclado.close();
    }
}
