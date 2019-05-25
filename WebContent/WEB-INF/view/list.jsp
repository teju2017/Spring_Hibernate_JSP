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

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Data value check</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>Student Name</th>
					<th>Student ID</th>
					<th>Email ID</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempCustomer" items="${Studentdata}">
				
					<tr>
						<td> ${tempCustomer.id} </td>
						<td> ${tempCustomer.name} </td>
						<td> ${tempCustomer.email} </td>
					</tr>
					
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	

</body>

</html>









