package com.jarvis.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jarvis.entity.*;
import com.jarvis.DBFactory.DbMananger;

public class UsuarioDAOImpl implements UsuarioDAO {
	
	private Connection conexao;
	PreparedStatement pstmt = null;

	@Override
	public void gravar(Usuario usuario) {
		try {
			conexao = DbMananger.obterConexao();
			pstmt = conexao.prepareStatement("INSERT INTO T_USUARIO (CD_USUARIO, NM_USUARIO, DT_SOBRENOME, NR_CPF, NR_ALTURA, NR_IDADE, NR_CELULAR)"
					+ " VALUES (ISEQ$$_1022437.NEXTVAL, ?, ?, ?, ?, ?, ?)");

			
			pstmt.setString(1, usuario.getNM_USUARIO());
			pstmt.setString(2, usuario.getDT_SOBRENOME());
			pstmt.setInt(3, usuario.getNR_CPF());
			pstmt.setInt(4, usuario.getNR_ALTURA());
			pstmt.setInt(5, usuario.getNR_IDADE());
			pstmt.setInt(6, usuario.getNR_CELULAR());
			
			

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
	public List<Usuario> buscarPorID(int id) {

		List<Usuario> usuarios = new ArrayList<Usuario>();
		ResultSet rs = null;

		try {
			conexao = DbMananger.obterConexao();
			pstmt = conexao.prepareStatement("select * from T_USUARIO where CD_USUARIO = ?");
			
			pstmt.setInt(1, id);
				
			
			rs = pstmt.executeQuery();

			// Percorre todos os registros encontrados
			while (rs.next()) {

				Usuario usuario = new Usuario();

				usuario.setNM_USUARIO(rs.getString("NM_USUARIO"));
				usuario.setDT_SOBRENOME(rs.getString("DT_SOBRENOME"));
				usuario.setNR_CPF(rs.getInt("NR_CPF"));
				usuario.setNR_ALTURA(rs.getInt("NR_ALTURA"));
				usuario.setNR_IDADE(rs.getInt("NR_IDADE"));
				usuario.setNR_CELULAR(rs.getInt("NR_CELULAR"));
				
				usuarios.add(usuario);
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

		return usuarios;
	}

	@Override
	public void atualizar(Usuario usuario) {
		
		try {
			conexao = DbMananger.obterConexao(); 
			pstmt = conexao.prepareStatement("UPDATE T_USUARIO SET "
					+ "NM_USUARIO = ?, DT_SOBRENOME = ?, NR_CPF = ?, NR_ALTURA = ?, NR_IDADE = ?, NR_CELULAR = ? WHERE CD_USUARIO = ?");

			pstmt.setString(1, usuario.getNM_USUARIO());
			pstmt.setString(2, usuario.getDT_SOBRENOME());
			pstmt.setInt(3, usuario.getNR_CPF());
			pstmt.setInt(4, usuario.getNR_ALTURA());
			pstmt.setInt(5, usuario.getNR_IDADE());
			pstmt.setInt(6, usuario.getNR_CELULAR());
			pstmt.setInt(7, usuario.getCD_USUARIO());;
			

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
			pstmt = conexao.prepareStatement("DELETE FROM T_USUARIO WHERE CD_USUARIO = ?");
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
