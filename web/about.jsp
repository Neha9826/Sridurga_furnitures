<%@page import="java.sql.*, ski.*" contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Sri Durga Furniture</title>

<!--<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">-->

<link rel="stylesheet" type="text/css" href="style2.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>

<body>
<header class="about-bg">
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
	   <h2>THEY SAY HOME IS WHERE THE HEART IS.</h2>
	   <h3>WE SAY THE HEART IS HOME WHEREIN ALL YOUR FURNITURE IS MADE TO CHERISH.</h3>
	</div>
	
</header><hr>

<div class="fworks">
	
		<table class="fwtext" border="0" bordercolor="#fff" align="center" cellspacing="15px">
		<th colspan="3">
			<h1 class="fw-head">About Us</h1>
		</th>
			<tr>
				<td rowspan="2" class="a-img"><img class="contimg" src="images/gallery-img3.jpg"></td>
				<td class="ta">Our Story</td>
			</tr>
			<tr>
				<td class="a-content" align="justify">
                                    They say home is where the heart is.Taking this further, we say the heart is home wherein all your furniture is made to cherish.We; at Sri Durga Furniture Works, have been at the forefront of the industry creating beautiful spaces for you within your homes and offices since 1985.
                </td>
			</tr>
                        <tr>
                            <td class="a-content" align="justify" colspan="3">
                                With a successful start by importing our furniture we came up with our own factories that manufactures Sofas, Beds and Chairs. We are humbled to have touched the lives of thousands of people with our range of world class home and office furniture, innovative laminates, sturdy designer doors, exquisite veneers and top-grade plywood. <br><br>
                               From being the pioneers in veneer business to being the leading furniture company and a lifestyle brand we have come a long way since then and the journey, so far, has been an enriching and memorable one.<br><br>
With our state of the art production facilities that make everything ranging from ply, laminates, veneers to sofas, chairs, beds, tables along with a whole lot more. We have scaled up our growth exponentially. This is the relentless pursuit of our vision to be one of the best interior solution providers that has made what Sri Durga is today.
<br><br>
With the advent of our new Modular Factory we have undertaken orders for institutional offices across India with some of our most prominent clients being stalwarts of the public and private sectors. Having tasted success with many turnkey projects it is our ambition to be the primary provider for premium office desking and shelving systems across India.
By challenging the way we see and do things leads us to new ideas that inspire innovations for our partners.<br><br>
We process a plethora of orders both big and small for a huge selection of materials and furniture. From happy clients in businesses to happy homes for our customers, we process a multitude of orders everyday. A dedicated team works for every platform we cater to like Institutional sales, Retail and Ecommerce.
<br><br>
It is our belief that when you purchase a piece of furniture you are creating an experience, a memory. And it is these experiences we strive to create for our valuable customers. We have received immense love from them and we strive to bring them new experiences everyday.
<br><br>
<h4>We believe in:</h4>
<br>
<h4>PASSION :</h4>
We dare to dream, we always aim higher. By constantly setting new standards in who we are and what we do, our passion will spur us on.
<br><br>
<h4>PARTNERSHIP :</h4>
We work as a team with mutual trust and shared accountability towards a common goal in a collaborative environment, to meet the needs and expectations of all stakeholders. We always stand behind our promises and act with complete integrity.
<br><br>
<h4>INNOVATION :</h4>
We are constantly seeking to exceed our previous best, with creativity and imagination. By challenging the way we see and to things, it leads to fresh perspectives and new ideas that inspire business innovation drive sustainable efficiencies and deliver superior product offerings.
<br><br>
<h4>What makes us different?</h4>
<br>

<h4>WHITE GLOVE Delivery :</h4> We provide expert technicians to assemble your furniture with care in select cities.
<br><br>
<h4>FREE Installation :</h4> We help you assemble your furniture free of cost.
<br><br>
<h4>EASY Pay :</h4> With Easy Payment Options like Cash on Delivery and EMI, shopping is more convenient. 
                            </td>
                        </tr>
			
		</table>
</div><hr>

<div class="container">
  <table class="main-tbl" border="0">
	<tr>
		<th colspan="2">Contact us</th>
	</tr>
	<tr>
		<td>
			<table class="address" border="0">
				<tr >
					<th>Address</th>
				</tr>

        <%
                    Connection con = ski.MyConnection.getConnection();
                    PreparedStatement st = con.prepareStatement("Select * from address ");
                    ResultSet rs = st.executeQuery();
                    while(rs.next()){
                    %>
		<tr>
                    <td>
                            <h2><%=rs.getString("sname")%></h2>
			<h4><%=rs.getString("desc1")%><br><br>
			<%=rs.getString("desc2")%>
			</h4><br>
			<h3>
			<%=rs.getString("adrs")%><br>
			<%=rs.getString("loc")%>
			</h3><br>
			<h4>
			<%=rs.getString("mail")%><br>
			<%=rs.getString("phn")%>
			</h4>	
                        <%
                    }
                    con.close();
                    %>
			</td>
		</tr>
			</table>
		</td>
		
		<td>
			<table class="feed" border="0">
				<tr>
					<th height="26px" colspan="2">Feedback</th>
				</tr>
				<form name="frm" action="submit.jsp" method="post">
				<tr><h2>
					<td class="lbl">*Name:</td>
					<td class="input"><input type="text" name="uname" required placeholder="eg: Mr/Miss xyz"></td>
				</tr>
				<tr>
					<td class="lbl">*Email:</td>
					<td class="input"><input type="email" name="id" required placeholder="eg: abc01@gmail.com"></td>
				</tr>
				<tr>
					<td class="lbl">*Phone &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; no:</td>
					<td class="input"><input type="number" name="number" required maxlength="12" placeholder="eg: +91 9876543210"></td>
				</tr>
				<tr>
					<td class="lbl">Messege:</td>
					<td class="input"><textarea class="txt-area" rows="4" cols="35" name="mesg"></textarea></td>
				</tr>
				<tr>
					<td class="btn-td" colspan="2"><input onClick="sendMsg()" class="btn" type="submit" name="btn"></td>
                                </tr>
                                </h2> </form>
			</table>
			
		</td>
	</tr>
  </table>
</div>

<div class="footer-a">
<table>
	<tr>
	 <td>
	   <table class="ftable" align="center" border="0" cellspacing="7px">
		<tr align="center">
			<td><a href="www.facebook.com"><img class="fimg" src="images/Facebook.png"></a></td>
			<td><a href="www.instagram.com"><img class="fimg" src="images/Instagram.png"></a></td>
			<td><a href="www.twitter.com"><img class="fimg" src="images/Twitter.png"></a></td>
		</tr>
	   </table>
	 </td>
	 <td>
	 	<table class="ad-go">
	 	  <tr>
			  <td><a href="adminlogin.jsp"><img class="faimg" src="images/switch1.png"></a></td>
	 	  </tr>
	 	</table>
	 </td>
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
	
	function sendMsg()
        {
           alert( $("#msg").text("Thank you " + $("#uname").val() + 
                    " for your time. Your messege has been successfully submited."));
        }
</script>
</body>
</html>
