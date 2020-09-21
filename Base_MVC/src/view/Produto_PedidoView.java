package view;

import model.Produto_Pedido;

public class Produto_PedidoView {

	public void printPedidoDetails (Produto_Pedido produto_pedido) {
		System.out.println("\t :: PRODUTO_PEDIDO :: ");
		System.out.println("FK Pedido: " + produto_pedido.getFk_pedido());
		System.out.println("FK Produto: " + produto_pedido.getFk_produto());
		System.out.println("Quantidade produto: " + produto_pedido.getQuantidade_produto());
	}

}
