package ejerciciosjava;

import java.util.Scanner;

public class TwentyCiclos {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int sueldo = 0, sueldonew = 0;
        
        System.out.print("Ingrese un numero: ");
        int num = entrada.nextInt();
        
        for (int i = 1; i <= num; i++) {
            System.out.print("Ingrese sueldo: "+i+": ");
            sueldo = entrada.nextInt();
            if (sueldo >= sueldonew){
                sueldonew = sueldo;
            }
        }
        System.out.println("El sueldo mayor es: "+sueldonew);
    }
}
