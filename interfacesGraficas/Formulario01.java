package interfacesGraficas;

import java.util.Scanner;

public class Formulario01 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); System.out.println("Bienvenido al formulario de registro del hotel.");
// Solicitar datos del cliente System.out.print("Ingrese su nombre: "); String nombre = scanner.nextLine();
        System.out.print("Ingrese su número de documento: "); String documento = scanner.nextLine();
        System.out.print("Ingrese su país de origen: "); String pais = scanner.nextLine();
// Verificar si se ingresaron todos los campos obligatorios
        if (nombre.isEmpty() || documento.isEmpty() || pais.isEmpty()) {
            System.out.println("¡Faltan campos obligatorios por completar!");
            System.out.println("Por favor, complete todos los campos antes de continuar."); } else {
            System.out.println("\n¡Gracias por completar el formulario!"); System.out.println("Nombre: " + nombre); System.out.println("Documento: " + documento); System.out.println("País: " + pais);
        }
        scanner.close();
    }
    
}
