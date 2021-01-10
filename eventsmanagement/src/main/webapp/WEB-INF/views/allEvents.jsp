<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Events Application</title>
<style type="text/css">
table {
  border-collapse: collapse;
  border-spacing: 0;
  width: 100%;
  border: 1px solid #ddd;
}

th, td {
  text-align: left;
  padding: 16px;
}

tr:nth-child(even) {
  background-color: lightgreen;
}
</style>
	
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-6">

				<table class="table table-striped" bgcolor="#E8FDFF" 
				border="1" align="center" >
					<thead bgcolor="lightblue">
						<tr>
							<th>eventsId</th>
							<th>eventName</th>
							<th>eventLocation</th>
							<th>eventPrice</th>
							<th>eventDate</th> 
							<th>eventDiscount</th>
							<th>ticketsBooked</th>
							<th>update</th>
							<th>delete</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="events" items="${events }">
							<tr>
                    <td>${events.id }</td>
                    <td>${events.name }</td>
                    <td>${events.location }</td>
                    <td>${events.price }</td>
                    <td>${events.date }</td> 
                    <td>${events.discount }</td>
                    <td>${events.noOfTicket }</td>
                    <td><a href="update?id=${events.id }">update</a></td>
                    <td><a href="delete?id=${events.id}">delete</a></td>
                    
                    
                   
                    </tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>

</body>
</html>