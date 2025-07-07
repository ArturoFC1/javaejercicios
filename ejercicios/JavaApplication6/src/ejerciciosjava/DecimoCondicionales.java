package ejerciciosjava;

import javax.swing.JOptionPane;

public class DecimoCondicionales {
    
    public static void main(String[] args) {
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer valor: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo valor: "));
        
        if (num1 == num2) {
            JOptionPane.showMessageDialog(null, "Los valores son iguales");
        }else if (num1 > num2){
            JOptionPane.showMessageDialog(null, "El valor 1 es mayor al valor 2");
        }else{
            JOptionPane.showMessageDialog(null, "El valor 2 es mayor al valor 1");
        }
    }
}
