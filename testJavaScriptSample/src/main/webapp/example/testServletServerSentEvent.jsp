<!DOCTYPE HTML>
<html>
<head>
<script>
	var eventSource;

	function start() {

		window.alert("start()");

		if (typeof (eventSource) == "undefined") {
			eventSource = new EventSource("../HelloServlet");
		}

		eventSource.addEventListener('up_vote', function(event) {
			document.getElementById('up').innerHTML = event.data;
		}, false);

		eventSource.addEventListener('down_vote', function(event) {
			document.getElementById('down').innerHTML = event.data;
		}, false);
		
		eventSource.onmessage = function(event) {
			document.getElementById("foo").innerHTML = event.data;
		};

		eventSource.onerror = function(e) {
			  alert("EventSource failed.");
			};
	}

	function stopEventSource() {
		eventSource.close();
		eventSource = undefined;
	}
</script>
</head>
<body>
	Time2:
	<output id="foo"></output>
	<br>
		up vote: <output id="up"></output>
		down vote: <output id="down"></output>
	<br>
	<button onclick="start()">Start</button>
	<br>
	<button onclick="stopEventSource()">Stop</button>

	<a href="../HelloServlet">Execute</a>
	<!-- Test Servlet URL -->

</body>
</html>