<%@page import="com.test.Service.ServiceImpl"%>
<%@page import="com.test.Service.IService"%>
<%@page import="com.test.Model.filiere"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<% filiere f =new filiere();
        IService ser = new ServiceImpl();
try{
f.setNom(request.getParameter("nom"));
f.setDepartement(request.getParameter("departement"));
                                ser.AddFiliere(f);
%>
<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">

        <title>Recherche Filiere</title>
        <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
  <style>
      .alert{
          width: 500px;
          top: 100px;
      }
       a:visited {
  color: green;
}

/* mouse over link */
a:hover {
  color: cadetblue;
}

/* selected link */
a:active {
  color: burlywood;
}
  </style>
    </head>
    <body>
        
    

<center>
    <div class="alert alert-success" role="alert">
  <h4 class="alert-heading">Well done!</h4>
<h5>L'insertion a été bien effectué</h5>
  <hr>
  <p class="mb-0"><a href="test?action=Menu_administration">Retour à la page d'administration</a>  </p>
</div>



<%
}
catch (Throwable ex) {
            // Log the exception. 
            %>
            <h1> Error</h1>
<%
}

%>
</center>
</body>
</html>