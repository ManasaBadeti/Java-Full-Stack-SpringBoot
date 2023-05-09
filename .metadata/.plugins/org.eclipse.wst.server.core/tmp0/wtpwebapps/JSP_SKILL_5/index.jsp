<html>

<style>
nav {
	margin: 27px auto 0;

	position: relative;
	width: 590px;
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
	width: 170px;
}
a:nth-child(3) {
	width: 150px;
}
a:nth-child(4) {
	width: 160px;
}

nav .start-home, a:nth-child(1):hover~.animation {
	width: 110px;
	left: 0;
	background-color:	Crimson;
}
nav .start-about, a:nth-child(2):hover~.animation {
	width: 170px;
	left: 110px;
	background-color:SeaGreen;
}
nav .start-blog, a:nth-child(3):hover~.animation {
	width: 150px;
	left: 280px;
	background-color: Goldenrod;
}
nav .start-portefolio, a:nth-child(4):hover~.animation {
	width: 160px;
	left: 430px;
	background-color:IndianRed;
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
<h1 >JSP Application For JFSD Skilling-5</h1>

<nav>
	<a href="index.jsp">Home</a>
	<a href="reg.html">User Registration</a>
	<a href="userlogin.html">User Login</a>
	<a href="adminlogin.html">Admin</a>
	<div class="animation start-home"></div>
</nav>


</html>