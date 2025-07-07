package ejerciciosjava;

import java.util.Scanner;

public class TercerEjercicio {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        double dolaresGuille, dolaresLuis, dolaresJuan, total;
        
        System.out.print("Cuanto dinero tienes guillermo: ");
        dolaresGuille = entrada.nextDouble();
        
        dolaresLuis = (dolaresGuille / 2);
        dolaresJuan = ((dolaresLuis + dolaresGuille)/2);
        total = dolaresGuille + dolaresLuis + dolaresJuan;
        
        System.out.println("En total tienen: "+ total );
    }
}