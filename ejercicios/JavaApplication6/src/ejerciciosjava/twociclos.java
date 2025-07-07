package ejerciciosjava;

import java.util.Scanner;

public class twociclos {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int num = 1;
        
        while (num != 0){
            System.out.print("Ingrese numero: ");
            num = entrada.nextInt();
            if (num > 0) {
                System.out.println("Numero positivo");
            }else if(num < 0){
                System.out.println("Numero negativo");
            }
        }
        System.out.println("Programa terminado");
    }
}
