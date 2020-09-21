package view;

import model.Telefone;

public class TelefoneView {

	public void printTelefoneDetails (Telefone telefone) {
		System.out.println("\t :: TELEFONE :: ");
		System.out.println("("+telefone.getDdd()+") "+telefone.getNumero());
	}

}
