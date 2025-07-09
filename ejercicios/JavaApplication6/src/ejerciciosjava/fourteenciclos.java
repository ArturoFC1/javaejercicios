package ejerciciosjava;

import java.util.Scanner;

public class fourteenciclos {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int sueldo;
        int sumaSueldo = 0, conteoMil=0;
        
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingresa el sueldo "+i+": ");
            sueldo = entrada.nextInt();
            if (sueldo >= 1000) {
                conteoMil ++;
            }
            sumaSueldo += sueldo;
        }
        System.out.println("La suma de los 10 sueldos es: "+sumaSueldo);
        System.out.println("Numero de sueldos mayores a 1000: "+conteoMil);
    }
}
