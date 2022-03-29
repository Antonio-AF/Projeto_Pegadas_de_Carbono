package model;

public class Veiculos {
	
	private  int id;
	private String modelo;
	private String placa;
	private boolean livre;
	private Double kmLitros;
	
	public Veiculos (String modelo, String placa, Double kmLitros) {
		this.modelo = modelo;
		this.placa = placa;
		this.kmLitros = kmLitros;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public boolean isLivre() {
		return livre;
	}
	
	public void setLivre(boolean livre) {
		this.livre = livre;
	}	
	
	public void setKmLitros(double kmLitros) {
		this.kmLitros = kmLitros;
	}

	public double getKmLitros() {	
		return kmLitros;
	}
	
}
