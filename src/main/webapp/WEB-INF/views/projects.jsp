<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Projects</title>
		<meta charset="UTF-8"/>
	</head>
	<body>
		<h1>Projects</h1>
		<table>
			<thead>
				<tr>
					<th>ID</th>
					<th>Description</th>
					<th>Location</th>
					<th>Start Date</th>
					<th>End Date</th>
					<th>Status</th>
					<th>Tasks</th>
					<th>Pictures</th>
					<th>Beneficiaries</th>
					<th>Options</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="prj" items="${prjs}">
					<tr>
						<td>${prj.projectId}</td>
						<td>${prj.desciption}</td>
						<td>${prj.location}</td>
						<td>${prj.startDate}</td>
						<td>${prj.endDate}</td>
						<td>${prj.status}</td>
						<td>
							<ul>
								<c:forEach var="task" items="${prj.tasks}">
									<li>${task.taskId} - ${task.description}</li>
								</c:forEach>
							</ul>
						</td>
						<td>
							<%-- <ul>
								<c:forEach var="picture" items="${prj.pictures}">
									<li>${picture.pictureId}</li>
								</c:forEach>
							</ul> --%>
						</td>
						<td>
							<%-- <ul>
								<c:forEach var="beneficiary" items="${prj.beneficiaries}">
									<li>${beneficiary.beneficiaryId} - ${beneficiary.beneficiary}</li>
								</c:forEach>
							</ul> --%>
						</td>
						<td></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>