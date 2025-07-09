package ejerciciosjava;

import java.util.Scanner;

public class twelveciclos {
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);

        int factorial = 1;
        
        System.out.print("Ingrese un numero para calculo de factorial: ");
        int num = ent.nextInt();
        
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de "+num+" es: "+factorial);
    }
}
