package ejerciciosjava;

import javax.swing.JOptionPane;

public class CuartoEjercicio {
    public static void main(String[] args) {
        
        int salario = 1000;
        int comision = 0;
        int comisionPlus = 0;
        int costoAuto, totalAutos, salarioTotal;
        
        totalAutos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantos carros vendio:"));
        
        if (totalAutos > 0) {
            for (int i = 0; i < totalAutos; i++) {
                costoAuto = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese costo del "+ (i+1) + "° auto"));
                comision += 150;
                comisionPlus += (costoAuto*0.05); 
            } 
        }
        salarioTotal = (salario + comision + comisionPlus);
        JOptionPane.showMessageDialog(null, "Usted vendio "+totalAutos+" carros y ganaria al mes: "+salarioTotal);    
    }
}
