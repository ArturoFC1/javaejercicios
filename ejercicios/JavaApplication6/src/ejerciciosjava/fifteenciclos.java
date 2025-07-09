package ejerciciosjava;

import java.util.Scanner;

public class fifteenciclos {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int edad, edadS = 0;
        float estatura, estaturaS = 0;
        int edadConteo = 0, estaturaConteo = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese la edad de alumno "+i+": ");
            edad = entrada.nextInt();
            edadS += edad;
            
            System.out.print("Ingrese la estatura de alumno "+i+": ");
            estatura = entrada.nextFloat();
            estaturaS += estatura;
            
            if (edad > 18) {
                edadConteo ++;
            }
            if (estatura > 1.75) {
                estaturaConteo ++;
            }
        }
        System.out.println("La edad promedio es: "+(edadS  / 5)+"\n"
                + "La estatura promedio es: "+(estaturaS / 5)+"\n"
                        + "Mayores a 18: "+edadConteo+"\n"
                                + "Mayores a 1.75: "+estaturaConteo);
    }
}
