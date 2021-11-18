<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
   
<link rel="stylesheet"
   href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
   <link rel="stylesheet" type="text/css" href="./css/login.css"/>
<script
   src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
   src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  </head>

  <body class="text-center">
    <form class="form-login" method="post" action="login">
<!--       <img class="mb-4" src="https://getbootstrap.com/assets/brand/bootstrap-solid.svg" alt="" width="72" height="72"> -->
      <h1 class="h3 mb-3 font-weight-normal">Please Log-In</h1>
      <label for="login_id" class="sr-only">ID</label>
      <input type="text" id="login_id" class="form-control" placeholder="아이디를 입력하세요" required autofocus>
      <label for="login_pw" class="sr-only">Password</label>
      <input type="password" id="login_pw" class="form-control" placeholder="패스워드를 입력하세요" required>
      <div class="checkbox mb-3">
        <label>
          <input type="checkbox" value="remember-me" name="save"> 아이디 저장하기
        </label>
      </div>
      <button class="btn btn-lg btn-block" type="submit">로그인</button>
    <button class="btn btn-lg btn-block" type="button" onclick="location.href='./JoinForm.jsp'">회원가입</button>
    </form>
  </body>
</html>
