package com.jarvis.entity;

import java.io.Serializable;

public class Login implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String DT_EMAIL;
	private String DT_SENHA;
	private int CD_USUARIO;
	
	public String getDT_EMAIL() {
		return DT_EMAIL;
	}
	public void setDT_EMAIL(String dT_EMAIL) {
		DT_EMAIL = dT_EMAIL;
	}
	public String getDT_SENHA() {
		return DT_SENHA;
	}
	public void setDT_SENHA(String dT_SENHA) {
		DT_SENHA = dT_SENHA;
	}
	public int getCD_USUARIO() {
		return CD_USUARIO;
	}
	public void setCD_USUARIO(int cD_USUARIO) {
		CD_USUARIO = cD_USUARIO;
	}
	
	public Login() {
		
	}
	
	public Login(String dT_EMAIL, String dT_SENHA, int cD_USUARIO) {
		super();
		DT_EMAIL = dT_EMAIL;
		DT_SENHA = dT_SENHA;
		CD_USUARIO = cD_USUARIO;
	}
	@Override
	public String toString() {
		return "LOGIN [DT_EMAIL=" + DT_EMAIL + ", DT_SENHA=" + DT_SENHA + ", CD_USUARIO=" + CD_USUARIO + "]";
	}
	
	
	
}
