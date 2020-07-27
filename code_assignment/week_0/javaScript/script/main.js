window.addEventListener("load", function(){
	var inputMessage = document.getElementById('input_message');
	var inputCount = document.getElementById('input_count');
	var buttonPrint = document.getElementById('button_print');
	var outputContxt = document.getElementById('contxt');

	buttonPrint.addEventListener("click",function(){
		createElements(inputCount.value, inputMessage.value, outputContxt);
	});
});

function createElements(count, message, outputContxt) {
	var i;
	for (i = 0; i < count; i++) {
		var pTag = document.createElement("p");
		var text = document.createTextNode(message);
		pTag.appendChild(text);
		outputContxt.appendChild(pTag);
	}
}