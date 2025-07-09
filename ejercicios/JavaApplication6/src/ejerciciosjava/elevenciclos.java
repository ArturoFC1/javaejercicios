package ejerciciosjava;

public class elevenciclos {
    public static void main(String[] args) {
        
        int num = 1;
        
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
            }else{
                System.out.println("Numero impar: "+i);
                num *= i;
            }
        }
        System.out.print("----------");
        System.out.println("Producto total de impares: "+num);
    }
    
}
