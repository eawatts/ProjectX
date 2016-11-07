function showonlyone(thechosenheading) {
	$('.option').each(function(index) {
          if ($(this).attr("id") == thechosenheading) {
               $(this).show(200);
          }
          else {
               $(this).hide(600);
          }
     });
}



function showonlyonesub(thechosenoption) {
	$('.suboption').each(function(index) {
          if ($(this).attr("id") == thechosenoption) {
               $(this).show(200);
          }
          else {
               $(this).hide(600);
          }
     });
}