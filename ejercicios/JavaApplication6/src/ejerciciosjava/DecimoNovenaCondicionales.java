package ejerciciosjava;

import javax.swing.JOptionPane;

public class DecimoNovenaCondicionales {
    public static void main(String[] args) {
        
        int n1, n2;
        char entrada;
        int suma,resta,producto;
        double div;

        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese primer valor: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese segundo valor: "));
        
        entrada = JOptionPane.showInputDialog(null, "Ingrese que operacion desea realizar \n"
                + "- Suma: (S u s) \n"
                + "- Resta: (R u r) \n"
                + "- Producto: (P u p) o (M u m) \n"
                + "- Division: (D u d)").charAt(0);
        
        entrada = Character.toUpperCase(entrada);

        if (entrada == 'S') {
            suma = n1 + n2;
            JOptionPane.showMessageDialog(null, "La suma es: "+suma);
        }else if( entrada == 'R'){
            resta = n1 - n2;
            JOptionPane.showMessageDialog(null, "La resta es: "+resta);
        }else if( entrada == 'P'|| entrada == 'M'){
            producto = n1 * n2;
            JOptionPane.showMessageDialog(null, "El producto es: "+producto);
        }else if(entrada == 'D'){
            div = n1/n2;
            JOptionPane.showMessageDialog(null, "L division es: "+div);
        }else{
            JOptionPane.showMessageDialog(null, "Letra invalida");
        }
    }
}
