import java.util.Scanner;
import java.lang.Math;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float A, B, C;
        double delta, raiz,x1, x2;

        System.out.print("Insira valor de A:");
        A = scan.nextFloat();
        System.out.print("Insira valor de B:");
        B = scan.nextFloat();
        System.out.print("Insira valor de C:");
        C = scan.nextFloat();

        delta = B*B - 4*A*C;
        raiz =Math.sqrt(delta);
        x1 = (-B + raiz) / (2*A);
        x2 = (-B - raiz) /(2*A);

        if(A == 0 && B == 0 && C != 0){
            System.out.println("Coeficientes informados incorretamentes");
            scan.close();
            return;
        }
        if(A == 0 && B != 0){
            System.out.println("Essa é uma equação de primeiro grau, não há raiz nessa equação");
            scan.close();
            return;
        }
        if(delta < 0){
            System.out.println("Essa equação não possui raízes reais.");
            scan.close();
            return;
            }
        if(delta == 0){
            System.out.println("Esta equação possui duas raízes reais iguais.");
            System.out.println(x1);
            scan.close();
            return;
            }else {
                System.out.println("Esta equação possui duas raízes reais diferentes.");
                System.out.printf("X': %2f\nX'': %2f", x1, x2);
            }
        scan.close();
    }
}
