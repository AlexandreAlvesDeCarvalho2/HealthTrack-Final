package com.jarvis.DAO;

import java.util.List;

import com.jarvis.entity.*;

public interface ExecicioDAO {
	
	void gravar(Exercicio exercicio);
	List<Exercicio> buscarPorID(int id);
	void atualizar (Exercicio exercicio);
	void remover (int id);
	
}

