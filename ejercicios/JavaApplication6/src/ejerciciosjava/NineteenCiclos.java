package ejerciciosjava;

import java.util.Scanner;

public class NineteenCiclos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int i = 1, nota;
        int aprobados = 0, condicionados = 0, suspensos = 0;
        while   (i <= 6){
            System.out.print("Ingrese la nota numero "+i+": ");
            nota = entrada.nextInt();
            
            if (nota > 0 && nota <= 10) {
                if (nota == 4) {
                condicionados ++;
                }else if(nota <4 ){
                suspensos ++;
                    }else{
                    aprobados ++;
                }
                i++;    
            }else{
                System.out.println("Valor invalido ingrese nuevamente");
            }
        }
        System.out.println("-----------------");
        System.out.println("Total alumnos aprobados: "+aprobados+"\n"
                + "Total alumnos condicionado: "+condicionados+"\n"
                        + "Total alumnos suspensos: "+suspensos);
    }
}
