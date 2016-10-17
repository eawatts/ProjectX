function getStars(numStars){

          for(i=0;i<numStars;i++){
          img_create(../assets/star.png, star, Rating)
          }

}

function img_create(src, alt, title) {
    var img= IEWIN? new Image() : document.createElement('img');
    img.src= src;
    if (alt!=null) img.alt= alt;
    if (title!=null) img.title= title;
    return img;
}