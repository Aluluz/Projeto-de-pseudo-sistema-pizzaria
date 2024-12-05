package projeto;

import java.util.Scanner;
public abstract class funcionario implements funções{

    Scanner s = new Scanner(System.in);

    String nome;
    int idade;
    int idFunc;

    float salario;
    static boolean acessoCaixa;


    @Override
    public void gerarPedido() {
        funções.super.gerarPedido();
    }

    @Override
    public void acertarPedido() {
        funções.super.acertarPedido();
    }
}
