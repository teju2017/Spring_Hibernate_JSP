<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Customers</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<style>

input[type=submit]:hover {
    background-color: #45a049;
}

input[type=submit] {
    width: 20%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 1px 0;
    border: none;
    border-radius: 2px;
    cursor: pointer;
        text-align:center;
}

</style>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>BALANCE TRACKER DATA</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<!--  add our html table here -->
		
			<table>
				<tr>
				    <th>BALANCE ID </th>
				    <th>PLAYER ID</th>
					<th>BALANCE AMOUNT</th>
					<th>PLAYER NAME</th>
					<th>SUBMISSION DATE</th>
					<th>COMMENTS</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempCustomer" items="${balancedata}">
					<tr>
					    <td> ${tempCustomer.balanceid} </td>
					    <td> ${tempCustomer.playerid} </td>
						<td> ${tempCustomer.balance_amount} </td>
						<td> ${tempCustomer.playername} </td>
						<td> ${tempCustomer.submissionDate} </td>
						<td> ${tempCustomer.comments} </td>
					</tr>
					
				
				</c:forEach>
						
			</table>
				
		</div>
	   
	</div>
	
<br></br>	
	
<form action="getIndex" method="POST">
   <input type="submit" value="GO TO HOME" align="middle">
</form>

</body>

</html>









