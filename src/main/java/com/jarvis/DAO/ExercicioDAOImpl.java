package com.jarvis.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jarvis.entity.*;
import com.jarvis.DBFactory.DbMananger;

public class ExercicioDAOImpl implements ExercicioDAO {
	
	private Connection conexao;
	PreparedStatement pstmt = null;

	@Override
	public void gravar(Exercicio exercicio) {
		try {
			conexao = DbMananger.obterConexao();
			pstmt = conexao.prepareStatement("INSERT INTO T_EXERCICIO "
					+ "(CD_REGISTRO, DT_REGISTRO, NM_HORA, INTENSIDADE, DURACAO, CALORIAS, OBSERVACAO,"
					+ " CD_USUARIO, CD_TIPO_EXERCICIO )"
					+ " VALUES (RM87840.ISEQ$$_1022437.nextval, ?, ?, ?, ?, ?, ?, ?, ?)");

			
			pstmt.setString(1, exercicio.getDT_REGISTRO());
			pstmt.setString(2, exercicio.getNM_HORA());
			pstmt.setString(3, exercicio.getINTENSIDADE());
			pstmt.setInt(4, exercicio.getDURACAO());
			pstmt.setInt(5, exercicio.getCALORIAS());
			pstmt.setString(6, exercicio.getOBSERVACAO());
			pstmt.setInt(7, exercicio.getCD_USUARIO());
			pstmt.setInt(8, exercicio.getCD_TIPO_EXERCICIO());
			
			

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
		
	

	@Override
	public List<Exercicio> buscarPorID(int id) {

		List<Exercicio> exercicios = new ArrayList<Exercicio>();
		ResultSet rs = null;

		try {	
			conexao = DbMananger.obterConexao();
			pstmt = conexao.prepareStatement("select dt_registro, nm_hora, intensidade, duracao, calorias, observacao, nm_exercicio from t_exercicio e inner join t_tipo_exercicio t  on (e.cd_tipo_exercicio = t.cd_tipo_exercicio)"
					+ " where cd_usuario = ?");
			
			pstmt.setInt(1, id);
				
			
			rs = pstmt.executeQuery();

			// Percorre todos os registros encontrados
			while (rs.next()) {

				Exercicio exercicio = new Exercicio();

				exercicio.setDT_REGISTRO(rs.getString("DT_REGISTRO"));
				exercicio.setNM_HORA(rs.getString("NM_HORA"));
				exercicio.setINTENSIDADE(rs.getString("INTENSIDADE"));
				exercicio.setDURACAO(rs.getInt("DURACAO"));
				exercicio.setCALORIAS(rs.getInt("CALORIAS"));
				exercicio.setOBSERVACAO(rs.getString("OBSERVACAO"));
				exercicio.setNM_EXERCICIO(rs.getString("NM_EXERCICIO"));

				exercicios.add(exercicio);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				rs.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return exercicios;
	}

	@Override
	public void atualizar(Exercicio exercicio) {
		
		try {
			conexao = DbMananger.obterConexao(); 
			pstmt = conexao.prepareStatement("UPDATE T_EXERCICIO SET DT_REGISTRO = ?, NM_HORA = ?, INTENSIDADE = ?, DURACAO = ?, CALORIAS = ?, OBSERVACAO = ?, CD_USUARIO = ?, CD_TIPO_EXERCICIO = ? WHERE CD_REGISTRO = ?");

			pstmt.setString(1, exercicio.getDT_REGISTRO());
			pstmt.setString(2, exercicio.getNM_HORA());
			pstmt.setString(3, exercicio.getINTENSIDADE());
			pstmt.setInt(4, exercicio.getDURACAO());
			pstmt.setInt(5, exercicio.getCALORIAS());
			pstmt.setString(6, exercicio.getOBSERVACAO());
			pstmt.setInt(7, exercicio.getCD_USUARIO());
			pstmt.setInt(8, exercicio.getCD_TIPO_EXERCICIO());
			pstmt.setInt(9, exercicio.getCD_REGISTRO());
			

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void remover(int id) {
		try {

			conexao = DbMananger.obterConexao();
			pstmt = conexao.prepareStatement("DELETE FROM T_USUARIO WHERE CD_REGISTRO = ?");
			pstmt.setInt(1, id);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
