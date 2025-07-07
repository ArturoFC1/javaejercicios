package ejerciciosjava;

import java.util.Scanner;

public class QuintoEjercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        double participacion, calificacionFinal;
        double pExamen;
        double sExamen;
        double eFinal;
        
        System.out.print("Del 0 al 10 cuanto obtuvo en participacion: ");
        participacion = entrada.nextDouble();
        System.out.print("Del 0 al 10 cuanto obtuvo en su primer examen: ");
        pExamen = entrada.nextDouble();
        System.out.print("Del 0 al 10 cuanto obtuvo en su segundo examen: ");
        sExamen = entrada.nextDouble();
        System.out.print("Del 0 al 10 cuanto obtuvo en su examen final: ");
        eFinal = entrada.nextDouble();
        
        participacion *= 0.1;
        pExamen *= 0.25;
        sExamen *= 0.25;
        eFinal *= 0.40;
        
        calificacionFinal = (participacion + pExamen + sExamen + eFinal); 
        
        System.out.println("Su calificacion es: "+ calificacionFinal); 
    }    
}
