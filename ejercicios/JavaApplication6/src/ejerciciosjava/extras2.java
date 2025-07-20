package ejerciciosjava;

import java.util.Scanner;

public class extras2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int arreglo[] = new int[10];
        int num, pos;
        
        for (int i = 0; i < 8; i++) {
            System.out.print((i+1)+". Ingrese numeros: ");
            arreglo[i] = entrada.nextInt();
        }
        System.out.print("Ingrese numero: ");
        num = entrada.nextInt();
        System.out.print("Ingrese posicion: ");
        pos = entrada.nextInt();
        
        for (int i = 8; i >= pos; i--) {
            arreglo[i+1] = arreglo[i];
        }
        arreglo[pos] = num;
        
        for (int i = 0; i < 10; i++) {
            System.out.print(arreglo[i]+", ");
            
        }
    }
}
