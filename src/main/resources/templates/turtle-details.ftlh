<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link rel="stylesheet" href="css/styles.css" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.min.js" integrity="sha384-RuyvpeZCxMJCqVUGFI0Do1mQrods/hhxYlcVfGPOfQtPJh0JCw12tUAZ/Mv10S7D" crossorigin="anonymous"></script>
    <style>
        h1 {text-align: center;}
        div {text-align: center;}
    </style>
</head>
  <body>
    <!-- Begin Nav Bar -->
    <nav class="navbar navbar-expand-lg  navbar-dark" style="background-color: #799351;">
        <ul class="nav justify-content-end">
            <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="/turtles">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="/turtles/createForm">Create a New Turtle</a>
            </li>
        </ul>
    </nav>
    <h1>name: ${turtle.name}</h1>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
    <div class="row">
        <div class="column">
            <ul class="list-group list-group-flush">
              <h5 class="card-title">ID: ${turtle.turtleID?c}</h5>
              <li class="list-group-item">Description: ${turtle.description}</li>
              <li class="list-group-item">Species: ${turtle.species}</li>
              <li class="list-group-item">Age: ${turtle.age}</li>
              <a href="/turtles/updateForm/${turtle.turtleID}" class="btn btn-primary">Update Turtle</a>
              <a href="/turtles/delete/${turtle.turtleID}" class="btn btn-danger">Delete Turtle</a>
            </ul>
        </div>
    </div> 
  </body>
</html>
