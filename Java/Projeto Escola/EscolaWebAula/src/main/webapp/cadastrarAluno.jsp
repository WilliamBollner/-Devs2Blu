<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="entidades.Aluno" %>
<%@ page import="entidadesDao.AlunoDao" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Aluno aluno = new Aluno();
AlunoDao alunoD = new AlunoDao();
aluno.setNomeAluno("Wi");
aluno.setNomePai("Paia");
aluno.setNomeMae("ala");
if (alunoD.inserir(aluno)) {
	response.sendRedirect("cadastraaluno.jsp?mesagem=Aluno salvo com sucesso");
} else {
	response.sendRedirect("cadastraTarefa.jsp?mesagem=Problemas ao conectar");
}
%>
</body>
</html>