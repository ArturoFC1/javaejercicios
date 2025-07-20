package ejerciciosjava;

import java.util.Scanner;

public class matricesFive {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int filas,columnas;
        int sumaFilas = 0;
        int sumaColumnas = 0;
        
        System.out.print("Ingrese las filas de la matriz: ");
        filas = entrada.nextInt();
        System.out.print("Ingrese las columnas de la matriz: ");
        columnas = entrada.nextInt();
        
        int matriz[][] = new int[filas][columnas];
        
        System.out.println("LLene la matriz: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
            System.out.println("");
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }        
        
        System.out.println("\nSumas Filas\n");
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaFilas += matriz[i][j];
            }
            System.out.println("Suma fila "+(i+1)+": "+sumaFilas);
            sumaFilas = 0;
        }
        
        System.out.println("\nSumas Columnas\n");
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                sumaColumnas += matriz[j][i];
            }
            System.out.println("Suma columna "+(i+1)+": "+sumaColumnas);
            sumaColumnas = 0;
        }        
        

    }
}
