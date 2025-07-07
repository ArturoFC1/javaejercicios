package ejerciciosjava;

import javax.swing.JOptionPane;

public class DecimosextoCondicionales {
    public static void main(String[] args) {
        
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un valor de 0 a 99,999"));
        
        if (num >= 0 && num < 100000) {
            if (num >= 10 && num < 100) {
                JOptionPane.showMessageDialog(null, "El valor "+num+" tiene 2 cifras");
            }else if (num >= 100 && num < 1000 ) {
                JOptionPane.showMessageDialog(null, "El valor "+num+" tiene 3 cifras");
            }else if (num >= 1000 && num < 10000){
                JOptionPane.showMessageDialog(null, "El valor "+num+" tiene 4 cifras");
            }else if (num >= 10000 && num < 100000){
                JOptionPane.showMessageDialog(null, "El valor "+num+" tiene 5 cifras");
            }else{
                JOptionPane.showMessageDialog(null, "El valor "+num+" tiene 1 cifra");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Valor no aceptado");
        }
    }
}