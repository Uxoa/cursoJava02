package condicionales;

import java.util.Scanner;

public class VerNumeroMayor {

    public static void main(String[] args) {
        
        //Ingrese 2 números enteros diferentes y visualizar el mayor de ellos.
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un número:");
        int num01 = input.nextInt();
        
        System.out.println("Ingrese otro  número más:");
        int num02 = input.nextInt();
        
        if(num01 >= num02){
            System.out.println("El número mayor es el:" + num01);
        } else {
            System.out.println("El número mayor es el:" +  num02);
        }
        
    }
    
}
