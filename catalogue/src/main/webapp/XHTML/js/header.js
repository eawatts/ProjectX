// When the page is loaded, check which navigation to show.
$(document).ready(function() {
  displayHeader();
});

// Whenever the window screen size changes, check which navigation to show.
$(window).resize(function() {
  displayHeader();
});

// Will get the width of the window, and see if it is less that
//  600px (Mobile Size), and will swap the navigation as fit.
function displayHeader() {
  if ($(window).width() <= 992){
    $("#nav-desktop").hide();
    $("#header-mobile").show();
    $("#header-desktop").hide();
  } else {
    $("#nav-desktop").show();
    $("#header-mobile").hide();
    $("#header-desktop").show();
  }
}

jQuery(function($){
  $(".button-burger-nav").click(function(){
    $(".button-burger-nav").toggleClass("button-burger-nav-selected");
    $(".mobile-nav-menu").slideToggle("slow", null);
  })
})
