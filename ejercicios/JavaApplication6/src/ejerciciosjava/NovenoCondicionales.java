package ejerciciosjava;

import javax.swing.JOptionPane;

public class NovenoCondicionales {
    
    public static void main(String[] args) {
        
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero:"));
        
        if (num % 10 == 0) {
            JOptionPane.showMessageDialog(null, "El "+num+ " es multiplo de 10");
        }else{
            JOptionPane.showMessageDialog(null, "El "+num+ " no es multiplo de 10");
        }
    }
    
}
