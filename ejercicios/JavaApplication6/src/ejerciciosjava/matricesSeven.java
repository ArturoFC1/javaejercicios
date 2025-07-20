package ejerciciosjava;

import java.util.Scanner;

public class matricesSeven {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Impresion de matriz marco: ");
        
        int matrizM[][] = new int[5][5];
        
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM.length; j++) {
                if (i == 0 || i == matrizM.length-1 || j == 0 || j == matrizM.length-1) {
                    matrizM[i][j] = 1;
                }else{
                   matrizM[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM.length; j++) {
                System.out.print(matrizM[i][j]+"  ");
            }
            System.out.println("");
        }
    }
}
