package com.jarvis.entity;

import java.io.Serializable;


public class Exercicio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int CD_REGISTRO;
	private String DT_REGISTRO;
	private String NM_HORA;
	private String INTENSIDADE;
	private int DURACAO;
	private int CALORIAS;
	private String OBSERVACAO;
	private int CD_USUARIO;
	private int CD_TIPO_EXERCICIO;
	private String NM_EXERCICIO;
	
	
	
	
	
	public int getCD_TIPO_EXERCICIO() {
		return CD_TIPO_EXERCICIO;
	}

	public void setCD_TIPO_EXERCICIO(int cD_TIPO_EXERCICIO) {
		CD_TIPO_EXERCICIO = cD_TIPO_EXERCICIO;
	}

	public String getNM_EXERCICIO() {
		return NM_EXERCICIO;
	}

	public void setNM_EXERCICIO(String nM_EXERCICIO) {
		NM_EXERCICIO = nM_EXERCICIO;
	}

	public int getCD_REGISTRO() {
		return CD_REGISTRO;
	}

	public void setCD_REGISTRO(int cD_REGISTRO) {
		CD_REGISTRO = cD_REGISTRO;
	}

	public String getDT_REGISTRO() {
		return DT_REGISTRO;
	}

	public void setDT_REGISTRO(String dT_REGISTRO) {
		DT_REGISTRO = dT_REGISTRO;
	}

	public String getNM_HORA() {
		return NM_HORA;
	}

	public void setNM_HORA(String nM_HORA) {
		NM_HORA = nM_HORA;
	}

	public String getINTENSIDADE() {
		return INTENSIDADE;
	}

	public void setINTENSIDADE(String iNTENSIDADE) {
		INTENSIDADE = iNTENSIDADE;
	}

	public int getDURACAO() {
		return DURACAO;
	}

	public void setDURACAO(int dURACAO) {
		DURACAO = dURACAO;
	}

	public int getCALORIAS() {
		return CALORIAS;
	}

	public void setCALORIAS(int cALORIAS) {
		CALORIAS = cALORIAS;
	}

	public String getOBSERVACAO() {
		return OBSERVACAO;
	}

	public void setOBSERVACAO(String oBSERVACAO) {
		OBSERVACAO = oBSERVACAO;
	}

	public int getCD_USUARIO() {
		return CD_USUARIO;
	}

	public void setCD_USUARIO(int cD_USUARIO) {
		CD_USUARIO = cD_USUARIO;
	}
	



	public Exercicio() {}

	public Exercicio(int cD_REGISTRO, String dT_REGISTRO, String nM_HORA, String iNTENSIDADE, int dURACAO, int cALORIAS,
			String oBSERVACAO, int cD_USUARIO, int cD_TIPO_EXERCICIO, String nM_EXERCICIO) {
		super();
		CD_REGISTRO = cD_REGISTRO;
		DT_REGISTRO = dT_REGISTRO;
		NM_HORA = nM_HORA;
		INTENSIDADE = iNTENSIDADE;
		DURACAO = dURACAO;
		CALORIAS = cALORIAS;
		OBSERVACAO = oBSERVACAO;
		CD_USUARIO = cD_USUARIO;
		CD_TIPO_EXERCICIO = cD_TIPO_EXERCICIO;
		NM_EXERCICIO = nM_EXERCICIO;
	}

	@Override
	public String toString() {
		return "EXERCICIO [CD_REGISTRO=" + CD_REGISTRO + ", DT_REGISTRO=" + DT_REGISTRO + ", NM_HORA=" + NM_HORA
				+ ", INTENSIDADE=" + INTENSIDADE + ", DURACAO=" + DURACAO + ", CALORIAS=" + CALORIAS + ", OBSERVACAO="
				+ OBSERVACAO + ", CD_USUARIO=" + CD_USUARIO + ", CD_TIPO_EXERCICIO=" + CD_TIPO_EXERCICIO
				+ ", NM_EXERCICIO=" + NM_EXERCICIO + "]";
	}


	


	}







	


	
	
	
	
	


