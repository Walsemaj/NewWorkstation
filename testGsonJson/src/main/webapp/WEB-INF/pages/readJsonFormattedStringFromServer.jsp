<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h2>Spring MVC @ExceptionHandler Example</h2>
	<p id="demo"></p>
	<script>
		console.log(${msg});
		var obj = ${msg};
		document.getElementById("demo").innerHTML = obj.data1 + "<br>"
				+ obj.data2 + "<br>" + obj.list + "<br> ${labelname}";				
		console.log(JSON.stringify(${msg}));		
	</script>
</body>
</html>
