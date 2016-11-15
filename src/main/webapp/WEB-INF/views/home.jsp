<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello ${user.name}!</h1> <a href="logout">logout</a>
	<c:set var="contains" value="false" />
	<c:forEach var="item" items="${user.roles}">
		<c:if test="${item eq 'ADMINISTRATOR'}">
			<c:set var="contains" value="true" />
		</c:if>
	</c:forEach>
	<table>
			<tr>
				<td>Project</td>
				<c:if test="${contains}">
					<td><a href="add-project.html">Create</a></td>
				</c:if>
			</tr>
			<tr>
				<td></td>
				<td>
					<form action="projects">
						<input type="submit" value="Get All" />
					</form>
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<form action="projects/status">
						<input type="text" name="status" placeholder="Find By Status"/>
						<input type="submit" value="Get All" />
					</form>
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<form action="projects/skill">
						<input type="text" name="resource" placeholder="Find By Resource"/>
						<input type="submit" value="Get All" />
					</form>
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<form action="projects/keyword">
						<input type="text" name="keyword" placeholder="Find By Keyword/Location"/>
						<input type="submit" value="Get All" />
					</form>
				</td>
			</tr>
			<c:if test="${contains}">
				<tr>
					<td>Volunteer</td>
					<td>
						<form action="volunteers/search">
						<input type="text" name="id" placeholder="Find By ID"/>
						<input type="submit" value="Get All" />
					</form>
					</td>
				</tr>
			</c:if>
		
	</table>


<!-- <form action="tasks">
						<input type="text" name=""/>
						<input type="submit" value="Tasks" />
					</form> -->
</body>
</html>
