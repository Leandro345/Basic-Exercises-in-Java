/************************************************************
TraductorCodigoMorse.java
Leandro Feliz 

Descripcion Basica: Este programa recibe una palabra
de parte del usuario y devuelve la misma traducida a 
codigo morse.
************************************************************/
import java.util.*;

public class TraductorCodigoMorse {
    public static void main (String[] args)
    {
 
       Scanner entradaDelTeclado = new Scanner(System.in);
       System.out.println("Bienvenido al programa traductor a codigo morse!");
       System.out.println("Inserte la palabra que desea traducir");
       String palabraAUtilizar = entradaDelTeclado.nextLine();
       int cantidadDeCaracteres = palabraAUtilizar.length();
       
       final String A = ".-";
       final String B = "-...";
       final String C = "-.-.";
       final String D = "-..";
       final String E = ".";
       final String F = "..-.";
       final String G = "--.";
       final String H = "....";
       final String I = "..";
       final String J = ".---";
       final String K = "-.-";
       final String L = ".-..";
       final String M = "--";
       final String N = "-.";
       final String O = "---";
       final String P = ".--.";
       final String Q = "--.-";
       final String R = ".-.";
       final String S = "...";
       final String T = "-";
       final String U = "..-";
       final String V = "...-";
       final String W = ".--";
       final String X = "-..-";
       final String Y = "-.--";
       final String Z = "--.."; 
       
       for(int i = 0; i <= cantidadDeCaracteres - 1; i++)
       {
           if (palabraAUtilizar.charAt(i) == 'a') {
              System.out.print(A + " ");   
           } else if (palabraAUtilizar.charAt(i) == 'b') {
              System.out.print(B + " ");   
           } else if (palabraAUtilizar.charAt(i) == 'c') {
              System.out.print(C + " ");   
           } else if (palabraAUtilizar.charAt(i) == 'd') {
              System.out.print(D + " ");   
           } else if (palabraAUtilizar.charAt(i) == 'e') {
              System.out.print(E + " ");   
           } else if (palabraAUtilizar.charAt(i) == 'f') {
              System.out.print(F + " ");   
           } else if (palabraAUtilizar.charAt(i) == 'g') {
              System.out.print(G + " ");   
           } else if (palabraAUtilizar.charAt(i) == 'h') {
              System.out.print(H + " ");   
           } else if (palabraAUtilizar.charAt(i) == 'i') {
              System.out.print(I + " ");   
           } else if (palabraAUtilizar.charAt(i) == 'j') {
              System.out.print(J + " ");   
           } else if (palabraAUtilizar.charAt(i) == 'k') {
              System.out.print(K + " ");   
           } else if (palabraAUtilizar.charAt(i) == 'l') {
              System.out.print(L + " ");   
           } else if (palabraAUtilizar.charAt(i) == 'm') {
              System.out.print(M + " ");   
           } else if (palabraAUtilizar.charAt(i) == 'n') {
              System.out.print(N + " ");   
           } else if (palabraAUtilizar.charAt(i) == 'o') {
              System.out.print(O + " ");   
           } else if (palabraAUtilizar.charAt(i) == 'p') {
              System.out.print(P + " ");   
           } else if (palabraAUtilizar.charAt(i) == 'q') {
              System.out.print(Q + " ");   
           } else if (palabraAUtilizar.charAt(i) == 'r') {
              System.out.print(R + " ");   
           } else if (palabraAUtilizar.charAt(i) == 's') {
              System.out.print(S + " ");   
           } else if (palabraAUtilizar.charAt(i) == 't') {
              System.out.print(T + " ");   
           } else if (palabraAUtilizar.charAt(i) == 'u') {
              System.out.print(U + " ");   
           } else if (palabraAUtilizar.charAt(i) == 'v') {
              System.out.print(V + " ");   
           } else if (palabraAUtilizar.charAt(i) == 'w') {
              System.out.print(W + " ");   
           } else if (palabraAUtilizar.charAt(i) == 'x') {
              System.out.print(X + " ");   
           } else if (palabraAUtilizar.charAt(i) == 'y') {
              System.out.print(Y + " ");   
           } else if (palabraAUtilizar.charAt(i) == 'z') {
              System.out.print(Z + " ");   
           } 
       } 
    }    
}
