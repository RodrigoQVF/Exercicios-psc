import java.util.Scanner;
import java.lang.Math;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op = 99;
        double r, pi, perimetro, area, volume;
        pi = Math.PI;
        System.out.print("Insire valor do raio:");
        r = scan.nextDouble();
        System.out.println("\n1 - Perimetro do circulo\n2 - Área do círculo\n3 - Volume da esfera");
        System.out.print("\nInsira a opção:");
        op = scan.nextInt();

        scan.close();
        switch (op) {
            case 1:
                perimetro = 2 * pi * r;
                System.out.printf("Perimetro do círculo: %2f", perimetro);
                break;
            case 2:
                area = pi * r * r;
                System.out.printf("Área do círculo: %2f", area);
                break;
            case 3:
                volume = (4 * pi * Math.pow(r, 3)) / 3;
                System.out.printf("Volume da esfera: %2f", volume);
                break;  
            default:
                System.out.println("Opção incorreta");
                break;
        }
    }
}
