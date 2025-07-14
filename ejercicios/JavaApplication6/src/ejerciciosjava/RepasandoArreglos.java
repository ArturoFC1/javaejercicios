package ejerciciosjava;

public class RepasandoArreglos {
    
    public static void main(String[] args) {
        
        // Para declarar un arreglo es de la siguiente manera:
        
        int arreglo [] = new int[3];
        
        arreglo[0] = 1;
        arreglo[1] = 10;
        arreglo[2] = 2;
        
        int arreglos [] = {3,4,5,7};        
        
        for(int i:arreglos){
            System.out.println(i);
        }
        
        String arregloss [] = {"maria", "sofia", "valeria", "ignacia"};
        
        for (String i:arregloss){
            System.out.println(i);
        }
    }
}
