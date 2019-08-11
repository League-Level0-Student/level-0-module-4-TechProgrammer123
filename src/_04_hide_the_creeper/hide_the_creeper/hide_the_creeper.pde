int x = 1200;
int y = 100;
int x1 = mouseX;
int y1 =mouseY;
 PImage creeper;     //at the top of your program
PImage minecraft;
void setup(){
 
  size(1300, 800); //in setup method
minecraft = loadImage("minecraft.png");     //in setup method
minecraft.resize(width,height);          //in setup method
background(minecraft);          //in setup method
creeper=loadImage("creeper.png");     //in setup method
creeper.resize(10, 10);     //in setup method

}
void draw(){
background(minecraft);
  image(creeper, x, y);     //in draw method

if(mousePressed){
x1 = mouseX;
y1 = mouseY;
if(isNear(mouseX,x) && isNear(mouseY,y)){
  fill(#00FF00);
  
}
else{
  fill(#FF0000);
}
}
ellipse(x1, y1, 17, 17);

}
boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}
