package ejerciciosjava;

import java.util.Scanner;

public class nineArreglo {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int arreglo[] = new int[11];
        
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+" Ingrese numero: ");
            arreglo[i] = entrada.nextInt();
        }

        for (int i = 9; i >= 0; i--) {
            arreglo[i+1] = arreglo[i];
        }
        arreglo[0] = arreglo[arreglo.length-1];
        
        for (int i = 0; i < 10; i++) {
            System.out.print(arreglo[i]+", ");
        }
        
    }
    
}
