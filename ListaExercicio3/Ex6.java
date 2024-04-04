import java.util.Scanner;
import java.util.Random;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int num1, num2, nRandom;

        System.out.print("Insira um número:");
        num1 = scan.nextInt();

        System.out.print("Insira outro número:");
        num2 = scan.nextInt();

        if (num1 > num2){
            nRandom = rand.nextInt(num2, num1);
        } else{
            nRandom = rand.nextInt(num1, num2);
        }

        if(nRandom % 2 == 0)
            System.out.printf("O número %d é par", nRandom);

        if(nRandom % 2 == 1)
            System.out.printf("O número %d é impar", nRandom);

        scan.close();
    }
}
