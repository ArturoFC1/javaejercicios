package ejerciciosjava;

import javax.swing.JOptionPane;

public class TreceavoCondicionales {
    public static void main(String[] args) {
        
        int horasExtra, salarioTotalE, salarioTotal;
        int horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese sus horas trabajadas: "));
        
        if (horasTrabajadas > 40) {
            horasExtra = horasTrabajadas - 40;
            salarioTotalE = (horasExtra * 20);
            salarioTotal = ((40 * 16) + salarioTotalE);
            JOptionPane.showMessageDialog(null, "Usted gana a la semana por "+(horasTrabajadas)+" horas trabajadas: \n"
                    + "                                ----- $ " + salarioTotal + " -----");
        }else{
            salarioTotal = horasTrabajadas * 16;
            JOptionPane.showMessageDialog(null, "Usted gana a la semana por "+horasTrabajadas+" horas trabajadas: \n"
                    + "                                ----- $ " + salarioTotal + " -----");
        }
    }
}
