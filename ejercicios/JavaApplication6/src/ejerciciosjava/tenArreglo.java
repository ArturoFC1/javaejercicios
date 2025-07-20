package ejerciciosjava;

import java.util.Scanner;

public class tenArreglo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int arreglo[] = new int[100];
        int posicion;
        
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+". Ingrese valores: ");
            arreglo[i] = entrada.nextInt();
        }
        
        System.out.print("Ingrese las posiciones: ");
        posicion = entrada.nextInt();
        
        int arreglo2[] = new int[posicion];
        
        for (int i = 10; i >= 0; i--) {
            arreglo[i+posicion] = arreglo[i];
        }
            
        for (int i = 0; i < 10; i++) {
            System.out.print(arreglo[i]+", ");
        }
    }
}
