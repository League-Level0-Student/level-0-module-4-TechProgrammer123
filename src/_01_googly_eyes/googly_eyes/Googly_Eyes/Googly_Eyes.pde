void setup()  {
size(800,600);
 
}
void draw(){
   PImage eyes = loadImage("eyes.jpeg");
  eyes.resize(800,600);
    background(eyes);
 fill(#FFFCFC);
  ellipse(225,300, 325,325);
fill(#000000);
  ellipse(mouseX,mouseY,150,150);
  
  fill(#FFFCFC);
  ellipse(600,300, 325,325);
fill(#000000);
  ellipse(mouseX+375,mouseY,150,150);
if(mouseX < 63){
  mouseX= 63;
}
  if (mouseX>387){
    mouseX = 387;
  }
 if(mouseY < 250){
  mouseY= 250;
}
  if (mouseY>400){
    mouseY = 400;
  }
}