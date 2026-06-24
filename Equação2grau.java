import java.util.Scanner;

public class Equação2grau {
    
    public static void main(String[] args) {
        Scanner all = new Scanner(System.in);
        
        System.out.println("----------");
        System.out.println("Qual o valor de A?");
        int A = all.nextInt();
        System.out.println("----------");
        System.out.println("Qual o valor de B?");
        int B = all.nextInt();
        System.out.println("----------");
        System.out.println("Qual o valor de C?");
        int C = all.nextInt();
        System.out.println("----------");
        
        double delta1 = (B*B);
        double delta2 = (delta1-4*A*C);
        System.out.println("Delta = " + delta2);
        System.out.println("----------");
        
        if (delta2 >= 0) {
            
            double raizDelta = Math.sqrt(delta2);
            int Xc = (-1);
            int Xv = (Xc*B);
            double x1 = (Xv + raizDelta) / (2 * A);
            double x2 = (Xv - raizDelta) / (2 * A);
            System.out.println("X' = " + x1);
            System.out.println("X'' = " + x2); }
            
            if (delta2 < 0) {
                
                System.out.println("Não existem raízes reais."); }
        
            System.out.println("----------");
            
    }
        
}