package projeto;

import java.util.Scanner;

public class caixa extends funcionario implements funções {
    Scanner s = new Scanner(System.in);

    String nome;
    int idade;
    int idFunc;

    float salario;
    static boolean acessoCaixa = true;
}
