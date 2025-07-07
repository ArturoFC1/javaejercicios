package ejerciciosjava;

import javax.swing.JOptionPane;

public class OnceavoCondicionales {
    
    public static void main(String[] args) {
        
        char caracter;
        
        
        caracter = JOptionPane.showInputDialog("Ingrese solo un caracter").charAt(0);
        
        if (Character.isUpperCase(caracter)) {
            JOptionPane.showMessageDialog(null, "Caracter en Mayuscula");
        }else{
            JOptionPane.showMessageDialog(null, "Caracter en Minuscula");
        }
    }
}
