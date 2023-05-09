<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JFSD SKILL-4</title>

<link href='https://fonts.googleapis.com/css?family=Oswald:300' rel='stylesheet' type='text/css'>
<link href='https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css' rel='stylesheet' type='text/css'>
<style type="text/css">
* {
	-webkit-transition-property: all;
	-webkit-transition-duration: .2s;
  -moz-transition-timing-function: cubic-bezier(100,50,21,6);
	-moz-transition-property: all;
  -moz-transition-timing-function: cubic-bezier(100,50,21,6);
}

body{
  background:#3e3e59;
  padding:75px;
  text-align:center;
  font-family: 'Oswald', sans-serif;
}

h1{
  color:#c0c0c0;
  font-weight:100;
  margin-top:-70px;
}

.btn{
  color:#999;
  background:rgba(0, 0, 0, 0.5);
  padding:25px 35px;
  font-size:12px;
  text-decoration:none;
  letter-spacing:2px;
  text-transform:uppercase;
}

.btn:hover{
  border:none;
  background:rgba(0, 0, 0, 0.4);
  background:#fff;
  padding:40px 50px; #000;
  color:#1b1b1b;
}


@import url('https://fonts.googleapis.com/css?family=Abel|Abril+Fatface|Alegreya|Arima+Madurai|Dancing+Script|Dosis|Merriweather|Oleo+Script|Overlock|PT+Serif|Pacifico|Playball|Playfair+Display|Share|Unica+One|Vibur');

* {
    padding: 0;
    margin: 0;
    box-sizing: border-box;
}

form {
    width: 450px;
    min-height: 350px;
    height: auto;
    border-radius: 5px;
    margin: 2% auto;
    box-shadow: 0 7px 30px hsla(20, 67%, 55%, 0.31);
    padding: 2%;
    background-image: linear-gradient(-225deg, #E3FDF5 50%, #FFE6FA 50%);
}
/* form Container */
form .con {
    display: -webkit-flex;
    display: flex;
  
    -webkit-justify-content: space-around;
    justify-content: space-around;
  
    -webkit-flex-wrap: wrap;
    flex-wrap: wrap;
  
      margin: 0 auto;
}

/* the header form form */
header {
    margin: 2% auto 10% auto;
    text-align: center;
}
/* Login title form form */
header h2 {
    font-size: 250%;
    font-family: 'Playfair Display', serif;
    color: #3e403f;
}

header p {letter-spacing: 0.05em;}



.input-item {
    background: #fff;
    color: #333;
    padding: 13px 0px 13px 7px;
    border-radius: 4px 0px 0px 4px;
}



/* Show/hide password Font Icon */
#eye {
    background: #fff;
    color: #333;
  
    margin: 5.9px 0 0 0;
    margin-left: -20px;
    padding: 12px 9px 13px 0px;
    border-radius: 0px 5px 5px 0px;
  
    float: right;
    position: relative;
    right: 1%;
    top: -.2%;
    z-index: 5;
    
    cursor: pointer;
}
/* inputs form  */
input[class="form-input"]{
    width: 240px;
    height: 40px;
  
    margin-top: 2%;
    padding: 15px;
    
    font-size: 16px;
    font-family: 'Abel', sans-serif;
    color: #5E6472;
  
    outline: none;
    border: none;
  
    border-radius: 0px 5px 5px 0px;
    transition: 0.2s linear;
    
}
input[id="txt-input"] {width: 250px;}
/* focus  */
input:focus {
    transform: translateX(-2px);
    border-radius: 5px;
}

/* input[type="text"] {min-width: 250px;} */
/* buttons  */
button {
    display: inline-block;
    color: #252537;
  
    width: 280px;
    height: 50px;
  
    padding: 0 20px;
   background: #B8F2E6;
    border-radius: 5px;
    
    outline: none;
    border: none;
  
    cursor: pointer;
    text-align: center;
    transition: all 0.2s linear;
    
    margin: 7% auto;
    letter-spacing: 0.05em;
}
/* Submits */
.submits {
    width: 48%;
    display: inline-block;
    float: left;
    margin-left: 2%;
}


/* buttons hover */
button:hover {
    transform: translatey(3px);
    box-shadow: none;
}

/* buttons hover Animation */
button:hover {
    animation: ani9 0.4s ease-in-out infinite alternate;
}
@keyframes ani9 {
    0% {
        transform: translateY(3px);
    }
    100% {
        transform: translateY(5px);
    }
}


</style>
</head>
<body>

<<h1 align=center style="font-weight:bold;font-size:50px">JSP MVC DEMO 2 ...!!!</h1><hr color="white"><br><br>
<h><h><br>
<a href="RegistrationForm.jsp" class="btn" style="font-weight:bold;font-size:15px">Registration</a>
    <a href="LoginForm" class="btn" style="font-weight:bold;font-size:15px">Login</a>
    
<br>
<br>

<div class="overlay">

<form method="post" action="register">
   <div class="con">
   <header class="head-form">
      <h2>Employee Registration</h2>
   </header>
  
   <div class="field-set">
         <span class="input-item">
           <i class="fa fa-user-circle"></i>
         </span>
         <input class="form-input" id="txt-input" type="text" placeholder="Full Name" name="name" required>
      <br>  
      
      <span class="radio-inline">
           <i class="radio-inline"></i>
         </span>
         <input class="radio-inline" value="male" type="radio" name="gender" required>Male
         &nbsp;  &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
          <input class="radio-inline" value="female" type="radio" name="gender" required>Female
        
      <br>  
      <span class="input-item">
           <i class="fa fa-user-circle"></i>
         </span>
         <input class="form-input" id="txt-input" type="text" placeholder="UserName" name="username" required>
      <br>  
      <span class="input-item">
           <i class="fa fa-envelope"></i>
         </span>
         <input class="form-input" id="txt-input" type="text" placeholder="Email" name="email" required>
      <br> 
      <span class="input-item">
        <i class="fa fa-key"></i>
       </span>
      <input class="form-input" type="password" placeholder="Password" id="pwd"  name="password" required>
     <span>
        <i class="fa fa-eye" aria-hidden="true"  type="button" id="eye"></i>
     </span>
      <br>
       
      <span class="input-item">
           <i class="fa fa-map-marker"></i>
         </span>
         <input class="form-input" id="txt-input" type="text" placeholder="location" name="location" required>
      <br>  
      <button class="log-in"> Register </button>
   </div>
  </div>
</form>
</div>

<script>// Show/hide password onClick of button using Javascript only

// https://stackoverflow.com/questions/31224651/show-hide-password-onclick-of-button-using-javascript-only

function show() {
    var p = document.getElementById('pwd');
    p.setAttribute('type', 'text');
}

function hide() {
    var p = document.getElementById('pwd');
    p.setAttribute('type', 'password');
}

var pwShown = 0;

document.getElementById("eye").addEventListener("click", function () {
    if (pwShown == 0) {
        pwShown = 1;
        show();
    } else {
        pwShown = 0;
        hide();
    }
}, false);

</script>
</body>
</html>