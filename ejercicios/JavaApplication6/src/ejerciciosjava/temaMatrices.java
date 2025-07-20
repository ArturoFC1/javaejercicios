package ejerciciosjava;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class temaMatrices {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        //Esto es para cuando quieres poner los datos tu
        /*
        int Matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Matriz[i][j]);
            }
            System.out.println("");
        {
           */
        int filas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las filas: "));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las columnas: "));
        
        int matriz[][] = new int[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("["+i+"] ["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
            System.out.println("");
        }
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
            
        }
    }
}
