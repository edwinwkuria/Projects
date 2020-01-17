function SampleFunction() {
	window.alert("This page uses JavaScript");
}
var DateTimer = setInterval(CurrentTime, 1000);

function CurrentTime(){
var Dates = Date();
document.getElementById("Display").innerHTML= Dates;
}
var RandomNumberTimer = setInterval(RandomNumber, 10000);
function RandomNumber(){
var RandomNumber, DiceNumber;
RandomNumber= Math.floor(Math.random()*(100 - 1 + 1)+ 1);
document.getElementById("Random").innerHTML= RandomNumber;
}