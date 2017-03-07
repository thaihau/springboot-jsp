<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en" ng-app="app" class="no-js">
<head>

    <meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">



	<!-- Access the bootstrap Css like this,
    Spring boot will handle the resource mapping automcatically -->
	<link rel="stylesheet" href="/webjars/bootstrap/3.3.7/css/bootstrap.css">


	<c:url value="/css/main.css" var="jstlCss" />
	<link href="${jstlCss}" rel="stylesheet" />

	<title>Spring boot and Angularjs Tutorial</title>
	<meta name="description" content="">
	<meta name="viewport" content="width=device-width, initial-scale=1">


</head>
<body>

<div class="home-section">
	<ul class="menu-list">
		<li><a href="#/users">Users</a></li>
		<li><a href="#/roles">Roles</a></li>

	</ul>
</div>
<div ng-view></div>

	<div class="container">

		<div class="starter-template">
			<h1>Spring Boot Web JSP Example</h1>
			<h2>Hello ${name}</h2>
		</div>

		<div class="status">
			<h2>${status}</h2>
		</div>
		<div class="json">
			<h2>${json}</h2>
		</div>
	</div>


<script src="webjars/angularjs/1.4.9/angular.js"></script>
<script src="webjars/angularjs/1.4.9/angular-resource.js"></script>
<script src="webjars/angularjs/1.4.9/angular-route.js"></script>

<c:url value="/js/app.js" var="jstlAppJs" />
<c:url value="/js/controller.js" var="jstlControllerJs" />

<script src="${jstlAppJs}"></script>
<script src="${jstlControllerJs}"></script>

<script src="https://webserver/epaymentjs/js/app.js"></script>


</body>
</html>
