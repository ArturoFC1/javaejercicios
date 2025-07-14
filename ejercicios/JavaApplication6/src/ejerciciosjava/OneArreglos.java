package ejerciciosjava;

import java.util.Scanner;

public class OneArreglos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numeros [] = new int [5]; 
       
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el numero "+(i+1)+": ");
            numeros[i] = entrada.nextInt();
        }
        
        for(int i:numeros){
            System.out.print(i+" ");
        }
        System.out.println("");
    }
}
