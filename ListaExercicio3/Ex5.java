import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float num1, num2;
        String op;

        System.out.print("Insira primeiro número:");
        num1 = scan.nextFloat();

        System.out.print("Insira segundo número:");
        num2 = scan.nextFloat();

        System.out.println("\n+ = Somar\n- = subtração\n* = Multiplicação\n/ = Divisão");
        System.out.print("\nInsira opção:");
        op = scan.next();
        
        switch (op) {
            case "+":

                System.out.printf("Soma:%.2f", num1 + num2);
                break;
            case "-":
                System.out.printf("Subtração:%.2f", num1 - num2);
                break;
            case "*":
                System.out.printf("Multiplicação:%.2f", num1 * num2);
                break;
            case "/":
                System.out.printf("Divisão:%.2f", num1 / num2);
                break;

            default:
                System.out.println("Opção incorreta");
                break;
        }
        scan.close();
    }
}
