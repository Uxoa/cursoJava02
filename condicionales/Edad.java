package condicionales;

import java.util.Scanner;

public class Edad {
    
    public static void main(String[] args)
    {
       // Pida al usuario que ingrese su edad y verifique si es mayor de edad o no.
        
        System.out.println("Ingresa la edad del usuario:");
        
        Scanner input = new Scanner(System.in);
        
        byte edad = input.nextByte();
        
        if(edad >=18)
        {
            System.out.println("Acceso permitido.");
        }
        else {
            System.out.println("Acceso denegado, Eres menor de edad.");
        }
        
    }
    
} 