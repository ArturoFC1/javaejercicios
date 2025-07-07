
package ejerciciosjava;

import java.util.Scanner;

public class fourciclos {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int contador = 0;
        System.out.print("Ingrese un numero: ");
        int num = entrada.nextInt();
        
        while   (num >= 0){
            contador ++;
            System.out.print("Ingrese un numero: ");
            num = entrada.nextInt();
        }
        System.out.println("Total de numeros positivos introducidos: "+contador);
    }
}
