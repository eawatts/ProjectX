// When the page is loaded, check which navigation to show.
$(document).ready(function() {
  displayHeader();
  $(".button-burger-nav").click(function(){
	    $(".button-burger-nav").toggleClass("button-burger-nav-selected");
	    $(".mobile-nav-menu").slideToggle("slow", null);
	  });
});

// Whenever the window screen size changes, check which navigation to show.
$(window).resize(function() {
  displayHeader();
});

// Will get the width of the window, and see if it is less than
//  992px (Mobile Size), and will swap the navigation as fit.
function displayHeader() {
  if ($(window).width() <= 992){
	$("#header-mobile").show();
    $("#nav-desktop").hide();
    $("#header-desktop").hide();
  } else {
	$("#header-mobile").hide();
    $("#nav-desktop").show();
    $("#header-desktop").show();
  }
}