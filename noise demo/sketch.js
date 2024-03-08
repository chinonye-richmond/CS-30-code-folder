// Project Title
// Your Name
// Date
//
// Extra for Experts:
// - describe what you did to take this project "above and beyond"

let x,y;
let time=0;
let size=1;
function setup() {
  createCanvas(windowWidth, windowHeight);
  x=width/2;
  y=height/2;
}

function draw() {
  background(220);

  y=noise(time)*height;
  x=noise(time)*width;

  fill("black");
  circle(x,y,size);

  time += 0.03;
  size += 0.1;
}
