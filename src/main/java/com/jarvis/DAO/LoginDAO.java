package com.jarvis.DAO;

import java.util.List;

import com.jarvis.entity.*;

public interface LoginDAO {
	
	List<Login> buscarPorEmail(String email, String senha);
	
}

