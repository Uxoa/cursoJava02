package condicionales;

import java.util.Scanner;
public class PositivoNegativo {
    
    public static void main(String[] args){
    
  //Pida al usuario ingresar un número y determine si es positivo, negativo o igual a cero.
     
     Scanner input = new Scanner(System.in);
     
     System.out.println("Escribe un número:");
     int num01 = input.nextInt();
     
     System.out.println("Escribe otro número:");
     int num02 = input.nextInt();
        
        // Determinar si el primer número es positivo, negativo o cero
        if (num01 > 0) {
            System.out.println("El primer número es positivo.");
        } else if (num01 < 0) {
            System.out.println("El primer número es negativo.");
        } else {
            System.out.println("El primer número es igual a cero.");
        }
        
        // Determinar si el segundo número es positivo, negativo o cero
        if (num02 > 0) {
            System.out.println("El segundo número es positivo.");
        } else if (num02 < 0) {
            System.out.println("El segundo número es negativo.");
        } else {
            System.out.println("El segundo número es igual a cero.");
        }
        
        // Cerrar el scanner para liberar recursos
        input.close();
        
    }
}
