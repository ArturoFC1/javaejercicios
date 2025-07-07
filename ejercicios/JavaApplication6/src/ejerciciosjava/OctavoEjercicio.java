package ejerciciosjava;

import javax.swing.JOptionPane;

public class OctavoEjercicio {
    
    public static void main(String[] args) {
        //Construccion de programa para la fromaula general
        
        int a, b, c;
        double resultadoa, resultadob;
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese valor de A"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese valor de B"));
        c = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese valor de C"));
        
        resultadoa = (((-b) + (Math.sqrt((Math.pow(b, 2)) - (4 * (a*c))))) / 2*a);
        resultadob = (((-b) - (Math.sqrt((Math.pow(b, 2)) - (4 * (a*c))))) / 2*a);
        
        JOptionPane.showMessageDialog(null, "Los resultados son: \n"
                + "Primer valor: "+ resultadoa +"\n"
                        + "Segundo valor: "+resultadob);
    }
}
