package ejerciciosjava;

import javax.swing.JOptionPane;

public class CatorceavoCondicionales {
    
    public static void main(String[] args) {
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero 1"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero 2 "));
        
        if (num1%2 == 0 && num2%2 == 0) {
            JOptionPane.showMessageDialog(null, "Los dos numeros son pares");
        }else{
            JOptionPane.showMessageDialog(null, "Los dos numeros son impares");
        }
    }
}
