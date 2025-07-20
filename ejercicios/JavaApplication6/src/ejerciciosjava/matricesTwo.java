package ejerciciosjava;

import java.util.Scanner;

public class matricesTwo {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int matriz1[][] = new int [3][3];
        int matriz2[][] = new int [3][3];
        int matrizSuma[][] = new int [3][3];
        
        System.out.println("Now vamos a ingresar dos matrices: ");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print("Matriz 1. ["+i+"]["+j+"]: ");
                matriz1[i][j] = entrada.nextInt();
            }
            System.out.println("");
        }
        System.out.println("----------");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                System.out.print("Matriz2. ["+i+"]["+j+"]: ");
                matriz2[i][j] = entrada.nextInt();
            }
            System.out.println("");
        }
        System.out.println("Suma de matrices: ");
        
        for (int i = 0; i < matrizSuma.length; i++) {
            for (int j = 0; j <matrizSuma.length; j++) {
                matrizSuma[i][j] = (matriz1[i][j]+matriz2[i][j]);
            }
        }
        
        
        for (int i = 0; i < matrizSuma.length; i++) {
            for (int j = 0; j < matrizSuma.length; j++) {
                System.out.print(matrizSuma[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
