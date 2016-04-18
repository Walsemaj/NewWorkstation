<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
<div class="table-responsive">
	<h2>Spring Json Transmission</h2>

	<c:if test="${not empty page}">
		<br>
		<table class=table>
		<tr><td><a href="/testGsonJson/home/error">Error</a></td></tr>
		<tr><td><a href="/testGsonJson/home/io-error">IO-Error</a></td></tr>
		<tr><td><a href="/testGsonJson/home/Anything">Result of Typing Anything</a></td></tr>
		<tr><td class=info><a href="/testGsonJson/home/object2JsonFormattedString">Return Json Formatted String (Server Side: Java Object to Json Formatted String)</a></td></tr>
		<tr><td class=info><a href="/testGsonJson/home/textFile2JsonFormattedString">Return Json Formatted String (Server Side: Text File to Java Object to Json Formatted String)</a></td></tr>
		<tr><td class=info><a href="/testGsonJson/home/collectJsonFile">Return String from backend Json File thru AJAX</a></td></tr>
		</table>
	</c:if>

	<c:if test="${not empty msg}">
		<h2>${msg}</h2>
	</c:if>
</div>
</body>
</html>
