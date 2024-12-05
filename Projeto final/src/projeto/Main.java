package projeto;

import java.util.Scanner;

public class Main {
    static funcionario x1 = new pizzaiolo();
    static funcionario x2 = new garçom();
    static funcionario x3 = new caixa();

    static funcionario x4 = new gerente();
    static Scanner s = new Scanner(System.in);
    static float valorCaixa = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            System.out.println("Bem vindo a nossa plataforma. ");
            System.out.println("Oque deseja realizar?");
            System.out.println("1 - cadastrar um novo funcionario");
            System.out.println("2 - fazer pedido");
            System.out.println("3 - acertar pedido");
            System.out.println("4 - sair do programa");

            int o = s.nextInt();
            switch (o) {
                case 1:
                    System.out.println("Qual tipo de funcionario deseja cadastrar?");
                    System.out.println("1 - pizzaiolo");
                    System.out.println("2 - garçom");
                    System.out.println("3 - caixa");
                    System.out.println("4 - gerente");
                    int op = s.nextInt();

                    switch (op) {
                        case 1:


                            s.nextLine();

                            System.out.println("Insira o nome");
                            x1.nome = s.nextLine();
                            System.out.println("insira a idade");
                            x1.idade = s.nextInt();
                            System.out.println("insira o id do funcionario");
                            x1.idFunc = s.nextInt();
                            System.out.println("insira e o salario do funcionario");
                            x1.salario = s.nextFloat();
                            break;
                        case 2:


                            s.nextLine();

                            System.out.println("Insira o nome");
                            x2.nome = s.nextLine();
                            System.out.println("insira a idade");
                            x2.idade = s.nextInt();
                            System.out.println("insira o id do funcionario");
                            x2.idFunc = s.nextInt();
                            System.out.println("insira e o salario do funcionario");
                            x2.salario = s.nextFloat();
                            break;
                        case 3:


                            s.nextLine();

                            System.out.println("Insira o nome");
                            x3.nome = s.nextLine();
                            System.out.println("insira a idade");
                            x3.idade = s.nextInt();
                            System.out.println("insira o id do funcionario");
                            x3.idFunc = s.nextInt();
                            System.out.println("insira e o salario do funcionario");
                            x3.salario = s.nextFloat();
                            break;

                        case 4:


                            s.nextLine();

                            System.out.println("Insira o nome");
                            x4.nome = s.nextLine();
                            System.out.println("insira a idade");
                            x4.idade = s.nextInt();
                            System.out.println("insira o id do funcionario");
                            x4.idFunc = s.nextInt();
                            System.out.println("insira e o salario do funcionario");
                            x4.salario = s.nextFloat();
                            break;

                        default:
                            System.out
                                    .println("Escolha indefinida ou fora dos parametros, será redirecionado ao menu.");
                            i--;

                    }

                    i--;
                    break;
                case 2:
                    i--;

                    System.out.println("Qual o seu cargo?");
                    System.out.println("1 - pizzaiolo");
                    System.out.println("2 - garçom");
                    System.out.println("3 - caixa");
                    System.out.println("4 - gerente");
                    int op2 = s.nextInt();

                    switch (op2) {

                        case 1:
                            System.out.println("Digite o numero de identificação");
                            int op3 = s.nextInt();

                            if(op3 == x1.idFunc){
                                x1.gerarPedido();
                            }else{
                                System.out.println("identificação invalida");
                            }
                            break;
                        case 2:
                            System.out.println("Digite o numero de identificação");
                            int op4 = s.nextInt();

                            if(op4 == x2.idFunc){
                                x2.gerarPedido();
                            }else{
                                System.out.println("identificação invalida");
                            }
                            break;
                        case 3:
                            System.out.println("Digite o numero de identificação");
                            int op5 = s.nextInt();

                            if(op5 == x3.idFunc){
                                x3.gerarPedido();
                            }else{
                                System.out.println("identificação invalida");
                            }
                            break;
                        case 4:
                            System.out.println("Digite o numero de identificação");
                            int op6 = s.nextInt();

                            if(op6 == x4.idFunc){
                                x4.gerarPedido();
                            }else{
                                System.out.println("identificação invalida");
                            }
                        default:
                            System.out.println("invalido, será redirecionado para a tela inicial");
                            i--;
                            break;

                    }
                    break;
                case 3:
                    i--;
                    System.out.println("Qual o seu cargo?");
                    System.out.println("1 - caixa");
                    System.out.println("2 - gerente");
                    int op7 = s.nextInt();

                    switch (op7) {
                        case 1:
                            System.out.println("Digite o numero de identificação");
                            int op8 = s.nextInt();

                            if (op8 == x3.idFunc) {
                                x3.acertarPedido();
                            } else {
                                System.out.println("identificação invalida");
                            }
                            break;
                        case 2:
                            System.out.println("Digite o numero de identificação");
                            int op9 = s.nextInt();

                            if (op9 == x4.idFunc) {
                                x4.acertarPedido();
                            } else {
                                System.out.println("identificação invalida");
                            }
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Aplicação encerrada...");
                    break;
                default:
                    System.out.println("Escolha indevida...");
                    i--;
            }
        }
    }
}