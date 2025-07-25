package ClasesyObjetos;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        
        //Recoleccion de Datos
        String nombre = JOptionPane.showInputDialog("Ingresa nombre: ");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa precio: "));
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad: "));
        int descuento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese del 0 al 100 el descuento:"));
        
        //Creacion de Objetos
        Producto p1 = new Producto(nombre, precio, cantidad);
        
        //Llamado de metodos
        p1.mostrarInformacion();
        double valorsinDescuento = p1.calcularValorInventario();
        double precioFinal = p1.valorFinal(descuento, valorsinDescuento);
        
        p1.imprimirFinal(valorsinDescuento, descuento, precioFinal);
    }
}
