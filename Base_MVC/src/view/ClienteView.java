package view;

import model.Cliente;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ClienteView {

	public void printClienteDetails (Cliente cliente) {
		System.out.println("\t :: CLIENTE :: ");
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Nascimento: " + cliente.getNascimento().format(DateTimeFormatter.ofPattern("dd/MM/uuuu")));
		System.out.println("CPF: " + cliente.getCpf());
		System.out.println("RG: " + cliente.getRg());
		System.out.println("E-mail: " + cliente.getEmail());
	}

}
