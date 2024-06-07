package condicionales;


import java.util.Scanner;
public class AnioBisiesto {
    
    public static void main(String[] args){
    
    //Pida al usuario que ingrese un año y verifique si es un año bisiesto o no.
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escribe un año");
        int anio = input.nextInt();
        
        // Determinar si el año es bisiesto usando una única expresión lógica
        boolean esBisiesto = (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0));
        
        // Mostrar el resultado
        if (esBisiesto) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
        
        // Cerrar el scanner para liberar recursos
        input.close();
        
        
        
    }
    
}


