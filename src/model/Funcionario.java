package model;

public class Funcionario {
	
	private int id;
	private String nome;
	private boolean cnh;
	
	public Funcionario(String nome) {
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean isCnh() {
		return cnh;
	}
	
	public void setCnh(boolean cnh) {
		this.cnh = cnh;
	}
	

}
