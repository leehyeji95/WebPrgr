<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Sign In Form</title>

<!-- <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css"> -->

<link rel="stylesheet" href="css/signinup.css">
<meta name="robots" content="noindex, follow">
</head>
<body>
	<div class="main">
		<section class="sign-in">
			<div class="container">
				<div class="signin-content">
					<div class="signin-image">
						<figure>
							<img src="images/signin.jpg" alt="sing up image">
						</figure>
						<a href="./SignUpForm.jsp" class="signup-image-link">Create an account</a>
					</div>
					<div class="signin-form">
						<h2 class="form-title">로그인</h2>
						<form method="POST" class="register-form" id="login-form" action="signIn">
							<div class="form-group">
								<label for="mem_id"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="mem_id" id="mem_id"
									placeholder="아이디를 입력하세요" />
							</div>
							<div class="form-group">
								<label for="mem_pw"><i class="zmdi zmdi-lock"></i></label> <input
									type="password" name="mem_pw" id="mem_pw"
									placeholder="비밀번호를 입력하세요" />
							</div>
							<div class="form-group">
								<input type="checkbox" name="remember-me" id="remember-me"
									class="agree-term" /> <label for="remember-me"
									class="label-agree-term"><span><span></span></span>Remember
									me</label>
							</div>
							<div class="form-group form-button">
								<input type="submit" name="signin" id="signin"
									class="form-submit" value="로그인" />
							</div>
						</form>
						<div class="social-login">
							<span class="social-label">Or login with</span>
							<ul class="socials">
								<li><a href="#"><i
										class="display-flex-center zmdi zmdi-facebook"></i></a></li>
								<li><a href="#"><i
										class="display-flex-center zmdi zmdi-twitter"></i></a></li>
								<li><a href="#"><i
										class="display-flex-center zmdi zmdi-google"></i></a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</section>
	</div>


	<script>
		window.dataLayer = window.dataLayer || [];
		function gtag() {
			dataLayer.push(arguments);
		}
		gtag('js', new Date());

		gtag('config', 'UA-23581568-13');
	</script>
</html>