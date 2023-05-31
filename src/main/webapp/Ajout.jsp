<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<!-- int nbPages = Integer.parseInt(request.getParameter("nbP"));
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String categorie =request.getParameter("cat");
        float prix = Float.parseFloat(request.getParameter("prix"));
        float rate = Float.parseFloat(request.getParameter("rate"));
        Date publishDate = null; -->
	<h1>Ajout</h1>
	<div class="container" style="background-color:grey;margin-top:100px">
	<form action="Ajouter" method="post" >
	Title : <input class="form-control" name="title" type="text"><br><br>
	Author : <input class="form-control" name="author" type="text"><br><br>
	Nombre des pages : <input class="form-control" name="nbP" type="text"><br><br>
	Categorie : <input class="form-control" name="cat" type="text"><br><br>
	Price : <input class="form-control" name="prix" type="text"><br><br>
	Rate : <input class="form-control" name="rate" type="text"><br><br>
	Publish Date <input name="date" type="date">	
	<input type="submit" class="btn btn-dark"><br><br>
	</form>
	</div>
</body>
</html>