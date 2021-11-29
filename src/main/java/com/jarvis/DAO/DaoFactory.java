package com.jarvis.DAO;


	
	public abstract class DaoFactory {
		public static ExecicioDAO getEXERCICIODAO(){
		return new ExecicioDAOImpl();
		}
		
		public static LoginDAO getLOGINDAO(){
		return new LoginDAOImpl();
		}	
		
}
