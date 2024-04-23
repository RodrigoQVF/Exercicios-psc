import java.util.*;

public class App{
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Scanner scan2 = new Scanner(System.in);


            int n, contA = 0, contE = 0, contH = 0, contM = 0, contX = 0, cont = 0;
            String raca;
            char caractere;

            do{
                n = scan.nextInt();
  
            }while(0 >= n || n > 10);
            while(n != cont){
                scan.next();

                caractere = scan2.next().charAt(0);

                if(caractere == 'A'){
                    contA++;
                }
                if(caractere == 'E'){
                    contE++;
                }
                if(caractere == 'H'){
                    contH++;
                }
                if(caractere == 'M'){
                    contM++;
                }
                if(caractere == 'X'){
                    contX++;
                }

                cont++;
            }
            System.out.println(contX + " Hobbit(s)");
            System.out.println(contH + " Humano(s)");
            System.out.println(contE + " Elfo(s)");
            System.out.println(contA + " Anao(oes)");
            System.out.println(contM + " Mago(s)");






    scan.close();
        
    }

}
