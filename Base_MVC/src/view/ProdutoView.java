package view;

import model.Produto;

public class ProdutoView {

	public void printProdutoDetails (Produto produto) {

		System.out.println("\t :: PRODUTO ::");
		System.out.println("ID Produto: " + produto.getId_produto());
		System.out.println("Nome Produto: " + produto.getNome_produto());
		System.out.println("Descrição: " + produto.getDescricao());
		System.out.println("Preço: R$" + produto.getPreco());

	}
}
