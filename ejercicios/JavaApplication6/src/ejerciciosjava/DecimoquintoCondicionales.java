package ejerciciosjava;

import javax.swing.JOptionPane;

public class DecimoquintoCondicionales {
    public static void main(String[] args) {
        
        int num1, num2, num3;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer valor: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo valor: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tercer valor: "));
        
        if (num1 == num2 && num2 == num3) {
            JOptionPane.showMessageDialog(null, "Los valores son iguales");
        }else if (num1 >= num2 && num2 >= num3){
                JOptionPane.showMessageDialog(null, "El mayor es "+num1 + " - "+num2 + " - " + num3);
        }else if (num1 >= num3 && num3 >= num2 ){
                JOptionPane.showMessageDialog(null, "El mayor es "+num1 + " - "+num3 + " - " + num2); 
        }else if (num2 >= num1 && num1 >= num3){
                JOptionPane.showMessageDialog(null, "El mayor es "+num2 + " - "+num1 + " - " + num3); 
        }else if (num2 >= num3 && num3 >= num1 ){
                JOptionPane.showMessageDialog(null, "El mayor es "+num2 + " - "+num3 + " - " + num1); 
        }else if (num3 >= num1 && num1 >= num2){
                JOptionPane.showMessageDialog(null, "El mayor es "+num3 + " - "+num1 + " - " + num2); 
        }else if (num3 >= num2 && num2 >= num1 ){
                JOptionPane.showMessageDialog(null, "El mayor es "+num3 + " - "+num2 + " - " + num1); 
        }
    }
}
