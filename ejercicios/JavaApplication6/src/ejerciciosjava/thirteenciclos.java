package ejerciciosjava;

import java.util.Scanner;

public class thirteenciclos {
    public static void main(String[] args) {
        
        Scanner ent = new Scanner (System.in);
        
        int num;
        double promN = 0, promP = 0;
        int mediaN = 0, mediaP = 0, conteoC = 0, conteoN = 0, conteoP = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el valor "+(i+1)+": ");
            num = ent.nextInt();
            
            if (num == 0) {
                conteoC ++;
            }else if (num < 0) {
                conteoN++;
                mediaN += num;
                promN = mediaN / conteoN;
            }else{
                conteoP++;
                mediaP += num;
                promP = mediaP / conteoP;
            }
        }
        System.out.println("");
        System.out.println("El total de 0 es: "+conteoC+"\n"
                + "El promedio de positivos es: "+promP+"\n"
                        + "El promedio de negativos es: "+promN);
    }
}