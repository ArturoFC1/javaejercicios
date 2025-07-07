package ejerciciosjava;

import java.util.Scanner;

public class sevenciclos {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
        
        System.out.print("Ingrese numero: ");
        int num = ent.nextInt();
        double media = 0;
        int conteo=0;
        
        if (num >= 0) {
            do {
                media += num;
                conteo++;
                System.out.print("Ingrese otro numero: ");
                num = ent.nextInt();
            } while (num >= 0);
            media /= conteo;
            System.out.println("La media de "+conteo+" numeros es: "+media);
        }else{
            System.out.println("Numero ingresado negativo");
        }
    }
}