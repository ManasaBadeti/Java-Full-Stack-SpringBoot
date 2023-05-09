<%
String fname = (String)session.getAttribute("fname");
String email = (String)session.getAttribute("email");
String pwd = (String)session.getAttribute("pwd");
%>

<html>

<style>
nav {
	margin: 27px auto 0;

	position: relative;
	width: 510px;
	height: 50px;
	background-color: #34495e;
	border-radius: 8px;
	font-size: 0;
}
nav a {
	line-height: 50px;
	height: 100%;
	font-size: 15px;
	display: inline-block;
	position: relative;
	z-index: 1;
	text-decoration: none;
	text-transform: uppercase;
	text-align: center;
	color: white;
	cursor: pointer;
}
nav .animation {
	position: absolute;
	height: 100%;
	top: 0;
	z-index: 0;
	transition: all .5s ease 0s;
	border-radius: 8px;
}
a:nth-child(1) {
	width: 110px;
}
a:nth-child(2) {
	width: 250px;
}
a:nth-child(3) {
	width: 150px;
}


nav .start-home, a:nth-child(1):hover~.animation {
	width: 110px;
	left: 0;
	background-color:	Crimson;
}
nav .start-about, a:nth-child(2):hover~.animation {
	width: 250px;
	left: 110px;
	background-color:SeaGreen;
}
nav .start-blog, a:nth-child(3):hover~.animation {
	width: 150px;
	left: 360px;
	background-color: Goldenrod;
}



body {
	font-size: 12px;
	font-family: sans-serif;
	background:#BC8F8F;
}
h1 {
	text-align: center;
	margin: 40px 0 40px;
	text-align: center;
	font-size: 30px;
	color: #ecf0f1;
	text-shadow: 2px 2px 4px #000000;
	font-family: 'Cherry Swash', cursive;
}

p {
    position: absolute;
    bottom: 20px;
    width: 100%;
    text-align: center;
    color: #ecf0f1;
    font-family: 'Cherry Swash',cursive;
    font-size: 16px;
}

span {
    color: #2BD6B4;
}
</style>

<style>

@use postcss-preset-env {
  stage: 0;
}

/* helpers/align.css */

.align {
  display: grid;
  place-items: center;
}

/* helpers/grid.css */

:root {
  --gridMaxWidth: 24em;
  --gridWidth: 90%;
}

.grid {
  inline-size: var(--gridWidth);
  margin-inline: auto;
  max-inline-size: var(--gridMaxWidth);
}

/* helpers/icon.css */

.icon {
  block-size: 1.25em;
  display: inline-block;
  inline-size: 1.25em;
  line-height: 1.25em;
  margin-right: 0.625em;
  text-align: center;
  vertical-align: middle;
}

.icon--info {
  background-color: #e5e5e5;
  border-radius: 50%;
}

/* layout/base.css */

:root {
  --bodyBackgroundColor: #eaeaea;
  --bodyColor: #999;
  --bodyFontFamily: 'Helvetica', 'Arial';
  --bodyFontFamilyFallback: sans-serif;
  --bodyFontSize: 0.875rem;
  --bodyFontWeight: 400;
  --bodyLineHeight: 1.5;
}

*,
*::before,
*::after {
  box-sizing: inherit;
}

html {
  box-sizing: border-box;
}


/* modules/anchor.css */

:root {
  --anchorColor: inherit;
  --anchorHoverColor: #1dabb8;
}

a {
  color: var(--anchorColor);
  text-decoration: none;
  transition: color 0.3s;
}

a:hover {
  color: var(--anchorHoverColor);
}

/* modules/form.css */

fieldset {
  border: none;
  margin: 0;
}

input {
  appearance: none;
  border: none;
  font: inherit;
  margin: 0;
  outline: none;
  padding: 0;
}

input[type='submit'] {
  cursor: pointer;
  text-align: center;
}

.form input[type='email'],
.form input[type='password'] {
  inline-size: 100%;
}

/* modules/login.css */

:root {
  --loginBorderRadius: 0.25em;
  --loginHeaderBackgroundColor: #282830;

  --loginInputBorderRadius: 0.25em;
}

.login__header {
  background-color: var(--loginHeaderBackgroundColor);
  border-top-left-radius: var(--loginBorderRadius);
  border-top-right-radius: var(--loginBorderRadius);
  color: #fff;
  padding: 2.5em;
  text-align: center;
  text-transform: uppercase;
}

.login__title {
  font-size: 1rem;
  margin: 0;
}

.login__body {
  background-color: #fff;
  padding: 3.5em;
  position: relative;
}

.login__body::before {
  background-color: #fff;
  content: '';
  height: 0.5em;
  left: 50%;
  margin-left: -0.25em;
  margin-top: -0.25em;
  position: absolute;
  top: 0;
  transform: rotate(45deg);
  width: 0.5em;
}

.login input[type='email'],
.login input[type='password'] {
  border: 0.0625em solid #e5e5e5;
  padding: 1.15em 1.50em;
}

.login input[type='email'] {
  border-top-left-radius: var(--loginInputBorderRadius);
  border-top-right-radius: var(--loginInputBorderRadius);
}

.login input[type='password'] {
  border-bottom-left-radius: var(--loginInputBorderRadius);
  border-bottom-right-radius: var(--loginInputBorderRadius);
  border-top: 0;
}

.login input[type='submit'] {
  background-color: crimson;
  border-radius: var(--loginInputBorderRadius);
  color: #fff;
  font-weight: 700;
  order: 1;
  padding: 0.75em 1.25em;
  transition: background-color 0.3s;
  text-align: center;
  justify-content: center;  
}

.login input[type='submit']:focus,
.login input[type='submit']:hover {
  background-color: crimson;
  
}

.login__footer {
  align-items: center;
  background-color: #fff;
  border-bottom-left-radius: var(--loginBorderRadius);
  border-bottom-right-radius: var(--loginBorderRadius);
  display: flex;
  justify-content: space-between;
  padding-bottom: 1.5em;
  padding-left: 1.5em;
  padding-right: 1.5em;
  justify-content: center;  
}

.login__footer p {
  margin: 0;
}

</style>


<h1 >JSP Application For JFSD Skilling-5</h1>

<nav>
	<a href="userhome.jsp">Home</a>
	<a href="changepwd.jsp">Change Password</a>
	<a href="ulogout.jsp">Log Out</a>
	<div class="animation start-home"></div>
</nav>

<h1>Welcome&nbsp;&nbsp;<%=fname%></h1>


<br><br>
 <div class="grid">

    <form method="post" action="changepwd1.jsp" class="form login">

      <header class="login__header">
        <h3 class="login__title">Update Password</h3>
      </header>

      <div class="login__body">

        <div class="form__field">
          <input type="password" placeholder="Old Password" name="opwd" required>
        </div>
        <div class="form__field">
          <input type="password" placeholder="New Password" name="npwd" required>
        </div>

      </div>
<div style="text-align:center;">
      <footer class="login__footer" >
        <input type="submit"  value="Login">
    

      </footer>
    </div>
    </form>

  </div>
</html>