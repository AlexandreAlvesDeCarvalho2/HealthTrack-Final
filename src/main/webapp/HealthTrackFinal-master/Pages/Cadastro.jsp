<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<%@ page import="com.jarvis.entity.*,com.jarvis.DAO.*, java.util.*"%>
<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

</head>
<body>



<%
Login usuario = (Login) session.getAttribute("usuario");
	if (usuario == null) {
		String msg = "Usuario ou senha invalidos";
		response.sendRedirect("Login.jsp");
	} else {
		out.print("Bem vindo, + " + usuario.getDT_EMAIL() +  " <br/> ");
	}
	
	ExecicioDAO dao = DaoFactory.getEXERCICIODAO();
	Exercicio exercicio = new Exercicio();
	
	exercicio.setDT_REGISTRO(request.getParameter("data"));
	exercicio.setNM_HORA(request.getParameter("Horario"));
	exercicio.setINTENSIDADE(request.getParameter("intensidade"));
	exercicio.setDURACAO(Integer.parseInt(request.getParameter("Duracao")));
	exercicio.setCALORIAS(Integer.parseInt(request.getParameter("Calorias")));
	exercicio.setOBSERVACAO(request.getParameter("Obsercavao"));
	exercicio.setCD_USUARIO(usuario.getCD_USUARIO());
	exercicio.setCD_TIPO_EXERCICIO(Integer.parseInt(request.getParameter("tpexercicio")));
	
	
	dao.gravar(exercicio);
%>
</body>
</html>