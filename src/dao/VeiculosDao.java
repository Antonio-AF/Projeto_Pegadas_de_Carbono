package dao;

import java.util.ArrayList;
import java.util.List;

import model.Veiculos;

public class VeiculosDao {
	
	private static VeiculosDao instance;
	private List<Veiculos> auto = new ArrayList<>();
	
	public static VeiculosDao getInstance() {
		if (instance == null) {
			instance = new VeiculosDao();
			
		}
		return instance;
	}
	
	public void salvar(Veiculos veiculos) {
		auto.add(veiculos);
	}
	
	public void atualizar(Veiculos veiculos) {
		auto.set(veiculos.getId() - 1, veiculos);
	}
	
	public void habilitarAuto(Veiculos veiculos) {
		veiculos.setLivre(true);
		auto.set(veiculos.getId() - 1, veiculos);
	}
	
	public void desabilitarAuto(Veiculos veiculos) {
		veiculos.setLivre(false);
		auto.set(veiculos.getId() - 1, veiculos);
	}
	
	public void del(int id) {
		auto.remove(id - 1);
	}
	
	public List<Veiculos> listar(){
		return auto;
	}
	
	public Veiculos listById(int id) {
		return auto.get(id - 1);
	}

}
