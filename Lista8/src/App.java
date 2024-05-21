import java.util.*;


public class App {
    public static int identificaId(Scanner scan){
        System.out.println("Insira ID do funcionario");
        int id = scan.nextInt();
        return id;
    }
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<Empregado> empregado = new ArrayList<>();
        
        int op = 999;
        String nome;
        int idade;
        float salario;

        while(op != 7){
            System.out.println("""
                                1 - Criar novo empregado
                                2 - Promover empregado
                                3 - Aumentar salário do empregado
                                4 - Demitir empregado
                                5 - Fazer aniversário do empregado
                                6 - Mostrar detalhes dos empregados
                                7 - Sair
                                """);
            System.out.println("Insira a opcao:");
            op = scan.nextInt();
            scan.nextLine();
            switch (op) {
                case 1:
                System.out.println("Nome:");
                nome = scan.nextLine();
                System.out.println("Idade");
                idade = scan.nextInt();
                System.out.println("Salario:");
                salario = scan.nextFloat();
                empregado.add(new Empregado(nome, idade, salario));

                break;
                case 2:
                int idAtual = identificaId(scan);
                if(idAtual >= empregado.size()){
                    System.out.println("\nFuncionario nao existente\n");
                }else{
                    empregado.get(idAtual).promover();
                }
                
                break;
                case 3:
                idAtual = identificaId(scan);
                if(idAtual >= empregado.size()){
                    System.out.println("\nFuncionario nao existente\n");
                }else{
                    System.out.println("Insira a porcentagem do aumento");
                    float porcentagem = scan.nextFloat();
                    empregado.get(idAtual).aumentarSalario(porcentagem);
                }

                break;
                case 4:
                idAtual = identificaId(scan);
                if(idAtual >= empregado.size()){
                    System.out.println("\nFuncionario nao existente\n");
                }else{
                    System.out.println("1 - Justa causa");
                    System.out.println("2 - Decisão do empregador");
                    System.out.println("3 - Aposentadoria");
                    System.out.println("Insira opcao do tipo de demissao");
                    int opDemissao = scan.nextInt();
                    empregado.get(idAtual).demitir(opDemissao);
                    empregado.remove(idAtual);

                }
                break;
                case 5:
                idAtual = identificaId(scan);
                if(idAtual >= empregado.size()){
                    System.out.println("\nFuncionario nao existente\n");
                }else{
                    empregado.get(idAtual).fazerAniversario(); 
                }
                
                break;
                case 6:
                int i = 0;
                for(Empregado mostraEmpregados : empregado){
                    System.out.println("Id: " + i);
                    System.out.println(mostraEmpregados.toString());
                    i++;
                }
            
                break;
                case 7:
                System.out.println("saindo");
                break;
            
                default:
                System.out.println("Opcao invalida");
                break;
            }

        }
        
        scan.close();
    }
}
