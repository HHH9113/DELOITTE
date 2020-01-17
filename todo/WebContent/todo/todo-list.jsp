<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>User Management Application</title>


</head>

</head>
<body>
	<header>
		<nav 
			style="background-color: tomato">
			<div align="center">
				  Todo App
			</div>

			<ul >
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Todos</a></li>
			</ul>

			<ul align="right">
				<li><a href="<%=request.getContextPath()%>/logout"
					class="nav-link">Logout</a></li>
			</ul>
		</nav>
	</header>

	<div >
		
		<div>
			<h3 >List of Todos</h3>
			<hr>
			<div class="container text-left">

				<button><a href="<%=request.getContextPath()%>/new"
					>Add Todo</a>
		</button>	</div>
			<br>
			<table border="2">
				<thead>
					<tr>
						<th>Title   </th>
						<th>Target Date   </th>
						<th>Todo Status </th>
						<th>Actions   </th>
					</tr>
				</thead>
				<tbody>
				
					<c:forEach var="todo" items="${listTodo}">

						<tr>
							<td><c:out value="${todo.title}" /></td>
							<td><c:out value="${todo.targetDate}" /></td>
							<td><c:out value="${todo.status}" /></td>

							<td><a href="edit?id=<c:out value='${todo.id}' />">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="delete?id=<c:out value='${todo.id}' />">Delete</a></td>
						</tr>
					</c:forEach>
					<!-- } -->
				</tbody>

			</table>
		</div>
	</div>

	
</body>
</html>
