<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h2>Spring MVC @ExceptionHandler Example</h2>

	<c:if test="${not empty page}">
		<br><a href="error">Error</a>
		<br><a href="io-error">IO-Error</a>
		<br><a href="Anything">Anything</a>
	</c:if>

	<c:if test="${not empty msg}">
		<h2>${msg}</h2>
	</c:if>
	
	
</body>
</html>
