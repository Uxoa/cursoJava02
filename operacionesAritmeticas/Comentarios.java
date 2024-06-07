package operacionesAritmeticas;

/*
 Escribe un programa en Java que solicite al usuario ingresar dos números enteros
 y luego muestre la suma de esos dos números en la pantalla. Asegúrate de incluir
 comentarios descriptivos para explicar cada paso del proceso utilizando diferentes
 tipos de comentarios, como comentarios de una sola línea, comentarios de varias líneas
 y comentarios de documentación.
 Los comentarios deben describir la solicitud de entrada, la adición de los números
 y la impresión del resultado en pantalla.

 */

import java.util.Scanner;

public class Comentarios {
  
  public static void main(String[] args){
    
    //Se cre el objeto Scanner
    Scanner input = new Scanner(System.in);
    
    /*Se solicita al usuario que escriba un número
    que se guarda en  la variable num01
     */
    System.out.println("Escribe un número:");
    int num01 = input.nextInt();
    
    /*Se solicita al usuario que escriba otro número
    que se guarda en  la variablee num02
     */
    System.out.println("Escribe otro número:");
    int num02 = input.nextInt();
    
    
    //Aplicamos la lógica para la suma
    System.out.println("La suma de los números es:" + (num01 + num02));
    
    
    

     
     
     
     
  }
}
