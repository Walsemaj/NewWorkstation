<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
        function OnDragStart (event) {
            if (event.dataTransfer) {
                var format = "Text";
                var textData = event.dataTransfer.getData (format);
                    // always empty in Safari and Google Chrome
                if (textData) {
                    if (textData.length > 20) {
                        event.dataTransfer.clearData (format);
                    }
                    else {
                        var reverseText = "";
                        for (var i = 0; i < textData.length; i++) {
                            reverseText += textData.charAt (textData.length - i - 1);
                        }
                        event.dataTransfer.setData (format, reverseText);
                    }
                }
            }
        }

        function OnDropTarget (event) {
            if (event.dataTransfer) {
                var format = "Text";
                var textData = event.dataTransfer.getData (format);
                if (!textData) {
                    textData = "<span style='color:red'>The data transfer contains no text data.</span>";
                }
                
                var targetDiv = document.getElementById ("target");
                targetDiv.innerHTML = textData;
            }
            else {
                alert ("Your browser does not support the dataTransfer object.");
            }
            
            if (event.stopPropagation) {
                event.stopPropagation ();
            }
            else {
                event.cancelBubble = true;
            }
            return false;
        }
    </script>
</head>
<body>
	<div ondragstart="OnDragStart (event)"
		style="width: 300px; height: 100px; background-color: #80f0f0;">
		Select and drag some text from this field and drop into the green
		zone. The dropped text's letters will be in reverse order. The length
		of the dragged text cannot be longer than 20 characters!</div>
	<div id="target" ondragenter="return false;" ondragover="return false;"
		ondrop="return OnDropTarget (event);"
		style="width: 300px; height: 100px; background-color: #80f080;">
	</div>
</body>
</html>