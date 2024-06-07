package excepciones;

/* Crea un programa que solicite al usuario ingresar dos números enteros.
 El programa debe dividir el primer número por el segundo y mostrar el resultado.
 Si el usuario ingresa un valor no numérico, el programa debe manejar la excepción
 y mostrar un mensaje de error adecuado. Además, si el segundo número es cero,
 el programa debe manejar la excepción de división por cero y mostrar un mensaje
 de error adecuado.
 */


import java.util.Scanner;

public class Division {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.println("Escribe un numero:");
            int num01 =  Integer.parseInt(input.nextLine());
            
            System.out.println("Escribe otro número:");
            int num02 = Integer.parseInt(input.nextLine());
            
            int resultado = num01 / num02;
            
            System.out.println("El resultado de la división es: " + resultado);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Por favor ingrese un número entero válido.");
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }
    
}
