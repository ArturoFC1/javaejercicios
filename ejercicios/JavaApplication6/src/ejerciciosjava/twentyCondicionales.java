package ejerciciosjava;

import javax.swing.JOptionPane;

public class twentyCondicionales {
    
    public static void main(String[] args) {
        
        int nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese nota de 0 a 10"));
        
        if (nota >= 0 && nota <= 10) {
            switch (nota){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6: JOptionPane.showMessageDialog(null, "Nota insuficiente");
                    break;
                case 7: JOptionPane.showMessageDialog(null, "Nota Suficiente");
                    break;
                case 8: JOptionPane.showMessageDialog(null, "Nota Bien");
                    break;
                case 9: JOptionPane.showMessageDialog(null, "Nota Notable");
                    break;
                case 10: JOptionPane.showMessageDialog(null, "Nota Sobresaliente");
                    break;
            }
        }else{
            JOptionPane.showMessageDialog(null, "Valor invalido");
        }
    }
    
}
