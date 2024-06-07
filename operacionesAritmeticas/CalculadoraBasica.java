package operacionesAritmeticas;

import java.util.Scanner;

public class CalculadoraBasica {
    
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que introduzca el primer número
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        
        // Pedir al usuario que introduzca el segundo número
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        
        // Realizar las operaciones aritméticas
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = 0;
        if (num2 != 0) {
            division = (double) num1 / num2;
        }
        
        // Mostrar los resultados
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);
        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + multiplicacion);
        
        // Verificar si el divisor es diferente de cero antes de mostrar el resultado de la división
        if (num2 != 0) {
            System.out.println("La división de " + num1 + " entre " + num2 + " es: " + division);
        } else {
            System.out.println("No se puede dividir por cero");
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}
