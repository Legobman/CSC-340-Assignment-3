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
                <a class="nav-link active" aria-current="page" href="/turtles/createForm">Create a New Turtle</a>
            </li>
        </ul>
    </nav>
    <h1 style="text-align:center">Hello, welcome to my gallery of turtles and tortoises!</h1>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
    <#list turtlesList as turtle>
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">${turtle.name}</h5>
                    <h6 class="card-subtitle mb-2 text-body-secondary">${turtle.species}</h6>
                    <p class="card-text">${turtle.description}</p>
                    <a href="/turtles/${turtle.turtleID}" class="card-link">View</a>
                </div>
            </div>
        </#list>
</body>
</html>
