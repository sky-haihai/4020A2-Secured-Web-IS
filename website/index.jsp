<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <link rel="stylesheet" href="css/reset.css" />
    <link rel="stylesheet" href="css/login.css" />
    <link rel="stylesheet" href="css/credit.css" />
    <title>Login Page</title>
  </head>
  <body>
    <div class="container">
      <form action="login" method="post">
        <label for="username">Username</label>
        <input type="text" id="username" name="username" required /><br /><br />
        <label for="password">Password</label>
        <input
          type="password"
          id="password"
          name="password"
          required
        /><br /><br />
        <input type="submit" value="Login" />
      </form>
    </div>

    <div class="credit">
      Created by Mark Amirthanathan, Mohammad Asif Khan, Yaotian Huang. PHOTOGRAPH BY THE CITY OF TORONTO: https://flic.kr/p/gjDRTG
    </div>
  </body>
</html>
