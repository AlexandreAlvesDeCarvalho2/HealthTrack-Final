package com.jarvis.DAO;

import java.util.List;
import com.jarvis.entity.Usuario;

public interface UsuarioDAO {
	
	void gravar(Usuario usuario);
	List<Usuario> buscarPorID(int id);
	void atualizar (Usuario usuario);
	void remover (int id);
	
	
}
