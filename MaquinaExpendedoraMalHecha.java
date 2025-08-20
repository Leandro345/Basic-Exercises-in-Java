import java.util.Scanner;

/**************************************************************
MaquinaExpendedora.java
Leandro Feliz

Descripcion Basica: Este programa actua como una maquina
expendodra y muestra al usuario diferentes productos, cada
uno con su precio, una vez este selecciona que desea comprar 
se le pregunta su cantidad de devuelto, finalmente se muestra
precio, devuelto y diferencia de comprar, ademas de preguntarle
se desea hacer otra compra
**************************************************************/

public class MaquinaExpendedoraMalHecha {
    public static void main (String[] args)
    {
        int devueltoUsuario = 0, diferenciaCompra = 0, cocaCola = 50, fritoLays = 35, jugoEnLata = 65, cantidadCompras = 0; // Inicializamos variables enteras que usaremos
        Scanner entradaDesdeElTeclado = new Scanner(System.in); // Inicializamos entrada del teclado con objeto Scanner
        String  deseaComprar = "s", volverAComprar = "s", opcionAComprar = "", primeraVez = "s"; // Inicializamos variables de cadena que usaremos
        
        while(deseaComprar.equalsIgnoreCase("s") && volverAComprar.equalsIgnoreCase("s"))
        {

            if (primeraVez.equalsIgnoreCase("s") && cantidadCompras <= 0) { // Verificamos que es la primera vez que entra para saber si mostrar precios y dar bienvenida
                
                System.out.println("Bienvenido la maquina expendedora!"); // Damos la bienvenida (si es la primera vez)
                System.out.print("Desea comprar?: s/n:" ); // Le preguntamos si desea comprar
                deseaComprar = entradaDesdeElTeclado.nextLine();
                entradaDesdeElTeclado.nextLine();
                
                System.out.println(""); // Creamos una linea vacia para legibilidad
                if (deseaComprar.equalsIgnoreCase("s") && volverAComprar.equalsIgnoreCase("s")) {
                    System.out.println("Productos en venta!: ");
                    System.out.println("Coca Cola - 50 pesos");
                    System.out.println("Frito Lays - 35 pesos");
                    System.out.println("Jugo en lata - 65 pesos");
                    opcionAComprar = entradaDesdeElTeclado.nextLine();
                    entradaDesdeElTeclado.nextLine();

                    System.out.println("");

                    System.out.print("De cuanto es su devuelto?: ");
                    devueltoUsuario = entradaDesdeElTeclado.nextInt(); 
                    entradaDesdeElTeclado.nextLine();
                    
                    System.out.println("");

                    if (opcionAComprar.equalsIgnoreCase("Coca cola")) {
                        diferenciaCompra = devueltoUsuario - cocaCola;
                        System.out.println("Precio: " + cocaCola);  
                        System.out.println("Devuelto: " + devueltoUsuario);
                        System.out.println("Diferencia de compra: " + diferenciaCompra);
                        System.out.println("");
                        System.out.println("Buena compra!"); 

                    } else if (opcionAComprar.equalsIgnoreCase("Frito Lays")) {
                       diferenciaCompra = devueltoUsuario - fritoLays;
                        System.out.println("Precio: " + fritoLays);  
                        System.out.println("Devuelto: " + devueltoUsuario);
                        System.out.println("Diferencia de compra: " + diferenciaCompra);
                        System.out.println("");
                        System.out.println("Buena compra!"); 

                    } else if (opcionAComprar.equalsIgnoreCase("Jugo en lata")) {
                        diferenciaCompra = devueltoUsuario - jugoEnLata;
                        System.out.println("Precio: " + jugoEnLata);  
                        System.out.println("Devuelto: " + devueltoUsuario);
                        System.out.println("Diferencia de compra: " + diferenciaCompra);
                        System.out.println("");
                        System.out.println("Buena compra!");
 
                    }

                    primeraVez = "n";
                    cantidadCompras = 1;  

                    System.out.println("");
                    System.out.print("¿Desea volver a comprar? s/n: ");
                    volverAComprar = entradaDesdeElTeclado.next();
                    entradaDesdeElTeclado.nextLine();
     

            } else if(primeraVez.equalsIgnoreCase("n") && cantidadCompras == 1 && volverAComprar.equalsIgnoreCase("s")) //Si no es la primera vez, unicamente se muestran los precios
            {
                devueltoUsuario = 0;
                diferenciaCompra = 0;

                System.out.println("Bienvenido una vez mas!");
                 System.out.println("Productos en venta!: ");
                    System.out.println("Coca Cola - 50 pesos");
                    System.out.println("Frito Lays - 35 pesos");
                    System.out.println("Jugo en lata - 65 pesos");
                     entradaDesdeElTeclado.nextLine();
                    opcionAComprar = entradaDesdeElTeclado.nextLine();
                   

                    System.out.print("De cuanto es su devuelto?: ");
                    devueltoUsuario = entradaDesdeElTeclado.nextInt();
                    entradaDesdeElTeclado.nextLine();

                    if (opcionAComprar.equalsIgnoreCase("Coca cola")) {
                        diferenciaCompra = devueltoUsuario - cocaCola;
                        System.out.println("Precio: " + cocaCola);  
                        System.out.println("Devuelto: " + devueltoUsuario);
                        System.out.println("Diferencia de compra: " + diferenciaCompra);
                        System.out.println("Buena compra!"); 

                    } else if (opcionAComprar.equalsIgnoreCase("Frito Lays")) {
                       diferenciaCompra = devueltoUsuario - fritoLays;
                        System.out.println("Precio: " + fritoLays);  
                        System.out.println("Devuelto: " + devueltoUsuario);
                        System.out.println("Diferencia de compra: " + diferenciaCompra);
                        System.out.println("Buena compra!"); 

                    } else if (opcionAComprar.equalsIgnoreCase("Jugo en lata")) {
                        diferenciaCompra = devueltoUsuario - jugoEnLata;
                        System.out.println("Precio: " + jugoEnLata);  
                        System.out.println("Devuelto: " + devueltoUsuario);
                        System.out.println("Diferencia de compra: " + diferenciaCompra);
                        System.out.println("Buena compra!");
                    }

                     System.out.print("¿Desea volver a comprar? s/n: ");
                        volverAComprar = entradaDesdeElTeclado.next();
                        entradaDesdeElTeclado.nextLine();

            } 
        }   
    }    

    

    System.out.println("Buena compra!");

  }

}
