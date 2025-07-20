package ejerciciosjava;

import java.util.Scanner;

public class matricesThree {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int matriz[][] = new int [3][3];
        int matrizT[][] = new int [3][3];
        
        System.out.println("Ingrese valores de matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
            System.out.println("");
        }
        System.out.println("Matriz Transpuesta: ");
        
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT.length; j++) {
                matrizT[j][i] = matriz[i][j];
            }
        }
        
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT.length; j++) {
                System.out.print(matrizT[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
