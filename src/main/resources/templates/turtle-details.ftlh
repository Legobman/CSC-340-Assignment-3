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
    <ul>
        <li><a href="index.html">Home</a></li>
        <li><a href="details.html">Eastern Box Turtle</a></li>
        <li><a href="about.html">About</a></li>
    </ul>
    <h1>name: ${turtle.name}</h1>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
    <div class="row">
        <div class="column">
            <ul class="list-group list-group-flush">
              <li class="list-group-item">Description: ${turtle.description}</li>
              <li class="list-group-item">Species: ${turtle.species}</li>
              <li class="list-group-item">Age: ${turtle.age}</li>
            </ul>
        </div>
    </div> 
  </body>
</html>
