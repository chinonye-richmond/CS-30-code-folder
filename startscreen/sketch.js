// Project Title
// Your Name
// Date
//
// Extra for Experts:
// - describe what you did to take this project "above and beyond"

// State variable for the button
let buttonPressed = false;

// Button object to store all of the button variable together
let myButton = {x: 0, y: 0, w: 0, h: 0, color: ""}

function setup() {
  createCanvas(windowWidth, windowHeight);
  
  //Set the initial properties of myButton
  //subtract 1/2 the w and h from x and y to get true center
  myButton.w = 200;
  myButton.h = 100;
  myButton.x = width/2 - myButton.w/2;
  myButton.y = height/2 - myButton.h/2;
  myButton.color = "green";
}

function draw() {
  background(220);

  if (buttonPressed===false) {
    //Calls the myButton function in the draw loop
    drawButton();
  }
  if (buttonPressed === true){
    background(173, 216, 230);
    fill("yellow");
    circle(0,0,500);
    fill(50,205,50);
    rect(0,windowHeight-100,windowWidth,100);
    
    fill("pink");
    triangle(200,windowHeight-450,150,windowHeight-200,250,windowHeight-200);
    fill("black")
    circle(200,windowHeight-470,110)
    fill(210,180,150);
    circle(200,windowHeight-450,90);
    strokeWeight(3)
    line(230,windowHeight-200,230,windowHeight-100);  
    line(170,windowHeight-200,170,windowHeight-100);
    fill("red");
    arc(170,windowHeight-100,25,15,TWO_PI, PI,CHORD);
    arc(230,windowHeight-100,25,15,TWO_PI, PI,CHORD);
    line(175,windowHeight-330,130,windowHeight-370);
    line(130,windowHeight-370,150,400);
    ellipse(150,400,20,15);
    line(225,windowHeight-330,265,windowHeight-370);
    line(265,windowHeight-370,290,400);
    ellipse(290,400,15,20)
    
  }
}

//build in p5js funciton for mouse reactions
function mousePressed() {

  //Checks if the mouse is within the x coordinates of the button
  if (mouseX > myButton.x && mouseX < (myButton.x + myButton.w)) {

    //Switch "true" out for a similar condition that checks y coordinates
    if(mouseY > myButton.y && mouseY < (myButton.y + myButton.h)) {
      buttonPressed = true;
    }
    
  }

}


//custom function that draws the button when called
function drawButton() {
  fill(myButton.color);
  rect(myButton.x, myButton.y, myButton.w, myButton.h);
}