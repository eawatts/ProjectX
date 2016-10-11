
// When the page is loaded, check which navigation to show.
$(document).ready(function() {
  displayNavigation();
});

// Whenever the window screen size changes, check which navigation to show.
$(window).resize(function() {
  displayNavigation();
});


// Will get the width of the window, and see if it is less that
//  600px (Mobile Size), and will swap the navigation as fit.
function displayNavigation() {
  if ($(window).width() <= 600){
    $("#nav-mobile").show();
    $("#nav-desktop").hide();
  } else {
    $("#nav-mobile").hide();
    $("#nav-desktop").show();
  }
}

jQuery(function($){
  $('.mobile-nav-toggle').click(function(){
    $('.mobile-nav-menu').toggleClass('mobile-nav-menu-expand')
  })
})
