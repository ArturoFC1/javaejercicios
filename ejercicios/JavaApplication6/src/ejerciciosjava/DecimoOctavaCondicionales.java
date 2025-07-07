package ejerciciosjava;

import javax.swing.JOptionPane;

public class DecimoOctavaCondicionales {
    public static void main(String[] args) {
        
        int dia, mes, año;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese año: "));
        
        if (dia >= 1 && dia <= 31) {
            if (mes >= 1 && mes <= 12) {
                if (año != 0) {
                    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                        if (dia >= 1 && dia <=31) {
                            JOptionPane.showMessageDialog(null, "Fecha correcta: "+ dia +"/"+mes+"/"+año);
                        }else{
                            JOptionPane.showMessageDialog(null, "Dias no coresponden a mes");
                        }
                    }
                    if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                        if (dia >= 1 && dia <= 30) {
                            JOptionPane.showMessageDialog(null, "Fecha correcta: "+ dia +"/"+mes+"/"+año);
                        }else{
                            JOptionPane.showMessageDialog(null, "Dias no coresponden a mes");
                        }
                }
                    if (mes == 2) {
                        if (dia >= 1 && dia <= 28) {
                            JOptionPane.showMessageDialog(null, "Fecha correcta: "+ dia +"/"+mes+"/"+año);
                        }else{
                            JOptionPane.showMessageDialog(null, "Dias no coresponden a mes");
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Año no puede ser 0");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Mes fuera de valores");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Dia fuera de valores");
        } 
        
    }
}
