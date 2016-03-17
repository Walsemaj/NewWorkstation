<!DOCTYPE html>
<html>
<head>
</head>
<body>

<script>
function clickCounter() {
	if(typeof(Storage) !== "undefined") {
		if(sessionStorage.userclickcount) {
			sessionStorage.userclickcount = Number(sessionStorage.userclickcount) + 1;
		} else {
			sessionStorage.userclickcount = 1;
		}
		
		document.getElementById("result").innerHTML = "You have clicked the button " + sessionStorage.userclickcount + " times.";
	} else {
		document.getElementById("result").innerHTML = "Sorry, your browser doesn not support web storage.";
	}
}
</script>

<p><button onclick="clickCounter()" type="button">click me</button></p>

<div id="result"></div>

</body>
</html>