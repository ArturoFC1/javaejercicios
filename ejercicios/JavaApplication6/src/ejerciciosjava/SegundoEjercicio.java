package ejerciciosjava;

import java.util.Scanner;

public class SegundoEjercicio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        //Progrma que calcule salario semanal con sus horas semanales trabajadas    
        //y salario por hora
        
        int salarioxHora, horasTrabajadas, total;
        
        System.out.print("Ingrese su salario por hora: ");
        salarioxHora = entrada.nextInt();
        System.out.print("Ingrese total de horas trabajadas en la semana: ");
        horasTrabajadas = entrada.nextInt();
        
        total = salarioxHora * horasTrabajadas;
        
        System.out.println("Usted gana a la semana: "+ total);
    }
}