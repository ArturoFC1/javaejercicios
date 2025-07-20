package ejerciciosjava;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class matricesOne {
    public static void main(String[] args) {
        
        Scanner p = new Scanner(System.in);

        int filas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese filas"));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese columnas"));
        int matriz[][] = new int [filas][columnas];
        
        if (filas == columnas) {
            
            System.out.println("Es simetrica");
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print("["+i+"]["+j+"]: ");
                    matriz[i][j] = p.nextInt();
                }
                System.out.println("");
            }
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print(matriz[i][j]+" ");
                }
                System.out.println("");
            }
            
        }else{
            System.out.println("No es simetrica");
        }
    }
    
}
