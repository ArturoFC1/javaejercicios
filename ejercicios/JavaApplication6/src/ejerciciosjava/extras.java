package ejerciciosjava;

import java.util.Scanner;

public class extras {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int arreglo[] = new int[12];
        int num, posicion;
        
        for (int i = 0; i < 8; i++) {
            System.out.print((i+1)+". Ingresa valores: ");
            arreglo[i] = entrada.nextInt();
        }
        do {
            System.out.print("Ingrese una posicion: ");
            posicion = entrada.nextInt();
        } while (posicion < 0 || posicion > 7);
        
        for (int i = posicion; i < 7; i++) {
            arreglo[i] = arreglo[i+1];
        }
        
        for (int i = 0; i < 7; i++) {
            System.out.print(arreglo[i]+", ");
            
        }
    
    }
}
