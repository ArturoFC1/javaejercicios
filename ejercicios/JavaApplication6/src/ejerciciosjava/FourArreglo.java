package ejerciciosjava;

import java.util.Scanner;

public class FourArreglo {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int array[] = new int[20];
        
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese el numero: "+(i+1)+": ");
            array[i] = entrada.nextInt();
        }
        for (int i = 0, j = (array.length-1); i < (array.length/2) ; i++, j--) {
            System.out.println(array[i]);
            System.out.println(array[j]);
        }
    }
}
