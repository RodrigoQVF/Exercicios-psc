import java.util.*;
public class App {



    public static void ex1(Scanner scan){
        int agenda[][] = new int[30][2];
        String compromisso[] = new String[30];
        int dia, hora;
        String compr;
        int op = 999, cont = 0;

        while(op != 0){
            System.out.println();
            System.out.println("1 - Adicionar um agendamento");
            System.out.println("2 - Mostrar agendamento");
            System.out.println("0 - Sair");
            System.out.println("Insira opcao:");
            op = scan.nextInt();

            switch (op) {
                    case 1:
                    System.out.println("Insira o dia");
                    dia = scan.nextInt();
                    System.out.println("Insira hora");
                    hora = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Insira compromisso");
                    compr = scan.nextLine();

                    compromisso[dia] = compr;
                    agenda[dia][0] = dia;
                    agenda[dia][1] = hora;
                    cont++;
                    break;
                    case 2:
                    if(cont == 0){
                        System.out.println("Nenhum agendamento feito.");
                        break;
                    }
                    System.out.println("Insira o dia");
                    dia = scan.nextInt();
                    System.out.println("Insira hora");
                    hora = scan.nextInt();

                    if(agenda[dia][1] == 0){
                        System.out.println("Nao tem agenda armazenada nesse dia / horário");
                        break;
                    }
                    System.out.printf("Compromisso da data %d da hora %d: %s", dia, hora, compromisso[dia]);
                    System.out.println();
                    break;
                    case 0:
                    System.out.println("saindo..");
                    break;
            
                default:
                System.out.println("opcao invalida");
                    break;
            }
            
        }



        
    }
    public static void ex2(Scanner scan){
        int m[][] = new int[3][3];
        int somaLinhas[] =  new int[8];
        int k = 0, l = 2;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                m[i][j] = scan.nextInt();
                somaLinhas[i] += m[i][j];
            }   
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                somaLinhas[i + 3] += m[j][i];
            }   
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i == j)
                somaLinhas[6] += m[i][j];

                if(i == k && j == l){
                    somaLinhas[7] += m[i][j];
                    k++;
                    l--;
                }
            }   
        }

        for(int i = 0; i < somaLinhas.length - 1; i++){
            if(somaLinhas[7] != somaLinhas[i]){
                System.out.println("a Matriz nao é um quadrado magico");
                return;
            }
        }
        System.out.println("A matriz é um quadrado magico");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(m[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    public static void ex3(Scanner scan){
        int jogo[][] = new int[3][3];
        int jogadal, jogadac, cont = 0, contLinhas = 0, contColunas = 0, contDiagonalP = 0, contDiagonalS = 0, compL = 0, compC = 2;
        int contLinhasO = 0, contColunasO = 0, contDiagonalPO = 0, contDiagonalSO = 0, compLO = 0, compCO = 2;
        boolean ganhou = false;

        System.out.println("|1 1 | 1 2 | 1 3 |");
        System.out.println("|____|_____|_____|");
        System.out.println("|2 1 | 2 2 | 2 3 |");
        System.out.println("|____|_____|_____|");
        System.out.println("|3 1 | 3 2 | 3 3 |");
        System.out.println("OS NUMEROS SAO AS POSICOES QUE VOCE DESEJA JOGAR");
        System.out.println();
        while(ganhou == false){
            if(cont % 2 == 0){

                do{
                    System.out.println("Escolha a jogada jogador 'X'");
                    jogadal = scan.nextInt();
                    jogadac = scan.nextInt();
                }while(jogo[jogadal - 1][jogadac - 1] == 2 || jogadal >= 4 || jogadac >= 4 || jogadal <= 0 ||jogadac <= 0);

            jogo[jogadal - 1][jogadac - 1] = 1;

            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    if(jogo[i][j] == 1){
                        System.out.printf("| X |", jogo[i][j]);
                    }else if(jogo[i][j] == 2){
                        System.out.printf("| O |", jogo[i][j]);
                    }else{
                        System.out.print("|   |");
                    }
                }
                System.out.println();
            }

            }else{

                do{
                    System.out.println("Escolha a jogada jogador 'O'");
                    jogadal = scan.nextInt();
                    jogadac = scan.nextInt();
                }while(jogo[jogadal - 1][jogadac - 1] == 1 || jogadal >= 4 || jogadac >= 4 || jogadal <= 0 ||jogadac <= 0);

                jogo[jogadal - 1][jogadac - 1] = 2;
                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 3; j++){
                        if(jogo[i][j] == 1){
                            System.out.printf("| X |", jogo[i][j]);
                        }else if(jogo[i][j] == 2){
                            System.out.printf("| O |", jogo[i][j]);
                        }else{
                            System.out.print("|   |");
                        }
                    }
                    System.out.println();
                }
            }
            
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){

                    if(jogo[i][j] == 1){
                        contLinhas++;
                    }
                    if(jogo[j][i] == 1){
                        contColunas++;
                    }

                    if(i == j && jogo[i][j] == 1){
                        contDiagonalP++;
                    }

                    if(compL == i && compC == j && jogo[i][j] == 1){
                        contDiagonalS++;
                        compL++;
                        compC--;
                    }

                    if(contLinhas == 3 || contColunas == 3 || contDiagonalP == 3 || contDiagonalS == 3){
                        ganhou = true;
                        System.out.println("Jogador X ganhou!");
                        return;

                    }
                }
                contLinhas = 0;
                contColunas = 0;
            }

            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){

                    if(jogo[i][j] == 2){
                        contLinhasO++;
                    }
                    if(jogo[j][i] == 2){
                        contColunasO++;
                    }

                    if(i == j && jogo[i][j] == 2){
                        contDiagonalPO++;
                    }

                    if(compL == i && compC == j && jogo[i][j] == 2){
                        contDiagonalSO++;
                        compLO++;
                        compCO--;
                    }

                    if(contLinhasO == 3 || contColunasO == 3 || contDiagonalPO == 3 || contDiagonalSO == 3){
                        ganhou = true;
                        System.out.println("Jogador O ganhou!");
                        return;

                    }
                }
                contLinhasO = 0;
                contColunasO = 0;
            }
            contDiagonalP = 0;
            contDiagonalS = 0;
            compL = 0;
            compC = 2;
            contDiagonalPO = 0;
            contDiagonalSO = 0;
            compLO = 0;
            compCO = 2;
            cont++;
        }
    }
    public static void ex4(Scanner scan){
        float m[][] = new float[4][4];
        float mT[][] = new float[4][4];
        int contL = 0, contC = 3;

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                m[i][j] = scan.nextFloat();
            }
        }
        
        System.out.println("Valores da diagonal principal");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == j)
                    System.out.println(m[i][j]);
            }

        }
        System.out.println();
        System.out.println("Valores da diagonal secundaria");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == contL && j == contC){
                    System.out.println(m[i][j]);
                    contL++;
                    contC--;
                }
            }

        }

        System.out.println("Matriz transporta");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                mT[i][j] = m[j][i];
                System.out.print(mT[i][j] + " ");
            }
            System.out.println();

        }

    }
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int op = 999;

        while(op != 0){
            System.out.println();
            System.out.println("1 - ex1");
            System.out.println("2 - ex2");
            System.out.println("3 - ex3");
            System.out.println("4 - ex4");
            System.out.println("0 - sair");
            System.out.println("Insira opcao:");
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
                    case 0:
                    System.out.println("saindo..");
                    break;
            
                default:
                System.out.println("opcao invalida");
                    break;
            }
            
        }











        scan.close();
    }
}
