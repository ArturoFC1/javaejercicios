package ejerciciosjava;

import java.util.Scanner;

public class seventeenciclos {
    
    public static void main(String[] args) {
        
        /**
         * Ejercicio 17: Una empresa que se dedica a la venta de desinfectantes 
         * necesita un programa para gestionar las facturas. En cada factura figura: 
         * el código del artículo, la cantidad vendida en litros y el precio por litro. 
         * Se pide de 5 facturas introducidas: Facturación total, cantidad en 
         * litros vendidos del artículo 1 y cuantas facturas se emitieron de más de $600.
         */
        Scanner entrada = new Scanner (System.in);
        
        int codigoArticulo, litrosVendidos, precioLitro;
        int totalUnidad, facTotal=0, litrosArticulouno = 0, facturasMayores = 0;
        
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese codigo del articulo "+i+": ");
            codigoArticulo = entrada.nextInt();
            System.out.print("Ingrese cantidad vendida en litros del articulo "+i+": ");
            litrosVendidos = entrada.nextInt();
            System.out.print("Ingrese el precio x litro del articulo "+i+": ");
            precioLitro = entrada.nextInt();
            
            totalUnidad = litrosVendidos * precioLitro;
            facTotal += totalUnidad;
            
            if (codigoArticulo == 1) {
                litrosArticulouno += litrosVendidos;
            }
            if (totalUnidad > 600) {
                facturasMayores++;
            }
        }
        System.out.println("La facturacion total es: "+facTotal+"\n"
                + "Cantidad de litros vendidos al articulo 1: "+litrosArticulouno+"\n"
                        + "Total de facturas mayores a $600: "+facturasMayores);
    }
}