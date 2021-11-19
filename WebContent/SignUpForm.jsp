<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Sign Up Form</title>

<!-- <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css"> -->

<link rel="stylesheet" href="css/signinup.css">
<meta name="robots" content="noindex, follow">
</head>
<body>
	<div class="main">
		<section class="signup">
			<div class="container">
				<div class="signup-content">
					<div class="signup-form">
						<h2 class="form-title">회원가입</h2>
						<form method="POST" class="register-form" id="register-form" action="signUp">
							<div class="form-group">
								<label for="mem_id"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="mem_id" id="mem_id" placeholder="아이디를 입력하세요" />
							</div>
							<div class="form-group">
								<label for="mem_name"><i class="zmdi zmdi-email"></i></label> <input
									type="text" name="mem_name" id="mem_name" placeholder="이름을 입력하세요" />
							</div>
							<div class="form-group">
								<label for="mem_pw"><i class="zmdi zmdi-lock"></i></label> <input
									type="password" name="mem_pw" id="mem_pw" placeholder="비밀번호를 입력하세요" />
							</div>
							<div class="form-group">
								<label for="re_pw"><i class="zmdi zmdi-lock-outline"></i></label>
								<input type="password" name="re_pw" id="re_pw"
									placeholder="비밀번호를 다시 입력하세요" />
							</div>
							<div class="form-group">
								<label for="mem_email"><i class="zmdi zmdi-email"></i></label> <input
									type="email" name="mem_email" id="mem_email" placeholder="이메일을 입력하세요" />
							</div>
							<div class="form-group">
								<label for="mem_mdn"><i class="zmdi zmdi-email"></i></label> <input
									type="text" name="mem_mdn" id="mem_mdn" placeholder="전화번호를 입력하세요" />
							</div>
							<div class="form-group">
								<label for="mem_addr"><i class="zmdi zmdi-email"></i></label> <input
									type="text" name="mem_addr" id="mem_addr" placeholder="주소를 선택하세요" />
							</div>
							<div class="form-group">
								<input type="checkbox" name="agree-term" id="agree-term"
									class="agree-term" /> <label for="agree-term"
									class="label-agree-term"><span><span></span></span>I
									agree all statements in <a href="#" class="term-service">Terms
										of service</a></label>
							</div>
							<div class="form-group form-button">
								<input type="submit" name="signup" id="signup"
									class="form-submit" value="가입하기" />
							</div>
						</form>
					</div>
					<div class="signup-image">
						<figure>
							<img src="images/signup.jpg" alt="sing up image">
						</figure>
						<a href="./SignInForm.jsp" class="signup-image-link">I am already member</a>
					</div>
				</div>
			</div>
		</section>
	</div>

	<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());

  gtag('config', 'UA-23581568-13');
</script>
<!-- 	<script defer -->
<!-- 		src="https://static.cloudflareinsights.com/beacon.min.js/v64f9daad31f64f81be21cbef6184a5e31634941392597" -->
<!-- 		integrity="sha512-gV/bogrUTVP2N3IzTDKzgP0Js1gg4fbwtYB6ftgLbKQu/V8yH2+lrKCfKHelh4SO3DPzKj4/glTO+tNJGDnb0A==" -->
<!-- 		data-cf-beacon='{"rayId":"6b05945baa590284","token":"cd0b4b3a733644fc843ef0b185f98241","version":"2021.11.0","si":100}' -->
<!-- 		crossorigin="anonymous"></script> -->
</body>
</html>