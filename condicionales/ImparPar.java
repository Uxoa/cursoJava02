package condicionales;

import java.util.Scanner;

public class ImparPar {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escribe un número:");
        int num01 = input.nextInt();
        
        
        if (num01 % 2 == 0) {
            System.out.println("El  número es par.");
        } else {
            System.out.println("El número es impar.");
        }
        
        // Cerrar el scanner para liberar recursos
        input.close();
            
        }
        
    
}