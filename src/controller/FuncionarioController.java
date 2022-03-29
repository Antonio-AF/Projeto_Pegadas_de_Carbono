package controller;

import java.util.List;

import dao.FuncionarioDao;
import model.Funcionario;

public class FuncionarioController {
	
	public void salver(Funcionario funcionario) throws Exception {
		if (funcionario.getNome() == null || funcionario.getNome().length() < 3) {
			throw new Exception(" Funcionario Invalido");
		}
		
		FuncionarioDao.getInstance().salvar(funcionario);	
		
	}
	
	public void atualizar(Funcionario funcionario) throws Exception {
		
		if (funcionario.getNome() == null || funcionario.getNome().length() < 3) {
			throw new Exception("Funcionario Invalido");
		}
		FuncionarioDao.getInstance().atualizar(funcionario);
	}
	
	public void excluir(int idFuncionario) throws Exception {
		if (idFuncionario == 0) {
			throw new Exception();
		}
		FuncionarioDao.getInstance().del(idFuncionario);
		
	}
	
	public List<Funcionario> listar(){
		return FuncionarioDao.getInstance().listar();
	}

}
