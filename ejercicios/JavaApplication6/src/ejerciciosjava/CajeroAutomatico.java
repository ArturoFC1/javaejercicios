package ejerciciosjava;

import javax.swing.JOptionPane;

public class CajeroAutomatico {
    public static void main(String[] args) {
        
        int saldo = 1000;
        int ingresar;
        int retirar;
        int opcion = 0;
        
        do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"------------------  Banco -------------------\n"
                + "- Saldo actual: $"+saldo +"\n"
                        + "1) Ingresar dinero \n"
                        + "2) Retirar dinero \n"
                        + "3) Terminar"));
        
        switch(opcion){
            case 1: 
                ingresar = Integer.parseInt(JOptionPane.showInputDialog(null, "------------------  Menú Ingresar  -------------------\n"
                        + "Dinero a ingresar: "));
                saldo += ingresar;
                break;
            case 2:
                retirar = Integer.parseInt(JOptionPane.showInputDialog(null, "------------------  Menú Retirar  -------------------\n"
                        + "Dinero a retirar: "));
                saldo -= retirar;
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Hasta la proxima");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion incorrecta");
            }
        }while(opcion != 3);
    }
}
