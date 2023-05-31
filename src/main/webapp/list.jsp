<%@page import="model.Livre"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
</head>
<body>
<body>
	<div class='container'>
		<table class='table' border='1'>
			<tr>
				<th>Titre</th>
				<th>Author</th>
				<th>Price</th>
				<th>Number of Pages</th>
				<th>publish Date</th>
				<th>Rate</th>
				<th>Categorie</th>
			</tr>
			<%
			ArrayList<Livre> liste = (ArrayList<Livre>) request.getAttribute("list");
			
			for(Livre p : liste){
				out.print("<tr><td>" + p.getTitle() + "</td><td>" + p.getAuthor() + "</td><td>" + p.getPrix() + "</td><td>"
				+ p.getNbPages()+ "</td><td>"+p.getPublishDate()+"</td><td>"+p.getRate()+"</td><td>"+ p.getCategorie()+"</td><td></tr>");
			}
			%>
		</table>
	</div>
</body>
</body>
</html>