package ejerciciosjava;

import java.util.Scanner;

public class FiveArreglo {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        /**
         *         
        int arreglo1 [] = new int[10];
        int arreglo2 [] = new int[10];
        int arreglo3[] = new int[20]; 
        
        for (int i = 0, j = 0; i < arreglo1.length; i++, j++) {
            System.out.print("Arreglo 1, ingrese numero "+(i+1)+": ");
                arreglo1[i] = entrada.nextInt();
                arreglo3[j] = arreglo1[i];
                j++;
            System.out.print("Arreglo 2, ingrese numero "+(i+1)+": ");
                arreglo2[i] = entrada.nextInt();
                arreglo3[j] = arreglo2[i];
        }
        for (int j:arreglo3){
            System.out.print(j + ", ");
        }
         */
        
        int arreglo1 [] = new int [10];
        int arreglo2 [] = new int [10];
        int arreglo3 [] = new int [20];
        
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.print("Ingrese el valor "+(i+1)+" del arreglo 1: ");
            arreglo1[i] = entrada.nextInt();
        }
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.print("Ingrese el valor "+(i+1)+" del arreglo 2: ");
            arreglo2[i] = entrada.nextInt();
        }
        for (int i = 0, j = 0; i < arreglo3.length; i++, j++) {
            arreglo3[i] = arreglo1[j];
            i++;
            arreglo3[i] = arreglo2[j];
        }
        for(int a:arreglo3){
            System.out.print(a + ", ");
        }
    }
}
