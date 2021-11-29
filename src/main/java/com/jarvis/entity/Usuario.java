package com.jarvis.entity;

import java.io.Serializable;

public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private int CD_USUARIO;
	private String NM_USUARIO;
	private String DT_SOBRENOME;
	private int NR_CPF;
	private int NR_ALTURA;
	private int NR_IDADE;
	private int NR_CELULAR;
	/**
	 * @return the cD_USUARIO
	 */
	public int getCD_USUARIO() {
		return CD_USUARIO;
	}
	/**
	 * @param cD_USUARIO the cD_USUARIO to set
	 */
	public void setCD_USUARIO(int cD_USUARIO) {
		CD_USUARIO = cD_USUARIO;
	}
	/**
	 * @return the nM_USUARIO
	 */
	public String getNM_USUARIO() {
		return NM_USUARIO;
	}
	/**
	 * @param nM_USUARIO the nM_USUARIO to set
	 */
	public void setNM_USUARIO(String nM_USUARIO) {
		NM_USUARIO = nM_USUARIO;
	}
	/**
	 * @return the dT_SOBRENOME
	 */
	public String getDT_SOBRENOME() {
		return DT_SOBRENOME;
	}
	/**
	 * @param dT_SOBRENOME the dT_SOBRENOME to set
	 */
	public void setDT_SOBRENOME(String dT_SOBRENOME) {
		DT_SOBRENOME = dT_SOBRENOME;
	}
	/**
	 * @return the nR_CPF
	 */
	public int getNR_CPF() {
		return NR_CPF;
	}
	/**
	 * @param nR_CPF the nR_CPF to set
	 */
	public void setNR_CPF(int nR_CPF) {
		NR_CPF = nR_CPF;
	}
	/**
	 * @return the nR_ALTURA
	 */
	public int getNR_ALTURA() {
		return NR_ALTURA;
	}
	/**
	 * @param nR_ALTURA the nR_ALTURA to set
	 */
	public void setNR_ALTURA(int nR_ALTURA) {
		NR_ALTURA = nR_ALTURA;
	}
	/**
	 * @return the nR_IDADE
	 */
	public int getNR_IDADE() {
		return NR_IDADE;
	}
	/**
	 * @param nR_IDADE the nR_IDADE to set
	 */
	public void setNR_IDADE(int nR_IDADE) {
		NR_IDADE = nR_IDADE;
	}
	/**
	 * @return the nR_CELULAR
	 */
	public int getNR_CELULAR() {
		return NR_CELULAR;
	}
	/**
	 * @param nR_CELULAR the nR_CELULAR to set
	 */
	public void setNR_CELULAR(int nR_CELULAR) {
		NR_CELULAR = nR_CELULAR;
	}
	
	public Usuario() {}
	
	
	public Usuario(int cD_USUARIO, String nM_USUARIO, String dT_SOBRENOME, int nR_CPF, int nR_ALTURA, int nR_IDADE,
			int nR_CELULAR) {
		super();
		CD_USUARIO = cD_USUARIO;
		NM_USUARIO = nM_USUARIO;
		DT_SOBRENOME = dT_SOBRENOME;
		NR_CPF = nR_CPF;
		NR_ALTURA = nR_ALTURA;
		NR_IDADE = nR_IDADE;
		NR_CELULAR = nR_CELULAR;
	}
	@Override
	public String toString() {
		return "USUARIO [CD_USUARIO=" + CD_USUARIO + ", NM_USUARIO=" + NM_USUARIO + ", DT_SOBRENOME=" + DT_SOBRENOME
				+ ", NR_CPF=" + NR_CPF + ", NR_ALTURA=" + NR_ALTURA + ", NR_IDADE=" + NR_IDADE + ", NR_CELULAR="
				+ NR_CELULAR + "]";
	}

	
	
	
	


}
