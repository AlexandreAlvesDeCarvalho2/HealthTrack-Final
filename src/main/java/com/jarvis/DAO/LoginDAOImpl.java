package com.jarvis.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jarvis.DBFactory.DbMananger;
import com.jarvis.entity.Login;

public class LoginDAOImpl implements LoginDAO {

	private Connection conexao;
	PreparedStatement pstmt = null;

	@Override
	public List<Login> buscarPorEmail(String email, String senha) {

		List<Login> logins = new ArrayList<Login>();
		ResultSet rs = null;

		try {
			conexao = DbMananger.obterConexao();
			pstmt = conexao.prepareStatement("select * from T_LOGIN where DT_EMAIL = ?");
			pstmt = conexao.prepareStatement("select * from T_LOGIN where DT_SENHA = ?");
				
			
			
			pstmt.setString(1, email);
			pstmt.setString(1, senha);

			rs = pstmt.executeQuery();

			// Percorre todos os registros encontrados
			while (rs.next()) {

				Login login = new Login();
				
				login.setDT_EMAIL(rs.getString("DT_EMAIL"));
				login.setDT_SENHA(rs.getString("DT_SENHA"));
				login.setCD_USUARIO(rs.getInt("CD_USUARIO"));
				

				logins.add(login);
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

		return logins;
	}

}
