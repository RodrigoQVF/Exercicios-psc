import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float valorpago, valorcompra, troco;
        int nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0, nota1 = 0, soma = 0;


        System.out.print("Insira valor da compra:");
        valorcompra = scan.nextFloat();

        System.out.print("Insira valor pago:");
        valorpago = scan.nextFloat();

        troco = valorpago - valorcompra;
        System.out.println("Troco:" + troco);

        while(soma != troco){
            if(soma + 50 <= troco){
                soma+=50;
                nota50++;
            }
            else if(soma + 20 <= troco){
                soma+=20;
                nota20++;
            }
            else if(soma + 10 <= troco){
                soma+=10;
            nota10++;
            }
            else if(soma + 5 <= troco){
                soma+=5;
            nota5++;
            }
            else if(soma + 2 <= troco){
                soma+=2;
            nota2++;
            }
            else if(soma + 1 <= troco){
                soma+=1;
            nota1++;
            }
        }
        System.out.println("notas R$50: " + nota50);
        System.out.println("notas R$20: " + nota20);
        System.out.println("notas R$10: " + nota10);
        System.out.println("notas R$5: " + nota5);
        System.out.println("notas R$2: " + nota2);
        System.out.println("notas R$1: " + nota1);

        scan.close();

    }
}
