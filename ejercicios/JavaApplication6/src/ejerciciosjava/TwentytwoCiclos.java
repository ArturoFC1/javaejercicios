package ejerciciosjava;

import java.util.Scanner;

public class TwentytwoCiclos {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int calificaciones;
        boolean reprobado = false;
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese la calificacion "+i+": ");
            calificaciones = entrada.nextInt();
            
            if (calificaciones < 6) {
                reprobado = true;
            }
        }
        if (reprobado == true) {
            System.out.println("Hay reprobados");
        }else{
            System.out.println("Ningun reprobado");
        }
    }
    
}
