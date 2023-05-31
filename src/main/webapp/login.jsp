<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<div class="container">
	<form action="Auth" method="post">
	Login : <input class="form-control"  name="login" type="text">
	Password : <input class="form-control" name="password" type="text" ><br><br>
	<input type="submit" value="ok" class="btn btn-dark">
</form>
</div>
<style>
/* body{
 background-image: url("bg.jpg");
 background-size: cover;
 height: 100vh;
 
 display: flex;
 align-items: center;
 justify-content: center;

}
.card{
  height: min-content;
  padding: 20px;
  border-radius: 12px;
  background:rgba(235, 235, 235, 0.86);
} */
	
</style>
<!-- <div class="container">
  <div class="position-relative">
    <div class="row">
      <div class="col-6 mt-4 m-auto" >
        <div class="card">
          <div class="card-header">
              <h3>Book Login Page</h3>
          </div>
          <div class="card-body">
            <form method="POST" action="Login">
            
              <div class="mb-3">
                <label for="username" class="form-label">Username :</label>
                <input type="text" id="username" class="form-control" name="login" required  />
               
              </div>
              <div class="mb-3">
                <label for="password" class="form-label">Password :</label>
                <input type="password" id="nom" class="form-control" name="pwd" required  />
              </div>
              <div>
                <button class="btn btn-primary">Submit</button>
              </div>

            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</div> -->
 </body>
</html>