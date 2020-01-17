<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@  taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
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
					>Todos</a></li>
			</ul>

			<ul>
				<li><a href="<%=request.getContextPath()%>/logout"
				>Logout</a></li>
			</ul>
		</nav>
	</header>
	<div>
		<div >
			<div >
				<c:if test="${todo != null}">
					<form action="update" method="post"  modelAttribute="toDo">
				</c:if>
				<c:if test="${todo == null}">
					<form action="insert" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${todo != null}">
            			Edit Todo
            		</c:if>
						<c:if test="${todo == null}">
            			Add New Todo
            		</c:if>
					</h2>
				</caption>

				<c:if test="${todo != null}">
					<input type="hidden" name="id" value="<c:out value='${todo.id}' />" />
				</c:if>

				<fieldset >
					<label>Todo Title</label> <input type="text"
						value="<c:out value='${todo.title}' />" 
						name="title" required="required" minlength="5">
				</fieldset>

				<fieldset >
					<label>Todo Decription</label> <input type="text"
						value="<c:out value='${todo.description}' />" 
						name="description" minlength="5">
				</fieldset>

				<fieldset >
					<label>Todo Status</label> <select 
						name="isDone">
						<option value="false">In Progress</option>
						<option value="true">Complete</option>
					</select>
				</fieldset>

				<fieldset >
					<label>Todo Target Date</label> <input type="date"
						value="<c:out value='${todo.targetDate}' />" 
						name="targetDate" required="required">
				</fieldset>

				<button type="submit">Save</button>
				</form>
			</div>
		</div>
	</div>

</body>
</html>
