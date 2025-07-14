package ejerciciosjava;

import java.util.Scanner;

public class EightArreglo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int arreglo[] = new int[10];
        int nNumero, posicion;

        // Ingresar 8 valores
        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + " Ingrese valores: ");
            arreglo[i] = entrada.nextInt();
        }
        
        // Número a insertar
        System.out.print("Ingrese un numero: ");
        nNumero = entrada.nextInt();
        
        // Posición para insertar
        System.out.print("Ingrese una posicion: ");
        posicion = entrada.nextInt();

        // Validar posición (0 a 8 porque solo hay 8 elementos y uno más se inserta)
        if (posicion >= 0 && posicion <= 8) {
            // Desplazar elementos de derecha a izquierda
            for (int i = 7; i >= posicion; i--) {
                arreglo[i + 1] = arreglo[i];
            }
            // Insertar el número en la posición indicada
            arreglo[posicion] = nNumero;

            // Imprimir el arreglo con 9 elementos (8 + 1 insertado)
            System.out.println("Arreglo final:");
            for (int i = 0; i < 9; i++) {
                System.out.print(arreglo[i] + ", ");
            }
        } else {
            System.out.println("Numero fuera de limites");
        }
    }
}
