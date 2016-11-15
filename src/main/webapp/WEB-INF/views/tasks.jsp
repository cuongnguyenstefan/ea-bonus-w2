<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>
<html>
<head>
<title>Tasks</title>
</head>
<body>
	<h1>Project:</h1>
	<c:set var="contains" value="false" />
	<c:forEach var="item" items="${user.roles}">
		<c:if test="${item eq 'ADMINISTRATOR'}">
			<c:set var="contains" value="true" />
		</c:if>
	</c:forEach>
	<form action="home">
		<input type="submit" value="Home" />
	</form>
	<ul>
		<li>ID: ${prj.projectId}</li>
		<li>Description: ${prj.desciption}</li>
		<li>Location: ${prj.location}</li>
	</ul>
	<h3>Tasks</h3>
	<table>
		<c:forEach var="task" items="${prj.tasks}">
			<tr>
				<td>${task.taskId}</td>
				<td>${task.description}</td>
				<td>${task.startDate}</td>
				<td>${task.endDate}</td>
				<td>
					<c:if test="${contains}">
						<form action="volunteers">
							<input type="hidden" name="taskId" value="${task.taskId}"/>
							<input type="submit" value="Volunteer" />
						</form>
					</c:if>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>