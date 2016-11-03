$(document).ready(function() {
	var accordions = document.getElementsByClassName("accordion-header");
	
	var i;
	for(i = 0; i < accordions.length; i++) {
		accordions[i].onclick = function() {
			this.classList.toggle("active");
			this.nextElementSibling.classList.toggle("show");
		}
	}
});