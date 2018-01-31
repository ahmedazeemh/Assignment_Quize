<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
   <meta charset="UTF-8">
  <title>Home</title>
  
  
  
      <link rel="stylesheet" href="css/style.css">

  
</head>

<body>

  <div class="login-page">
  <div class="form">
    <form class="register-form" action="Registration" method="post">
      <input type="text" placeholder="name" name="user" />
      <input type="password" placeholder="password" name="password"/>
      <input type="text" placeholder="email address" name="email"/>
      <button>create</button>
      <p class="message">Already registered? <a href="#">Sign In</a></p>
    </form>
    <form class="login-form" action="Login" method="post">
      <input type="text" placeholder="email" name="email" required="required"/>
      <input type="password" placeholder="password" name="password" required="required"/>
      <button>login</button>
      <p class="message">Not registered? <a href="#">Create an account</a></p>
    </form>
  </div>
</div>
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

  

    <script  src="js/index.js"></script>




</body>

</html>