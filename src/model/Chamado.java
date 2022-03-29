package model;

import java.time.LocalDateTime;

public class Chamado {
	
	private int id;
	private LocalDateTime inicioChamado;
	private LocalDateTime fimChamado;
	private String endereco;
	private double distancia;
	private double emissaoCarbono;
	private Funcionario funcionario;
	private Veiculos veiculos;
	
	public Chamado(LocalDateTime inicioChamado, String endereco, double distancia, Funcionario funcionario, Veiculos veiculos) {
		this.inicioChamado = inicioChamado;
		this.endereco = endereco;
		this.distancia = distancia;
		this.funcionario = funcionario;
		this.veiculos = veiculos;
		calcularEmissaoCarbono();
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public LocalDateTime getInicioChamado() {
		return inicioChamado;
	}
	
	public void setInicioChamado(LocalDateTime inicioChamado) {
		this.inicioChamado = inicioChamado;
	}
	
	public LocalDateTime getFimChamado() {
		return fimChamado;		
	}
	
	public void setFimChamado(LocalDateTime fimChamado) {
		this.fimChamado  = fimChamado;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public double getDistancia() {
		return distancia;
	}
	
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	public double getEmissaoCarbono() {
		return emissaoCarbono;
	}
	
	public void setEmissaoCarbono(double emissaoCarbono) {
		this.emissaoCarbono = emissaoCarbono;
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public Veiculos getVeiculos() {
		return veiculos;
	}
	
	public void setVeiculos(Veiculos veiculos) {
		this.veiculos = veiculos;
	}
	
	public void calcularEmissaoCarbono() {
		
		double percGasolinaLitro = 0.82; // Percentual de Gasolina em 1 Litro.
		double densGasolina = 0.75; //Densidade da Gasolina.
		double transGasolinaCo2 = 3.7; // Fator de transformação da Gasolina em CO2.
		
		double consumo = distancia / veiculos.getKmLitros();
		this.emissaoCarbono = consumo * percGasolinaLitro * densGasolina * transGasolinaCo2;
	}

}
