package ejerciciosjava;

import java.util.Scanner;

public class threeciclos {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Ingrese un numero: ");
        int num = entrada.nextInt();
        
        while(num > 0 && num != 0){
            if (num % 2 == 0) {
                System.out.println("Numero Par");
            }else{
                System.out.println("Numero Impar");
            }
            System.out.println("Ingrese otro numero: ");
            num = entrada.nextInt();
        }
        
        System.out.println("Numero invalido o 0");
    }
    
}
