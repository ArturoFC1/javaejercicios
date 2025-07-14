package ejerciciosjava;

import java.util.Scanner;

public class TwoArreglo {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int arreglo[] = new int [5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el numero "+(i+1)+": ");
            arreglo[i] = entrada.nextInt();
        }                                                                                                                   
        
        for (int i = (arreglo.length-1); i >= 0; i--) {
            System.out.println(arreglo[i]);
        }
    }
}
