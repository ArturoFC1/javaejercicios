package ejerciciosjava;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class JavaApplication6 {

    public static void main(String[] args) {
        //HACER PROGRAMA QUE CALCULE PROMEDIO DE TRES CALIFIFACIONES
        Scanner entrada = new Scanner (System.in);
        
        double calificacion1, calificacion2, calificacion3, promedio;
        
        System.out.println("Ingrese sus calificaciones de cada evaluacion: ");
        System.out.print("Calififcacion 1: ");
        calificacion1 = entrada.nextDouble();
        System.out.print("Calififcacion 2: ");
        calificacion2 = entrada.nextDouble();
        System.out.print("Calififcacion 3: ");
        calificacion3 = entrada.nextDouble();
        
        promedio = ((calificacion1 + calificacion2 + calificacion3)/3);
        JOptionPane.showMessageDialog(null, "El promedio es: "+promedio);  
    }
    
}
