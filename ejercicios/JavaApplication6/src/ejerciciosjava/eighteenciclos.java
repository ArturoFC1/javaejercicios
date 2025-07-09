package ejerciciosjava;

import java.util.Scanner;

public class eighteenciclos {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int codigoArticulo, litrosVendidos = 0, litrosArticulouno = 0 , facMayores = 0;
        float totalxArticulo = 0, facTotal=0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese codigo del articulo del 1 al 3: ");
            codigoArticulo = entrada.nextInt();
            if (codigoArticulo >= 1 && codigoArticulo <= 3) {
                System.out.print("Ingrese cantidad vendida en litros del articulo '"+codigoArticulo+"': ");
                litrosVendidos = entrada.nextInt();
                switch (codigoArticulo){
                    case 1:
                    totalxArticulo = (float)(0.6 * litrosVendidos);
                    litrosArticulouno += litrosVendidos;
                        break;
                    case 2:
                    totalxArticulo = (float)(3 * litrosVendidos);
                        break;
                    case 3:
                    totalxArticulo = (float)(1.25 * litrosVendidos);
                        break;
                }
                if (totalxArticulo > 600) {
                facMayores++;
                }
                facTotal += totalxArticulo;
                    }else{
                        System.out.println("Numero no valido, intente Again");
                        i--;
            }
        }
        
        System.out.println("Facturacion tota "+ facTotal+"\n"
                + "Litros total del articulo 1: "+litrosArticulouno+"\n"
                        + "Facturas de mas de 600: "+facMayores);
    }
}
