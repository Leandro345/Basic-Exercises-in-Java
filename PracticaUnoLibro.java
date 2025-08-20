/***************************************************
PracticaUnoLibro.java
Leandro Feliz

Descripcion Basica: Solo un ejercicio del libro
****************************************************/

public class PracticaUnoLibro 
{
    public static void main(String[] args) 
    {
        
        double x = 2.1; //Declaramos variable

        while (x * x <= 50) //El bucle confirma que su cuadrado no se mayor a 50 y sigue ejecutando, de lo contrario ignora
        {
            
            switch ((int) x) { //Hace un 'cast' para convertir de double a int y poder aplicarlo en los cases

                case 6:
                    x--;
                    System.out.println("Caso 6, x = " + x); //Si el cuadrado es igual a 6 le resta 1 e imprime 
                    break;

                case 5:
                    System.out.println("Caso 5, x = " + x);//Si el cuadrado es igual a 5 solo imprime
                    break;

                case 4:
                    System.out.println("Caso 4, x = " + x);//Si el cuadrado es igual a 4 solo imprime
                    break;
            
                default: //Si el cuadrado de no es igual ni a 6, 5 o 4 imprime 'Que toyo!'
                    System.out.println("Que toyo!");
                    break;
            }// Fin SWITCH
            
            x += 2; //Al final de cada case suma 2 a x

        }//Fin WHILE

    }// Fin metodo MAIN    
}   // Fin clase PracticaUnoLibro
