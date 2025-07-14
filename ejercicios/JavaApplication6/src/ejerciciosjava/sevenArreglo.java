package ejerciciosjava;

import java.util.Scanner;

public class sevenArreglo {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int arreglo[] = new int[10];
        boolean asendente = false;
        boolean desendente = false;
        
        
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print((i+1)+" Ingrese numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        for (int i = 0; i < (arreglo.length - 1); i++) {
            if (arreglo[i] >= arreglo[i+1]) {
                desendente = true;
            }else if (arreglo[i] <= arreglo[i+1]){
                asendente = true;
            }
        }
        
        if (desendente == asendente) {
            System.out.println("Estan desordenados");
        }else if(desendente == true && asendente == false){
            System.out.println("Es desendente");
        }if (desendente == false && asendente == true) {
            System.out.println("Es asendente");
        }
    }
}
