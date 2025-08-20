/***************************************************
PracticaUnoLibro.java
Leandro Feliz

Descripcion Basica: Solo un ejercicio del libro
****************************************************/

public class PracticaDosLibro 
{
    public static void main(String[] args) 
    {
        int cuenta = 0, suma = 0, producto = 1; //Inicializamos variables, producto debe empezar en 1, error encontrado

        do
        {

            cuenta++;
            suma += cuenta;
            producto *= cuenta; 

            if (cuenta == 5) {
                System.out.println("Suma = " + suma);
                System.out.println("Producto = " + producto);
            }

        }while(cuenta < 5);

    }    
}
