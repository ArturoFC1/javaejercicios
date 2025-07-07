package ejerciciosjava;

import javax.swing.JOptionPane;

public class ConversorMedida {
    
    public static void main(String[] args) {
        
        double kg = 0;
        int opc = 0;
        
        do {
            double peso = 0;
            opc = Integer.parseInt(JOptionPane.showInputDialog(null,"---------------  Conversor Medidas -------------------\n"
                    + "1) Kilogramos --> Gramos\n"
                    + "2) Kilogramos --> Toneladas\n"
                    + "3) Kilogramos --> Miligramos\n"
                    + "4) Kilogramos --> Libras\n"
                    + "5) Kilogramos --> Onzas\n"
                    + "6) Salir"));
            
            switch(opc){
                case 1: 
                    kg = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese los KG: "));
                    peso = kg * 1000;
                    JOptionPane.showMessageDialog(null, "De "+kg+" kg son: "+ peso + " gramos");
                    break;
                case 2: 
                    kg = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese los KG: "));
                    peso = kg / 1000;
                    JOptionPane.showMessageDialog(null, "De "+kg+" kg son: "+ peso + " toneladas");
                    break;
                case 3: 
                    kg = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese los KG: "));
                    peso = kg * 1000000;
                    JOptionPane.showMessageDialog(null, "De "+kg+" kg son: "+ peso + " miligramos");
                    break;
                case 4: 
                    kg = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese los KG: "));
                    peso = kg * 2.2046;
                    JOptionPane.showMessageDialog(null, "De "+kg+" kg son: "+ peso + " libras");
                    break;
                case 5: 
                    kg = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese los KG: "));
                    peso = kg * 35.274;
                    JOptionPane.showMessageDialog(null, "De "+kg+" kg son: "+ peso + " onzas");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Hasta luego !!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta, vuelta ingresar opcion");
            }
        } while (opc != 6);
    }
}
