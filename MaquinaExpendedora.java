import java.util.Scanner;

public class MaquinaExpendedora {
    public static void main(String[] args) {
        int devueltoUsuario = 0, diferenciaCompra = 0;
        int cocaCola = 50, fritoLays = 35, jugoEnLata = 65;
        int cantidadCompras = 0;

        Scanner entradaDesdeElTeclado = new Scanner(System.in);
        String deseaComprar = "s", volverAComprar = "s", opcionAComprar = "", primeraVez = "s";

        while (deseaComprar.equalsIgnoreCase("s") && volverAComprar.equalsIgnoreCase("s")) {

            if (primeraVez.equalsIgnoreCase("s") && cantidadCompras <= 0) {
                System.out.println("Bienvenido la maquina expendedora!");
                System.out.print("Desea comprar?: s/n: ");
                deseaComprar = entradaDesdeElTeclado.nextLine();

                System.out.println();

                if (deseaComprar.equalsIgnoreCase("s")) {
                    System.out.println("Productos en venta!: ");
                    System.out.println("Coca Cola - 50 pesos");
                    System.out.println("Frito Lays - 35 pesos");
                    System.out.println("Jugo en lata - 65 pesos");

                    opcionAComprar = entradaDesdeElTeclado.nextLine();

                    System.out.println();
                    System.out.print("¿De cuanto es su devuelto?: ");
                    devueltoUsuario = entradaDesdeElTeclado.nextInt();
                    entradaDesdeElTeclado.nextLine(); // limpiar el salto de línea

                    System.out.println();

                    if (opcionAComprar.equalsIgnoreCase("Coca Cola")) {
                        diferenciaCompra = devueltoUsuario - cocaCola;
                        System.out.println("Precio: " + cocaCola);
                    } else if (opcionAComprar.equalsIgnoreCase("Frito Lays")) {
                        diferenciaCompra = devueltoUsuario - fritoLays;
                        System.out.println("Precio: " + fritoLays);
                    } else if (opcionAComprar.equalsIgnoreCase("Jugo en lata")) {
                        diferenciaCompra = devueltoUsuario - jugoEnLata;
                        System.out.println("Precio: " + jugoEnLata);
                    } else {
                        System.out.println("Producto no reconocido.");
                        continue; // salta a la siguiente vuelta del while
                    }

                    System.out.println("Devuelto: " + devueltoUsuario);
                    System.out.println("Diferencia de compra: " + diferenciaCompra);
                    System.out.println("Buena compra!");

                    cantidadCompras = 1;
                    primeraVez = "n";

                    System.out.println();
                    System.out.print("¿Desea volver a comprar? s/n: ");
                    volverAComprar = entradaDesdeElTeclado.nextLine();
                }

            } else if (primeraVez.equalsIgnoreCase("n") && cantidadCompras >= 1 && volverAComprar.equalsIgnoreCase("s")) {
                devueltoUsuario = 0;
                diferenciaCompra = 0;

                System.out.println("Bienvenido una vez mas!");
                System.out.println("Productos en venta!: ");
                System.out.println("Coca Cola - 50 pesos");
                System.out.println("Frito Lays - 35 pesos");
                System.out.println("Jugo en lata - 65 pesos");

                opcionAComprar = entradaDesdeElTeclado.nextLine();

                System.out.print("¿De cuanto es su devuelto?: ");
                devueltoUsuario = entradaDesdeElTeclado.nextInt();
                entradaDesdeElTeclado.nextLine(); // limpiar el salto de línea

                if (opcionAComprar.equalsIgnoreCase("Coca Cola")) {
                    diferenciaCompra = devueltoUsuario - cocaCola;
                    System.out.println("Precio: " + cocaCola);
                } else if (opcionAComprar.equalsIgnoreCase("Frito Lays")) {
                    diferenciaCompra = devueltoUsuario - fritoLays;
                    System.out.println("Precio: " + fritoLays);
                } else if (opcionAComprar.equalsIgnoreCase("Jugo en lata")) {
                    diferenciaCompra = devueltoUsuario - jugoEnLata;
                    System.out.println("Precio: " + jugoEnLata);
                } else {
                    System.out.println("Producto no reconocido.");
                    continue; // vuelve al inicio del while
                }

                System.out.println("Devuelto: " + devueltoUsuario);
                System.out.println("Diferencia de compra: " + diferenciaCompra);
                System.out.println("Buena compra!");

                System.out.println();
                System.out.print("¿Desea volver a comprar? s/n: ");
                volverAComprar = entradaDesdeElTeclado.nextLine();
            }
        }

        System.out.println("Gracias por usar la máquina expendedora. ¡Hasta la próxima!");

    }
}