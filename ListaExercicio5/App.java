import java.util.*;

public class App {
        /**
     * @author Rodrigo Queiroz Vieira Freire
     *         Lista de exercício 5
     */
    public static void Ex1(Scanner scan) {
        int idade, sumIdade = 0, cont = 0;
        float media;
        idade = 999;

        while (idade != 0) {
            System.out.print("Insira idade:");
            idade = scan.nextInt();
            sumIdade += idade;
            cont++;
        }
        cont--;
        if (cont == 0) {
            System.out.println("Nenhuma idade lida");
            return;
        }
        media = sumIdade / cont;

        System.out.printf("A media das idades é:%.2f", media);

    }

    public static void Ex2(Scanner scan) {
        int canal = 999, p4 = 0, p5 = 0, p7 = 0, p12 = 0, ptotal = 0, ligatv, p4t = 0, p5t = 0, p7t = 0, p12t = 0;
        float porcentagem;
        boolean isLigada = true;
        System.out.println("Ligar Tv?(1 = sim / 0 = nao)");
        ligatv = scan.nextInt();

        if (ligatv == 1) {
            System.out.println("Ligando tv...");
            isLigada = true;
        } else if (ligatv == 0) {
            System.out.println("desligando tv...");
            isLigada = false;
        }

        while (canal != 0) {
            System.out.println("4 - Canal 4");
            System.out.println("5 - Canal 5");
            System.out.println("7 - Canal 7");
            System.out.println("12 - Canal 12");
            System.out.println("0 - Sair");
            System.out.println("Insira canal para entrar");
            canal = scan.nextInt();

            switch (canal) {
                case 4:
                    if (isLigada == false) {
                        System.out.println("Tv esta desligada, deseja ligar?(1 = sim / 0 = nao)");
                        ligatv = scan.nextInt();

                        if (ligatv == 1)
                            isLigada = true;

                        break;
                    }
                    System.out.println("Quantas pessoas assistindo o canal 4");
                    p4 = scan.nextInt();
                    p4t += p4;
                    ptotal += p4;

                    break;
                case 5:
                    if (isLigada == false) {
                        System.out.println("Tv esta desligada, deseja ligar?(1 = sim / 0 = nao)");
                        ligatv = scan.nextInt();

                        if (ligatv == 1)
                            isLigada = true;
                        break;
                    }
                    System.out.println("Quantas pessoas assistindo o canal 5");
                    p5 = scan.nextInt();
                    ptotal += p5;
                    p5t += p5;
                    break;
                case 7:
                    if (isLigada == false) {
                        System.out.println("Tv esta desligada, deseja ligar?(1 = sim / 0 = nao)");
                        ligatv = scan.nextInt();

                        if (ligatv == 1)
                            isLigada = true;
                        break;
                    }
                    System.out.println("Quantas pessoas assistindo o canal 7");
                    p7 = scan.nextInt();
                    ptotal += p7;
                    p7t += p7;
                    break;
                case 12:
                    if (isLigada == false) {
                        System.out.println("Tv esta desligada, deseja ligar?(1 = sim / 0 = nao)");
                        ligatv = scan.nextInt();

                        if (ligatv == 1)
                            isLigada = true;
                        break;

                    }

                    System.out.println("Quantas pessoas assistindo o canal 12");
                    p12 = scan.nextInt();
                    ptotal += p12;
                    p12t += p12;
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Canal nao existe");
                    break;
            }

        }

        porcentagem = (float) p4t / ptotal;
        System.out.printf("Porcentagem canal 4: %.2f %%\n", (porcentagem * 100));
        porcentagem = (float) p5t / ptotal;
        System.out.printf("Porcentagem canal 5: %.2f %%\n", (porcentagem * 100));
        porcentagem = (float) p7t / ptotal;
        System.out.printf("Porcentagem canal 7: %.2f %%\n", (porcentagem * 100));
        porcentagem = (float) p12t / ptotal;
        System.out.printf("Porcentagem canal 12: %.2f %%\n", (porcentagem * 100));

    }

