package ejerciciosjava;

public class matricesFour {
    public static void main(String[] args) {
        
        int matriz[][] = new int[7][7];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                }else{
                  matriz[i][j] = 0;  
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println("");
        }
    }
}
