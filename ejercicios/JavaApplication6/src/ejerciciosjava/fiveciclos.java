package ejerciciosjava;

import java.util.Scanner;

public class fiveciclos {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        /**
         * Ejercicio 5: Realizar un juego para adivinar un número. Para ello 
         * generar un número aleatorio entre 0-100, y luego ir pidiendo números 
         * indicando "es mayor” o “es menor” según sea mayor o menor con respecto 
         * a N. El proceso termina cuando el usuario acierta y muestra el número de intentos.
         */
        int nAleatorio = (int)(Math.random()*100);
        
        System.out.print("Ingrese numero aproximado: ");
        int num = entrada.nextInt();
        int cont = 1;
        
        while   (nAleatorio != num){
            if (num > nAleatorio) {
                System.out.println("Bajale we te pasaste");
            }else if(num < nAleatorio){
                System.out.println("Subele we le falta");
            }
            cont++;
            System.out.print("Ingrese otro numero aproximado: ");
            num = entrada.nextInt();
        }
        System.out.println("Perro le atinaste en "+cont+" intentos, tu numero es "+num+" y es "+nAleatorio);
    }
}
