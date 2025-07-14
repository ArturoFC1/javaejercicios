package ejerciciosjava;

import java.util.Scanner;

public class SixArreglo {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int a[] = new int[12];
        int b[] = new int[12];
        int c[] = new int[24];
        
        
        for (int i = 0; i < a.length; i++) {
            System.out.print((i+1)+" Ingrese valor[a]: ");
            a[i] = entrada.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print((i+1)+" Ingrese valor[b]: ");
            b[i] = entrada.nextInt();
        }
        
        int k = 0;
        int q = 0;
        int ñ = 0;
        
        while (q < 12){
            for (k = 0; k < 3; k++) {
                c[ñ] = a[q];
                ñ++;
                q++;
            }
            q-=3;
            for (k = 0; k < 3; k++) {
                c[ñ] = b[q];
                ñ++;
                q++;
            }
        }
        for(int lol:c){
            System.out.print(lol+", ");
        }
    }
}
