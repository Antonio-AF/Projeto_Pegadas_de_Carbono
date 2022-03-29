package controller;

import java.util.List;

import dao.ChamadoDao;
import dao.FuncionarioDao;
import dao.VeiculosDao;
import model.Chamado;

public class ChamadoController{
	
	public void novoChamado(Chamado chamado) throws Exception {
		
		if (chamado.getInicioChamado() == null) {
			throw new Exception( "Erro: Data de início inválida.");
		}
		
		if (chamado.getEndereco() == null || chamado.getEndereco().length() < 5) {
			throw new Exception("Erro: Endereço imválido.");
		}
		
		if (!chamado.getFuncionario().isCnh()) {
			throw new Exception();
		}
		
		if(!chamado.getVeiculos().isLivre()) {
			throw new Exception();
		}	
		
		ChamadoDao.getInstance().novoChamado(chamado);
		VeiculosDao.getInstance().desabilitarAuto(chamado.getVeiculos());
		
	}
	
	public void atualizar(Chamado chamado) throws Exception {
		
		if(chamado.getFimChamado() == null) {
			throw new Exception("Data de Encerramento Inválida!");
		}
		
		ChamadoDao.getInstance().atualizar(chamado);
		VeiculosDao.getInstance().habilitarAuto(chamado.getVeiculos());
		
	}
	
	public void del(int id) throws Exception {
		
		if (id == 0) {
			
			throw new Exception("Id chamado inválido");
		}
		
		ChamadoDao.getInstance().del(id);
		
	}
	
	public List<Chamado> listar() throws Exception{
		List<Chamado> chamados = ChamadoDao.getInstance().listar();
		
		if(chamados.isEmpty()) {
			throw new Exception("Não Existem chamados Cadastrados!");
		}		
		return chamados;
	}
	
	public Chamado listById(int id) {
		return ChamadoDao.getInstance().listById(id);
	}
	
}

