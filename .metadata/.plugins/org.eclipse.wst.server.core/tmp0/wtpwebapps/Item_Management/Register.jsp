<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<style>
body{
	
	background:url('back1.png'); 
	background-size: cover;
}
td{
	width:50%;	
	height:60px;
}
</style>
<script>
</script>
<script>
	function validate() {
		var username = document.form.username.value;
		var password = document.form.password.value;
		var conpassword = document.form.confirmpassword.value;
		var fullname = document.form.fullname.value;
		var nicno = document.form.nicno.value;
		var email = document.form.emailaddress.value;
		var streetaddress = document.form.streetaddress.value;
		var contactno = document.form.contactno.value;
		var regdate = document.form.regdate.value;

		if (username == null || username == "") {
			alert("Username can't be blank");
			return false;
		} else if (password == null || password == "") {
			alert("Password can't be blank");
			return false;
		} else if (password.length < 8) {
			alert("Password must be at least 8 characters long.");
			return false;
		} else if (password != conpassword) {
			alert("Confirm Password should match with the Password");
			return false;
		} else if (fullname == null || fullname == "") {
			alert("Full Name can't be blank");
			return false;
		} else if (nicno == null || nicno == "") {
			alert("NIC Number can't be blank");
			return false;
		} else if (email == null || email == "") {
			alert("Email Address can't be blank");
			return false;
		} else if (streetaddress == null || streetaddress == "") {
			alert("Street Address can't be blank");
			return false;
		} else if (contactno == null || contactno == "") {
			alert("Contact Number can't be blank");
			return false;
		} else if (regdate == null || regdate == "") {
			alert("Registered Date can't be blank");
			return false;
		}
	}
</script>
</head>
<body>
	<center>
		<h2 style="width: 100%; background-color: black; color: white;">Registration
			to the Procurement System</h2>
	</center>

	<form style="text-align: left;" name="form" action="RegisterServlet"
		method="post" onSubmit="return validate();">
		<table border="0" cellpadding="0" style="width: 100%">
			<font color="red">* These fields are required</font>
			<tr height="0px">
				<br>
				<br>
			<thead>
				<tr>
					<th colspan="2"><font color="blue">Enter Login Details
							Here</font></th>
				</tr>
			</thead>
			<td><p style="font-size: larger">Set Username *</td>
			<td><input type="text" name="username"
				placeholder="set username" class="box" autocomplete="off" required /></td>
			</tr>
			<tr height="0px">
				<td><p style="font-size: larger">Set Password *</td>
				<td><input type="password" name="password"
					placeholder="set password" class="box" autocomplete="off" required /></td>
			</tr>
			<tr height="0px">
				<td><p style="font-size: larger">Confirm Password *</td>
				<td><input type="password" name="confirmpassword"
					placeholder="confirm password" class="box" autocomplete="off"
					required /></td>
			</tr>
			<thead>
				<tr>
					<th colspan="2"><font color="blue">Enter Personal
							Details Here</font></th>
				</tr>
			</thead>
			<tr height="0px">
				<td><p style="font-size: larger">Full Name *</td>
				<td><input list="status" name="fullname"
					placeholder="full name" class="box" /></td>
				<datalist id="status">
					<select required>
						<option>Mr.</option>
						<option>Mrs.</option>
						<option>Ms.</option>
					</select>
				</datalist>
				</td>
			</tr>
			<tr height="0px">
				<td><p style="font-size: larger">NIC Number *</td>
				<td><input type="text" name="nicno" placeholder="xxxxxxxxxV"
					class="box" autocomplete="off" required /></td>
			</tr>
			<tr height="0px">
				<td><p style="font-size: larger">Email Address *</td>
				<td><input type="email" name="emailaddress"
					placeholder="email address" class="box" autocomplete="off" required /></td>
			</tr>
			<tr height="0px">
				<td><p style="font-size: larger">Street Address</td>
				<td><input type="text" name="streetaddress"
					placeholder="street address" class="box" autocomplete="off"
					required /></td>
			</tr>
			<tr height="0px">
				<td><p style="font-size: larger">Contact Number *</td>
				<td><input type="text" name="contactno"
					placeholder="contact number" class="box" autocomplete="off"
					required /></td>
			</tr>
			<tr height="0px">
				<td><p style="font-size: larger">Registered Date</td>
				<td><input type="date" name="regdate" placeholder="yyyy-MM-dd"
					class="box" autocomplete="off" required /></td>
			</tr>
			<tr>
				<td><%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%></td>
			</tr>
			<tr height="0px">
				<td><input type="submit" value="Register"></input></td>
				<td><input type="reset" value="Reset"></input></td>
			</tr>
			<tr>
				<td colspan="2"><center>
						Already registered!! <a href="Login.jsp">Login Here</a>
					</center></td>
			</tr>
		</table>
	</form>
</body>
</html>