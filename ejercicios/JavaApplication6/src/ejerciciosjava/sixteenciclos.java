package ejerciciosjava;

import java.util.Scanner;

public class sixteenciclos {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        
        System.out.print("Ingrese un numero entre 1 y 10: ");
        int num = entrada.nextInt();
        int tabla = 1;
        
        if (num > 0 && num <= 10) {
            for (int i = 1; i <= 10; i++) {
                tabla = num * i;
                System.out.println(num+" x "+ i + " = "+ tabla);
        }
        }else{
            System.out.println("El numero no esta dentro del parametro");
        }
    }
}
