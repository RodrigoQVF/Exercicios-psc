import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int A, D, nimpedido = 0, impedido = 0;
        int n1, n2;
        ArrayList<Integer> b = new ArrayList<Integer>();
        ArrayList<Integer> c = new ArrayList<Integer>();
do {
        do{

         A = scan.nextInt();
         D = scan.nextInt();

        }while(2 > A || A > 11 || 2 > D || D > 11);

        for(int i = 0; i<A; i++){
            do {
                n1 = scan.nextInt();

                
            } while (1 > n1 || n1 > 100000);
            b.add(n1);

        }
        for(int i = 0; i<D; i++){
            do {
                n2 = scan.nextInt();
                
            } while (1 > n2 || n2 > 100000);
            c.add(n2);

        }
        for(int i = 0; i<A; i++){
            if(b.get(i) == c.get(c.size() - 2)){
                nimpedido++;
                }else{
                if(b.get(i) == c.get(c.size() -2) && b.get(i) == c.get(c.size() - 1)){
                    nimpedido++;

                }else{
                    impedido++;
                }

                if(impedido >= 1){
                    break;
                }
                
            }
        }

        if(impedido >= 1){
            System.out.println("Y");
            nimpedido = 0;
            impedido = 0;
        }else{
            System.out.println("N");
            nimpedido = 0;
            impedido = 0;
        }


    } while (A != 0 && D != 0);

    }
}
