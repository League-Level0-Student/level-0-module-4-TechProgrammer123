import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch
PImage donkey;
PImage tail;
int x = mouseX;
int y = mouseY;
void setup(){
  donkey = loadImage("donkey.jpg");      //change the file name if you need to
tail = loadImage("tail.png");      //change the file name if you need to
size(550, 406);     //replace width, height with your picture's dimensions

}

void draw() {
 
  background (#FFFFFF);

tail.resize(125, 118);     //replace width, height with your tail's dimensions
rect(0, 0, 30, 30);
rect(454, 75, 40, 40);
if(dist(0, 0, mouseX, mouseY) < 30){
  background (donkey);
}
image(tail, mouseX,mouseY) ;
if(mousePressed){
  println("s");
  x = mouseX;
  y = mouseY;
}
image(tail, x,y) ;
if(dist(454, 75, mouseX, mouseY) < 40){
  
}
}
import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch

Minim minim = new Minim(this);     //In the setup method
woohooSound = minim.loadSample("homer-woohoo.wav");     //In setup. Change the file name if you need to

// put these lines where you want the sound to play
if (playSound) {
     woohooSound.trigger();
     playSound = false;
}}
