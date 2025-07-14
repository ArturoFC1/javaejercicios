package ejerciciosjava;

import java.util.Scanner;

public class ThreeArreglo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int newArreglo [] = new int[5];
        int conteoCeros = 0, conteoPositivos = 0, conteoNegativos = 0;
        int sumaPositivos = 0, sumaNegativos = 0;
        float promPositivos, promNegativos; 
        
        for (int i = 0; i < newArreglo.length; i++) {
            System.out.print("Ingrese el numero "+(i+1)+": ");
            newArreglo[i] = entrada.nextInt();
        }
        
        for(int i:newArreglo){
            if (i == 0) {
                conteoCeros ++;
            }else if (i > 0) {
                conteoPositivos ++;
                sumaPositivos += i; 
            }else{
                conteoNegativos ++;
                sumaNegativos += i; 
            }
        }
        if (conteoPositivos == 0) {
            System.out.println("No hay positivos");
        }else{
            promPositivos = (float) (sumaPositivos / conteoPositivos);
            System.out.println("Promedio positivos: "+promPositivos);
        }
        if (conteoNegativos == 0) {
            System.out.println("No hay negativos");
        }else{
            promNegativos = (float) (sumaNegativos / conteoNegativos);
            System.out.println("Promedio negativos: "+promNegativos);
        }
        System.out.println("Total de ceros: "+conteoCeros);
    }
}
