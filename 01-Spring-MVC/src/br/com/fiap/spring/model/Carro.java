package br.com.fiap.spring.model;

public class Carro {

	private String placa;
	
	private double preco;
	
	private boolean automatico;
	
	private String marca;

	public Carro(String placa, double preco, boolean automatico, String marca) {
		super();
		this.placa = placa;
		this.preco = preco;
		this.automatico = automatico;
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isAutomatico() {
		return automatico;
	}

	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
