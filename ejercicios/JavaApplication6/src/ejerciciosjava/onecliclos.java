package ejerciciosjava;

import java.util.Scanner;

public class onecliclos {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in); 
        
        int num = 0;
        double cuadrado;
        do{
            System.out.print("Ingrese un numero: ");
            num = entrada.nextInt();
            
            cuadrado = Math.pow(num, 2);
            System.out.println("El cuadrado de "+num+ " es: "+ cuadrado);
        }while(num >= 0);
    }
}

