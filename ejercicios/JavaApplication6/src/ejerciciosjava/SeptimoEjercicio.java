package ejerciciosjava;

import java.util.Scanner;

public class SeptimoEjercicio {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        //Ejercicio 7: Construir un programa que, dado un número total de horas, 
        //devuelve el número de semanas, días y horas equivalentes. Por ejemplo, 
        //dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas y al año 8760.
        
        // dia = 24 horas
        // semana = 168 horas
        
        int horas, dias, semana, año, añoH, semanaH, diasH;
        
        System.out.print("Ingrese el numero total de horas: ");
        horas = entrada.nextInt();
        
        año = (horas / 8760);
        
        añoH = año * 8760;
        
        semana = (horas - añoH) / 168;  //Obtengo las semanas
        
        semanaH = semana * 168;  //Calculo total de horas de las semanas
        
        dias = ((horas - semanaH - añoH) / 24);  //Obtengo dias totales sobran restando las semanas
        
        diasH = dias * 24;  //Obtengo horas de los dias
        
        horas = (horas - semanaH - diasH - añoH); //Calculo horas sobrantes
        
        
        System.out.println("Son en total: "+ año + " año(s) " +semana + " semanas con "+ dias + " dias y " + horas + " horas");
        
        
    
    }
}