package condicionales;

import java.util.Scanner;
public class NumerosDiferentes {
    
    public static void main(String[] args){
    
    //Solicite al usuario ingresar dos números y determine si son iguales o diferentes.
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa un número:");
        int num01 = input.nextInt();
        
        System.out.println("Ingrese otro número:");
        int num02 = input.nextInt();
        
        if(num01 == num02){
            System.out.println("Los números son iguales");
        } else {
            System.out.println("Los números son diferentes");
        }
    
    
    
    
    }
}
