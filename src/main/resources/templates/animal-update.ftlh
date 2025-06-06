<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link rel="stylesheet" href="css/styles.css" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.min.js" integrity="sha384-RuyvpeZCxMJCqVUGFI0Do1mQrods/hhxYlcVfGPOfQtPJh0JCw12tUAZ/Mv10S7D" crossorigin="anonymous"></script>
</head>
<body>

  <!-- Begin Nav Bar -->
  <nav class="navbar navbar-expand-lg  navbar-dark" style="background-color: #799351;">
    <ul class="nav justify-content-end">
      <li class="nav-item">
        <a class="nav-link active" aria-current="page" href="/turtles">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Second</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Third</a>
      </li>
    </ul>
  </nav>

  <div class="container" style="margin-top: 15px;">
    <h1>${title}</h1>
    <form id="new-turtle" action="/turtles/update/${turtle.turtleID?c}" method="post" enctype="multipart/form-data">
      <input type="number" id="turtleID" name="turtleID" value="${turtle.turtleID?c}" readonly />
      <input type="text" id="name" name="name" value="${turtle.name}" placeholder="Box Turtle" />
      <input type="text" id="description" name="description" value="${turtle.description}" placeholder="greenish brown" />
      <input type="text" id="species" name="species" value="${turtle.species}" placeholder="Common Box Turtle" />
      <input type="number" id="age" name="age" step="0.1" value="${turtle.age}" placeholder="1" /><br>
      <button type="submit" class="btn btn-primary">Save</button>
      <a href="/turtles/${turtle.turtleID?c}" class="btn btn-outline-danger">Cancel</a>
    </form>

  </div>
</body>

</html>
    