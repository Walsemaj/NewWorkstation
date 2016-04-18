<!DOCTYPE html>
<html>
<body>
<h2>Read JSON File</h2>
	<div id="id01"></div>

	<script>
		var xmlhttp = new XMLHttpRequest();
		var url = "/testGsonJson/collect/";

		xmlhttp.onreadystatechange = function() {
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
				myFunction(xmlhttp.responseText);
			}
		}
		xmlhttp.open("GET", url, true);
		xmlhttp.send();

		function myFunction(response) {

			var obj = JSON.parse(response);	

			var arr = obj.list
			var out = "<table>";

			for (i = 0; i < arr.length; i++) {
				out += "<tr><td>" + arr[i] + "</td></tr>";
			}
			out += "</table>";
			
			document.getElementById("id01").innerHTML = obj.data1 + " " + obj.data2 + " " + out;
		}
	</script>

</body>
</html>
	</script>