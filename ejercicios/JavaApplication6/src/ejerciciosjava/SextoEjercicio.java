package ejerciciosjava;

import javax.swing.JOptionPane;

public class SextoEjercicio {
    public static void main(String[] args) {
        
        int a,b;
        double cuadradoSuma;
        
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese valor de A"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de B"));
        
        cuadradoSuma = ((Math.pow(a, 2)) + (2 * (a * b)) + (Math.pow(b, 2)));
        JOptionPane.showMessageDialog(null, "El cuadrado de la suma es: "+cuadradoSuma);
    }
}
