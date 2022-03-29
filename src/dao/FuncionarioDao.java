package dao;

import java.util.ArrayList;
import java.util.List;

import model.Funcionario;

public class FuncionarioDao {
	
	
	private static FuncionarioDao instance;
	private List<Funcionario> funcionarios = new ArrayList<>();
	
	public static FuncionarioDao getInstance() {
		if (instance == null) {
			
			instance = new FuncionarioDao();
			
		}
		return instance;
	}
	
	public void salvar(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public void atualizar(Funcionario funcionario) {
		funcionarios.set(funcionario.getId() - 1, funcionario);
	}
	
	public void del(int id) {
		funcionarios.remove(id -1);
	}
	
	public List<Funcionario> listar(){
		return funcionarios;
	}
	
	public Funcionario listByid(int id) {
		return funcionarios.get(id - 1);
	}

}
