import java.time.LocalDate;

import controller.ClienteController;
import controller.EnderecoController;
import controller.TelefoneController;
import model.Cliente;
import model.Endereco;
import model.Telefone;
import view.ClienteView;
import view.EnderecoView;
import view.TelefoneView;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		ClienteController clienteController = new ClienteController(new Cliente(), new ClienteView());
		clienteController.setClienteNome("Matheus Emanoel Rodrigues De Albuquerque");
		clienteController.setClienteRg("8630700000");
		clienteController.setClienteCpf("971.017.100-34");
		clienteController.setClienteNascimento(LocalDate.of(2000, 02, 28));
		clienteController.setClienteEmail("lab.emanoel@gmail.com");

		EnderecoController enderecoController = new EnderecoController(new Endereco(cliente), new EnderecoView());
		enderecoController.setEnderecoRua("Passagem Nova");
		enderecoController.setEnderecoNumero(43);
		enderecoController.setEnderecoBairro("Montese");
		enderecoController.setEnderecoCidade("Belém");
		enderecoController.setEnderecoEstado("PA");

		TelefoneController telefoneController = new TelefoneController(new Telefone(cliente), new TelefoneView());
		telefoneController.setTelefoneDdd("91");
		telefoneController.setTelefoneNumero("98315-6021");

		clienteController.updateView();
		enderecoController.updateView();
		telefoneController.updateView();

	}
}
