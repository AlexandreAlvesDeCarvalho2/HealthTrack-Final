package com.jarvis.test;

import java.util.List;

import com.jarvis.DAO.DaoFactory;
import com.jarvis.DAO.ExecicioDAO;
import com.jarvis.DAO.LoginDAO;


import com.jarvis.entity.Exercicio;
import com.jarvis.entity.Login;






public class Executable {
	
	public static void main(String[] args) {
		
		try {
			
			
//----------------------------------------CRUD-EXERCICIO -----------------------------------------------		

			Exercicio exercicio = new Exercicio();
			ExecicioDAO dao = DaoFactory.getEXERCICIODAO();
			
			
			LoginDAO dao2 = DaoFactory.getLOGINDAO();
			
			//=-=-=-=-=-=-=-=- Gravar EXERCICIO -=-=-=-=-=-=-=-=-=-=-			
			
			exercicio.setDT_REGISTRO("18/11/21");
			exercicio.setNM_HORA("21:00");
			exercicio.setINTENSIDADE("baixa");
			exercicio.setDURACAO(45);
			exercicio.setCALORIAS(200);
			exercicio.setOBSERVACAO("Volei com a turma da faculdade" );
			exercicio.setCD_USUARIO(3);
			exercicio.setCD_TIPO_EXERCICIO(3);
			
			//dao.gravar(exercicio);  // 		
			
			//=-=-=-=-=-=-=-=- atualizar EXERCICIO -=-=-=-=-=-=-=-=-=-=-			
			
			exercicio.setCD_REGISTRO(27);
			exercicio.setDT_REGISTRO("19/11/21");
			exercicio.setNM_HORA("20:00");
			exercicio.setINTENSIDADE("média");
			exercicio.setDURACAO(30);
			exercicio.setCALORIAS(155);
			exercicio.setOBSERVACAO("Volei com a turma do trabalho " );
			exercicio.setCD_USUARIO(3);
			exercicio.setNM_EXERCICIO("Volei");
			
			//dao.atualizar(exercicio);
			
			//=-=-=-=-=-=-=-=- BuscarPorID EXERCICIO -=-=-=-=-=-=-=-=-=-=-	
			
			
			List<Exercicio> exercicios = dao.buscarPorID(3);
			for(Exercicio c: exercicios) {
				System.out.println(c.toString());
			}
			
			
			//=-=-=-=-=-=-=-=- Remover EXERCICIO -=-=-=-=-=-=-=-=-=-=-		
			
			//dao.remover(26);
				
			
			
			//=-=-=-=-=-=-=-=- Buscar Login & Senha EXERCICIO -=-=-=-=-=-=-=-=-=-=-		
			
			List<Login> logins = dao2.buscarPorEmail("aline.santos@email.com","senha1234");
			for(Login c: logins) {
				System.out.println(c.toString());
			}
		
			
			
			
			} catch (Exception e) {
				System.err.println("Erro ao enviar os arquivos");
				e.printStackTrace();

				
			
	}

		
}
}
