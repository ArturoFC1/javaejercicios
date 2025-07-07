package ejerciciosjava;

import javax.swing.JOptionPane;

public class DecimoseptimoCondicionales {
    public static void main(String[] args) {
        
        int dia ,mes, año;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese mes:  "));
        año = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese año: "));
        
        if (dia > 0 && dia < 31 && mes > 0 && mes < 13 ) {
                JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + año);
        }else{
            JOptionPane.showMessageDialog(null, "Dia o Mes incorrecto");
        }   
    }
}
