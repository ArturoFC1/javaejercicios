package ejerciciosjava;

import java.util.Scanner;

public class sixciclos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Ingrese un numero: ");
        int num = entrada.nextInt();
        int suma = 0, conteo = 0;
        
        while (num != 0){
            suma += num;
            conteo ++;
            
            System.out.print("Ingrese un numero: ");
            num = entrada.nextInt();
        }
        
        System.out.println("La suma total de los "+conteo+" numeros es: "+suma);
    }
}