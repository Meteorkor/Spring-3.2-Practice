<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</P>
	<tiles:insertAttribute name="top_menu" />

	<tiles:insertAttribute name="include_js" />

	<input type="text" id='tex' />
	<input type="button" id='btn' value='con' />
	<script>
		$("#btn").on("click", function() {
			alert($("#tex").val());
		});
	</script>
	
</body>
</html>
