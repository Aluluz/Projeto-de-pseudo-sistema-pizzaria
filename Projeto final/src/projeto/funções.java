package projeto;

import java.util.Scanner;

import static projeto.Main.*;

public interface funções {
    Scanner s = new Scanner(System.in);


    default void acertarPedido() {

        System.out.println("insira o numero do pedido para ser dada a baixa.");
        int op = s.nextInt();
        if (pedido.numPedido == op) {
            Main.valorCaixa = Main.valorCaixa + pedido.valor;
            System.out.println("Caixa atualiuzado...");
            System.out.println("novo valor em caixa de: "+valorCaixa);
        }
    }

    default void gerarPedido() {
        pedido p = new pedido();

        System.out.println("Insira sucessivamente o pedido,numero do pedido, quantidade e valor");

        p.nomePedido = s.nextLine();
        p.numPedido = s.nextInt();
        p.quantidade = s.nextInt();
        p.valor = s.nextFloat();

        p = null;
    }
}
