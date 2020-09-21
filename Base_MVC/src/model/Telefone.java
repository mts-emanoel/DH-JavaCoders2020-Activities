package model;

public class Telefone {

	private String ddd;
	private String numero;

	private Cliente cliente;
	final private int fk_cliente;

	public Telefone(Cliente cliente){
		this.cliente = cliente;
		this.fk_cliente = cliente.getIdCliente();
	}

	public Telefone(String ddd, String numero, Cliente cliente) {
		this.ddd = ddd;
		this.numero = numero;
		this.cliente = cliente;
		this.cliente = cliente;
		this.fk_cliente = cliente.getIdCliente();
	}

	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getFk_cliente() {
		return fk_cliente;
	}


}
