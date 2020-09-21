package view;

import model.Pedido;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PedidoView {
	public void printPedidoDetails (Pedido pedido) {
		System.out.println("Pedido: ");
		System.out.println("NFE: " + pedido.getNfe());
		System.out.println("Data de Emissão: " + pedido.getData_emissao().format(DateTimeFormatter.ofPattern("dd/MM/uuuu")));
		System.out.println("Valor Total: R$ " + pedido.getValor_total());
		System.out.println("Status do Pedido: " + pedido.getStatus_pedido());
	}

}
