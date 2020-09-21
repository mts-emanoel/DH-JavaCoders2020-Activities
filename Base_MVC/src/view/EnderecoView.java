package view;

import model.Endereco;

public class EnderecoView {

	public void printEnderecoDetails (Endereco endereco) {
		System.out.println("\t :: ENDEREÇO :: ");
		System.out.println("Rua: " + endereco.getRua());
		System.out.println("Numero: " + endereco.getNumero());
		System.out.println("Complemento: " + endereco.getComplemento());
		System.out.println("Bairro: " + endereco.getBairro());
		System.out.println("Cidade: " + endereco.getCidade());
		System.out.println("Estado: " + endereco.getEstado());
	}

}
