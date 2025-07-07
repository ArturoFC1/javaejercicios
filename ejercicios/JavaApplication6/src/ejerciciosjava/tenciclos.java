package ejerciciosjava;

import java.util.Scanner;

public class tenciclos {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int num, sum = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese numero "+(i+1)+": ");
            num = entrada.nextInt();
            sum += num; 
        }
        System.out.println("La suma total es: "+sum);
    }
}
