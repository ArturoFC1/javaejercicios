package ClasesyObjetos;

public class Producto {
    
    String nombre;
    double precio;
    int cantidad;
    
    public Producto(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public void mostrarInformacion(){
        System.out.println("Nombre del producto: "+nombre+"\n"
                + "Precio del producto: "+precio+"\n"
                        + "Cantidad del producto: "+cantidad+"\n");
    }
    public double calcularValorInventario(){
        return precio*cantidad;
    }
    public double valorFinal(int descuento, double precioF){
        if (descuento > 0 && descuento <= 100) {
            double porcentaje = descuento * 0.01;
            double precioFinal = precioF - (precioF*porcentaje); 
            return precioFinal;
        }else{
            return precioF;
        }
    }
    public void imprimirFinal(double valorsinDescuento, int descuento, double preciofinal){
        System.out.println("----Tiquet Final----\n"
            + "- Nombre: "+nombre+"\n"
                    + "- Precio: "+precio+"\n"
                            + "- Cantidad: "+cantidad+"\n");
        if (descuento == 0) {
            System.out.println("- No hubo descuento\n"
                    + "- Precio Final: "+valorsinDescuento);
        }else{
            System.out.println("Descuento: "+descuento+"%\n"
                    + "Precio final: "+preciofinal);
        }
    }
}
