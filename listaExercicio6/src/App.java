import java.util.*;
public class App {

    public static void ex1(Scanner scan){
        int vetor[] = new int[9];
        int i = 0, contdiv = 0, k = 0;
        while(i != 9){
            vetor[i] = scan.nextInt();
            i++;
        }
        while(k != i){
            for(int j = 1; j<=vetor[k];j++){
                if(vetor[k] % j == 0){
                    contdiv++;
                }
            }
            if(contdiv == 2){
                System.out.printf("%d é primo\nposição do vetor: %d\n", vetor[k], k);
            }
            contdiv = 0;

            k++;
        }

    }
    public static void ex2(Scanner scan){
        int vetor1[] = new int[10], vetor2[] = new int[10], vetor3[] = new int[20];
        int k = 0;

   

        for(int i = 0; i < 10; i++){
            vetor1[i] = scan.nextInt();
            vetor2[i] = scan.nextInt();
            
        }

        for(int j = 0; j < 20; j++){
            vetor3[j] = vetor1[k];
            vetor3[j+1] = vetor2[k];

            k++;
            j++;
        }
        for(int j = 0; j < 20; j++){
            System.out.print(vetor3[j] + " ");
            System.out.println();
        }


    }
    public static void ex3(Scanner scan){
        int vetor[] = new int[8], vp[] = new int[8], vn[] = new int[8];
        int j = 0, k = 0, contaNegativo = 0, contaPositivo = 0;

        for(int i = 0; i < 8; i++){
            do{
            vetor[i] = scan.nextInt();
            }while(vetor[i] == 0);

            if(vetor[i] < 0){
                contaNegativo++;
                vn[k] = vetor[i];
                k++;
 
            }else{
                contaPositivo++;
                vp[j] = vetor[i];
                j++;
            }
        }

        if(contaPositivo == 8 || contaNegativo == 8){
        System.out.println("Todos os numeros do vetor sao apenas positivos ou apenas negativos");
        return;
        }

        System.out.print("Vetor positivo:");
        // [1, 2, 3, 4, 0, 0, 0 ,0 ]
        for(int l = 0; l<8; l++){
            if(vp[l] == 0)
            break;
            System.out.print(vp[l] + " ");
        }
        System.out.print("\nVetor negativo:");
        for(int l = 0; l<8; l++){
            if(vn[l] == 0)
            break;
            System.out.print(vn[l] + " ");
        }
        

    }
    public static void ex4(Scanner scan){
        int num[] = new int[12], op = 0, op2 = 0, consulta, contConsulta;
        int vagas[] = new int[12];
        String origem[] = new String[12];
        String destino[] = new String[12];
        String qOrigem, qDestino;
        

        for(int i = 0; i<2; i++){

            System.out.println("Insira o numero do voo");
            num[i] = scan.nextInt();
            System.out.println("Insira origem do voo");
            scan.nextLine();
            origem[i] = scan.nextLine();
            System.out.println("Insira destino do voo");
            destino[i] = scan.nextLine();
            System.out.println("Insira o total de vagas disponiveis");
            vagas[i] = scan.nextInt();

        }
        while(op != 3){
            System.out.println();
            System.out.println("1 - consultar");
            System.out.println("2 - Efetuar reserva");
            System.out.println("3 - Sair");
            System.out.println("Insira opcao:");
            op = scan.nextInt();
            switch(op){
                case 1:
                contConsulta = 0;
                System.out.println("1 -  por numero");
                System.out.println("2 - por origem");
                System.out.println("3 - por destino");
                System.out.println("Insira opcao");
                op2 = scan.nextInt();
                switch(op2){
                    case 1:
                    System.out.println("Insira o numero do voo");
                    consulta = scan.nextInt();
                    

                    for(int k = 0; k<12; k++){
                        if(num[k] == consulta){
                            System.out.printf("NUMERO: %d ORIGEM: %s DESTINO:%s VAGAS:%d", num[k], origem[k], destino[k], vagas[k]);
                            contConsulta++;
                            break;
                        }
                    }
                    if(contConsulta == 0)
                        System.out.println("nao tem voo com esse numero");
                    
                    break;
                    case 2:
                    scan.nextLine();
                    System.out.println("Insira nome de origem do voo");
                    qOrigem = scan.nextLine();
        
                    for(int k = 0; k<12; k++){
                        if(qOrigem.equals(origem[k])){
                            System.out.printf("NUMERO: %d ORIGEM: %s DESTINO:%s VAGAS:%d", num[k], origem[k], destino[k], vagas[k]);
                            contConsulta++;
                            break;
                        }
                    }
                    if(contConsulta == 0)
                        System.out.println("nao tem voo com essa origem");

                    break;
                    case 3:
                    scan.nextLine();
                    System.out.println("Insira nome de destino do voo");
                    qDestino = scan.nextLine();
        
                    for(int k = 0; k<12; k++){
                        if(qDestino.equals(destino[k])){
                            System.out.printf("NUMERO: %d ORIGEM: %s DESTINO:%s VAGAS:%d", num[k], origem[k], destino[k], vagas[k]);
                            contConsulta++;
                            break;
                        }
                    }
                    if(contConsulta == 0)
                        System.out.println("nao tem voo com essa origem");

                    break;
                }

                break;
                case 2:
                contConsulta = 0;
                    System.out.println("Insira o numero do voo");
                    consulta = scan.nextInt();

                    for(int l = 0; l<12; l++){
                        if(num[l] == consulta && vagas[l] != 0){
                            contConsulta++;
                            System.out.println("reserva confirmada");
                            vagas[l] = 0;
                        } else if(num[l] == consulta && vagas[l] == 0){
                            System.out.println("Voo lotado");
                            contConsulta++;
                        }

                    }
                    if(contConsulta == 0)
                    System.out.println("Voo inexistente");

                break;
                case 3:
                return;


            }
            }

    }
    public static void ex5(Scanner scan){

        
        // for(int j = 0; j<2; j++){
        //     System.out.printf("Numero: %d ORIGEM: %s DESTINO:%s", num[j], origem[j], destino[j]);
        //     System.out.println();
        // }

    }
    public static void ex6(Scanner scan){

    }
    public static void ex7(Scanner scan){

    }
    public static void ex8(Scanner scan){

    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int op = 999;

        while(op !=0){
            System.out.print("Insira opcao:");
            op = scan.nextInt();

            switch (op) {
                case 1:
                ex1(scan);
                break;
                case 2:
                ex2(scan);
                break;
                case 3:
                ex3(scan);
                break;
                case 4:
                ex4(scan);
                break;
                case 5:
                ex5(scan);
                break;
                case 6:
                ex6(scan);
                break;
                case 7:
                ex7(scan);
                break;
                case 8:
                ex8(scan);
                break;
            
                default:
                    break;
            }

        }













        scan.close();

    }
}
