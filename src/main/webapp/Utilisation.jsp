
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <title>Utilisation Simple</title>
        <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
  <style>
      .card-group{
          padding-top: 150px;
      }
      #back{
          position: relative;
          right:       -1400px;
      }
  </style>
    </head>
    <body>

        <center>

<div class="container">
    <div class="card-group">

        <div class="card" style="width:400px" id="1">
            <img class="card-img-top" src="https://www.w3schools.com/w3images/avatar2.png" alt="Card image" style="width:100%">
    <div class="card-body">
      <h4 class="card-title">ETUDIANT</h4>
      <a href="test?action=ShowStudents" class="btn btn-primary">Voir Plus</a>
    </div>
  </div>
  <br>
  
  <div class="card" style="width:400px" id="2">
    <div class="card-body">
      <h4 class="card-title">DEPARTEMENT</h4>
      <a href="test?action=Showdepartements" class="btn btn-primary">Voir Plus</a>
    </div>
    <img class="card-img-bottom" src="https://cdn-icons-png.flaticon.com/512/3652/3652193.png" alt="Card image" style="width:100%">
  </div>
  <br>
  <div class="card" style="width:400px" id="1">
    <img class="card-img-top" src="https://png.pngtree.com/element_our/20190528/ourlarge/pngtree-office-label-file-icon-image_1168638.jpg" alt="Card image" style="width:100%">
    <div class="card-body">
      <h4 class="card-title">FILLIERE</h4>
      <a href="test?action=Showfilieres" class="btn btn-primary">Voir Plus</a>
    </div>
  </div>
    </div>
</div>
        </center>
    <button class="btn btn-danger hBack" type="button" id="back">BACK</button>
<script>
$(".hBack").on("click", function(e){
    e.preventDefault();
    window.history.back();
});</script>
    </body>
</html>
