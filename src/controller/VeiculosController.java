package controller;

import java.util.List;

import dao.VeiculosDao;
import model.Veiculos;

public class VeiculosController {
	
	public void salvar(Veiculos veiculos) throws Exception {
		
		if (!validarModelo(veiculos.getModelo())) {
			throw new Exception("Alert: Modelo inválido.");
		}
		
		if (!validarPlaca(veiculos.getPlaca())) {
			throw new Exception("Alert: Placa inválida.");
		}
		
		if (!validarConsumo(veiculos.getKmLitros())) {
			throw new Exception("Alert: Consumo inválido");
		}		
		VeiculosDao.getInstance().salvar(veiculos);
		
	}
	
	public void atualizar(Veiculos veiculos) throws Exception {
		
		if (!validarModelo(veiculos.getModelo())) {
			throw new Exception ("Alert: Modelo inválido.");
		}
		
		if (!validarPlaca(veiculos.getPlaca())) {
			throw new Exception ("Alert: Placa inválida.");
		}
		
		if (!validarConsumo(veiculos.getKmLitros())) {
			throw new Exception ("Alert: Consumo inválido");
		}
		
		VeiculosDao.getInstance().atualizar(veiculos);
		
	}
	
	public void del(int id) throws Exception {
		
		if (id == 0) {
			throw new Exception ("Alert: Id inválido.");
		}
		
		VeiculosDao.getInstance().del(id);
		
	}
	
	public List<Veiculos> list() throws Exception{
		
		List<Veiculos> veiculos = VeiculosDao.getInstance().listar();
		
		if (veiculos.isEmpty()) {
			throw new Exception ("Alert: Não existem veículos cadastrados.");
		} 
		else {
			
			return veiculos;
		}
		
	}
	
	public Veiculos listById(int id) {
		return VeiculosDao.getInstance().listById(id);
	}
	
	private boolean validarModelo(String modelo) {
		if (modelo == null || modelo.length() < 2) {
			return false;
		}
		else {
			return true;
		}
	}
	
	private boolean validarPlaca(String placa) {
		if (placa == null || placa.length() < 7) {
			return false;
		}
		else {
			return true;
		}
	}
	
	private boolean validarConsumo(Double consumo) {
		if (consumo < 1.00 || consumo > 50) {
			return false;
		}else {
			return true;
		}
	}

}
