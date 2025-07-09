package ejerciciosjava;

import java.util.Scanner;

public class TwentyoneCiclos {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int num, negativo = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese numero "+i+": ");
            num = entrada.nextInt();
            if (num < 0) {
                negativo ++;
            }
        }
        if (negativo > 0) {
            System.out.println("Se ha introducido "+negativo+" negativo(s)");
        }else{
            System.out.println("Todos positivos");
        }
    }
}
