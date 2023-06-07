<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Sri Durga Furniture</title>
<link rel="stylesheet" type="text/css" href="style2.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>

<body>
<header class="pro-bg">
	<nav>
		<div class="row-m clearfix">
			<img class="logo" src="images/logo2.png">
			<ul class="main-nav animated slideInDown" id="check-class">
				<li><a href="index.jsp">Home</a></li>
			    <li><a href="service.jsp">Services</a></li>
			    <li><a href="project.jsp">Projects</a></li>
			    <li><a href="about.jsp">About us</a></li>
			</ul>
			<a href="#" class="mob-icon" onClick="slidShow()">
				<i class="fa fa-bars"></i>
			</a>
		</div>
	</nav>
	<div class="head-content">
	   <h1><span class="blink">SRI DURGA FURNITURE WORKS</span>.</h1>
	   <h2>YOUR DREAMS, OUR PROJECTS</h2>
	   <h3>WE ARE HERE TO CONVERT YOUR BEAUTIFUL DREAMS INTO REALITY.</h3>
	</div>
	
</header><hr>

<div class="fworks">
	
		<table class="fwtext" border="0" align="center" cellspacing="15px">
		<th colspan="3">
			<h1 class="fw-head">Our Projects</h1>
		</th>
			<tr>
				<td class="img-td">
				  <a href="res.jsp" target="project">
					<img class="contimg" src="images/gallery-img3.jpg">
				  </a>
				</td>
				<td class="img-td">
				  <a href="office.jsp" target="project">
					<img class="contimg" src="images/07-large.jpg">
				  </a>
				</td>
				<td class="img-td">
				  <a href="comrcl.jsp" target="project">
					<img class="contimg" src="images/commercial.jpg">
				  </a>
				</td>
			</tr>
			<tr class="ta">
				
				<td><a href="res.jsp" target="project">RESIDENTIAL DESIGN</a></td>
	    	 	<td><a href="office.jsp" target="project">OFFICE DESIGN</a></td>
	    		<td><a href="comrcl.jsp" target="project">COMMERCIAL DESIGN</a></td>
		    </tr>
			<tr>
				<td class="iframe" colspan="4">
					<iframe src="proall.jsp" name="project" frameborder="0" width="100%" height="630px"></iframe>
				</td>
			</tr>
		</table>
</div><hr>



<div class="footer-a">
	<table class="ftable" align="center" border="0" cellspacing="7px">
		<tr align="center">
			<td><a href="www.facebook.com"><img class="fimg" src="images/Facebook.png"></a></td>
			<td><a href="www.instagram.com"><img class="fimg" src="images/Instagram.png"></a></td>
			<td><a href="www.twitter.com"><img class="fimg" src="images/Twitter.png"></a></td>
		</tr>
	</table>
</div>

<script type="text/javascript">
	function slidShow()
	{
		var x = document.getElementById('check-class');
		if(x.style.display === "none")
			{
				x.style.display="block";
			}
		else
		{
			x.style.display="none";
		}
	}
</script>
</body>
</html>