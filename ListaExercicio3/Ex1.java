import java.util.Scanner;

public class Ex1 {
    /**
     * @author Rodrigo Queiroz Vieira Freire
     * Exercício 1 da lista 3 JAVA
     */
    //Funcão que faz as condições para saída do maior número
    public static void maiorNumero(float num1, float num2, float num3){
        if(num1 > num2 && num1 > num3)
            System.out.printf("\nO maior número é %.2f", num1);
        if(num2 > num1 && num2 > num3)
            System.out.printf("\nO maior número é %.2f", num2);
        if(num3 > num1 && num3 > num2)
            System.out.printf("\nO maior número é %.2f", num3);
    }
    //Função que faz as condições para saída do menor número
    public static void menorNumero(float num1, float num2, float num3){
        if(num1 < num2 && num1 < num3)
            System.out.printf("\nO menor número é %.2f", num1);
        if(num2 < num1 && num2 < num3)
            System.out.printf("\nO menor número é %.2f", num2);
        if(num3 < num1 && num3 < num2)
            System.out.printf("\nO menor número é %.2f", num3);
    }
    //Função que faz as condições para saída da média aritmética
    public static void mediaNumero(float num1, float num2, float num3){
        float media = (num1 + num2 + num3)/3;
        System.out.printf("\nMedia dos três números são %.2f", media);
    }

    public static void main(String[] args) {
        //Instância o objeto scan
        Scanner scan = new Scanner(System.in);
        //Inicia variáveis dos 3 números do tipo real
        float num1, num2, num3;

        //lê as variáveis dos 3 números do tipo real
        System.out.print("Insira num1:");
        num1 = scan.nextFloat();
        System.out.println("Insira num2:");
        num2 = scan.nextFloat();
        System.out.println("Insira num3:");
        num3 = scan.nextFloat();

        //Chama as funções recebendo as varíaveis necessárias
        maiorNumero(num1, num2, num3);
        menorNumero(num1, num2, num3);
        mediaNumero(num1, num2, num3);
        scan.close();
        }
    }