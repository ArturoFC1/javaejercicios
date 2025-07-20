package ejerciciosjava;

import java.util.Scanner;

public class matricesSix {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int matriz1[][] = new int[5][9];
        int matriz2[][] = new int[9][5];
        
        System.out.println("Ingrese datos de la matriz: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("["+i+"]["+j+"]: ");
                matriz1[i][j] = entrada.nextInt();
            }
            System.out.println("");
        }
        //Se imprime matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matriz1[i][j]+" ");
            }
            System.out.println("");
        }
        
        //Volteamos matriz
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                matriz2[j][i] = matriz1[i][j];
            }
        }
        
        System.out.println("\nMatriz inversa\n");
        //Imprimimos matriz
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