    public static void Ex3(Scanner scan) {
        int op = 999;
        float mediaA, mediaP, nota1, nota2, nota3, p1, p2, p3;

        while (op != 3) {
            System.out.println("1 - media aritmetica");
            System.out.println("2 - media ponderada");
            System.out.println("3 - sair");
            System.out.println("Insira a opcao:");
            op = scan.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Insira nota 1");
                    nota1 = scan.nextFloat();
                    System.out.println("Insira nota 2");
                    nota2 = scan.nextFloat();

                    mediaA = (nota1 + nota2) / 2;
                    System.out.printf("A media é: %.2f\n", mediaA);
                    break;
                case 2:
                    System.out.println("Insira nota 1");
                    nota1 = scan.nextFloat();
                    System.out.println("Insira peso da nota 1");
                    p1 = scan.nextFloat();
                    System.out.println("Insira nota 2");
                    nota2 = scan.nextFloat();
                    System.out.println("Insira peso da nota 2");
                    p2 = scan.nextFloat();
                    System.out.println("Insira nota 3");
                    nota3 = scan.nextFloat();
                    System.out.println("Insira peso da nota 3");
                    p3 = scan.nextFloat();

                    mediaP = ((nota1 * p1) + (nota2 * p2) + (nota3 * p3)) / (p1 + p2 + p3);

                    System.out.printf("A media ponderada é: %.2f\n", mediaP);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;

            }

        }
    }

    public static void Ex4(Scanner scan) {
        int cont = 0, idade, quantP = 0, sIdade = 0, p1030 = 0, pAlturaMaior = 0;
        float peso, altura, mediaIdade, porcentP;

        while (cont != 10) {
            System.out.println("Insira idade");
            idade = scan.nextInt();
            System.out.println("Insira peso");
            peso = scan.nextFloat();
            System.out.println("Insira altura");
            altura = scan.nextFloat();
            sIdade += idade;

            if (peso > 90 && altura < 1.50) {
                quantP++;
            }
            if (idade >= 10 && idade <= 30) {
                p1030++;
            }
            if (idade >= 10 && idade <= 30 && altura > 1.90) {
                pAlturaMaior++;

            }

            cont++;
        }
        mediaIdade = sIdade / 10;
        porcentP = (pAlturaMaior / p1030) * 100;
        System.out.printf("Media das idades: %.2f\n", mediaIdade);
        System.out.printf("Pessoas com peso > 90kg e altura < 1.50m: %d\n", quantP);
        System.out.printf("Porcentagem pessoas com idade entre 10 e 30 anos entre altura > 1.90m %.2f\n", porcentP);
    }

    public static void Ex5(Scanner scan) {
        char sexo, op;
        int cont = 0, contHomem = 0, contSM = 0, contSF = 0, contS = 0;
        float porcentagem;

        while (cont != 10) {
            System.out.println("qual o sexo(M - masculino / F - feminino)");
            sexo = scan.next().charAt(0);
            while (sexo != 'M' && sexo != 'F') {
                System.out.println("Sexo invalido, insira novamente");
                sexo = scan.next().charAt(0);
            }
            if (sexo == 'M') {
                contHomem++;
                System.out.println("Gostou?(S - sim / N - Nao)");
                op = scan.next().charAt(0);
                while (op != 'N' && op != 'S') {
                    System.out.println("opcao invalida, insira novamente");
                    op = scan.next().charAt(0);
                }
                if (op == 'S') {
                    contS++;
                    contSM++;
                }

            }
            if (sexo == 'F') {
                System.out.println("Gostou?(S - sim / N - Nao)");
                op = scan.next().charAt(0);
                while (op != 'N' && op != 'S') {
                    System.out.println("opcao invalida, insira novamente");
                    op = scan.next().charAt(0);
                }
                if (op == 'S') {
                    contS++;
                    contSF++;
                }

            }

            cont++;
        }

        porcentagem = ((contHomem - contSM) / (float) contHomem) * 100;

        System.out.println("Numero de pessoas que responderam sim " + contS);
        System.out.println("Numero de pessoas que responderam nao " + (10 - contS));
        System.out.println("Numero de mulheres que responderam sim " + contSF);
        System.out.printf("Porcentagem de homens que falaram nao %.2f %%", porcentagem);
        System.out.println();

    }

    public static void Ex6(Scanner scan) {
        int op = 999;
        float salario, imposto;

        while (op != 4) {
            System.out.println("1 - Imposto");
            System.out.println("2 - novo salario");
            System.out.println("3 - classificacao");
            System.out.println("4 - sair");
            System.out.println("Insira opcao");
            op = scan.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Insira salario");
                    salario = scan.nextFloat();
                    if (salario < 1400) {
                        imposto = salario * 0.05f;
                        System.out.printf("imposto sobre %.2f: %.2f\n", salario, imposto);
                    }
                    if (salario >= 1400 && salario <= 2500) {
                        imposto = salario * 0.10f;
                        System.out.printf("imposto sobre %.2f: %.2f\n", salario, imposto);
                    }
                    if (salario > 2500) {
                        imposto = salario * 0.15f;
                        System.out.printf("imposto sobre %.2f: %.2f\n", salario, imposto);
                    }
                    break;
                case 2:
                    System.out.println("Insira salario");
                    salario = scan.nextFloat();
                    if (salario < 1400)
                        System.out.println("salario novo " + (salario + 100));

                    if (salario >= 1400 && salario <= 2500)
                        System.out.println("salario novo " + (salario + 75));

                    if (salario >= 2500 && salario <= 5000)
                        System.out.println("salario novo " + (salario + 50));

                    if (salario > 5000)
                        System.out.println("salario novo " + (salario + 25));
                    break;
                case 3:
                    System.out.println("Insira salario");
                    salario = scan.nextFloat();

                    if (salario <= 1400) {
                        System.out.println("Mal remunerado");
                    } else {
                        System.out.println("Bem remunerado");
                    }
                    break;
                case 4:

                    break;

                default:
                    System.out.println("Opcao invalida");
                    break;
            }

        }

    }

    public static void Ex7(Scanner scan) {
        int quant = 0, nVeiculo, i = 0, sumVeiculo = 0;
        int nAcidente[] = new int[5], maiorAcidente = 0, menorAcidente = 0;
        float media;
        String cidade, cidadeMaior = "A", cidadeMenor = "A";
        scan.nextLine();
        while (quant != 5) {
            System.out.println("Insira nome da cidade");
            cidade = scan.nextLine();
            System.out.println("Insira numero de veiculos");
            nVeiculo = scan.nextInt();
            System.out.println("Insira numeros de acidentes");
            nAcidente[i] = scan.nextInt();
            sumVeiculo += nVeiculo;

            if (i == 0) {
                maiorAcidente = nAcidente[i];
                cidadeMaior = cidade;
            }

            if (i == 1) {
                if (maiorAcidente > nAcidente[i]) {
                    menorAcidente = nAcidente[i];
                    cidadeMenor = cidade;

                } else {
                    maiorAcidente = nAcidente[i];
                    menorAcidente = nAcidente[i - 1];
                    cidadeMenor = cidade;
                }
            }

            if (i != 0 || i != 1) {

                if (nAcidente[i] > maiorAcidente) {
                    maiorAcidente = nAcidente[i];
                    cidadeMaior = cidade;

                } else if (nAcidente[i] < menorAcidente) {
                    menorAcidente = nAcidente[i];
                    cidadeMenor = cidade;
                }
            }

            quant++;
            i++;
        }
        media = sumVeiculo / 5.0f;
        System.out.println("Maior numero de acidente " + maiorAcidente + " cidade: " + cidadeMaior);
        System.out.println("Menor numero acidente " + menorAcidente + " cidade: " + cidadeMenor);
        System.out.printf("Media dos veiculos das 5 cidades: %.2f\n", media);
    }

    public static void Ex8(Scanner scan) {
        int cont = 0, N, denominador = 1;
        float h, sum = 0;
        ;

        System.out.println("Insira numero N:");
        N = scan.nextInt();

        while (cont != N) {
            h = 1.0f / denominador;
            sum += h;

            cont++;
            denominador++;
        }

        System.out.printf("o somatorio é igual a : %.2f\n", sum);
    }

    public static void Ex9(Scanner scan) {
        int denominador = 1, numerador = 1000;
        float s, sum = 0;

        for (int i = 0; i < 50; i++) {
            if (denominador % 2 == 0) {
                s = - numerador / (float) denominador;
            } else {
                s = numerador / (float) denominador;
            }
            sum += s;
            denominador++;
            numerador -= 3;

        }
        System.out.printf("o somatorio é igual a : %.2f\n", sum);
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int op = 999;

        while (op != 0) {
            System.out.println();
            System.out.println("1 - Ex1");
            System.out.println("2 - Ex2");
            System.out.println("3 - Ex3");
            System.out.println("4 - Ex4");
            System.out.println("5 - Ex5");
            System.out.println("6 - Ex6");
            System.out.println("7 - Ex7");
            System.out.println("8 - Ex8");
            System.out.println("9 - Ex9");
            System.out.println("0 - Sair");
            System.out.println("insira sua opcao:");
            op = scan.nextInt();
            switch (op) {

                case 1:
                    Ex1(scan);
                    break;
                case 2:
                    Ex2(scan);
                    break;
                case 3:
                    Ex3(scan);
                    break;
                case 4:
                    Ex4(scan);
                    break;
                case 5:
                    Ex5(scan);
                    break;
                case 6:
                    Ex6(scan);
                    break;
                case 7:
                    Ex7(scan);
                    break;
                case 8:
                    Ex8(scan);
                    break;
                case 9:
                    Ex9(scan);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("opcao invalida");
                    break;
            }
        }

        scan.close();
    }
}
