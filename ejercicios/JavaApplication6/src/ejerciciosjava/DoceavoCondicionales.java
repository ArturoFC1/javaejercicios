package ejerciciosjava;

import javax.swing.JOptionPane;

public class DoceavoCondicionales {
    public static void main(String[] args) {
        
        double descuento, totalCompra;
        int compra;
        
        compra = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su total de compra"));
        
        if (compra >= 300) {
            descuento = (0.20 * compra);
            totalCompra = compra - descuento;
            JOptionPane.showMessageDialog(null, "Su compra con el 20% de descuento es: $"+totalCompra);
        }else{
            JOptionPane.showMessageDialog(null, "Su total de compra es: $"+ compra);
        }
    }
}
