document.getElementById("HeaderOne").innerHTML="The product of :";

document.getElementById("HeaderTwo").innerHTML="98 * 98";

var product=98 * 98;
function FunctionThree(){
	document.getElementById("HeaderThree").innerHTML= product;
						}

document.getElementById("HeaderFour").innerHTML="The reminder of:";

document.getElementById("HeaderFive").innerHTML="237 % 7";

var x = 237, y = 7;
var modulus = x % y;

function FunctionSix(){
	document.getElementByClassName("HeaderSix").innerHTML=modulus;
					  }

document.getElementById("paragraph").innerHTML="That is how we use JavaScript";

document.getElementById("paragraph2").innerHTML="We come back here tomorrow for more";

window.alert("Hello User Welcome to my website ");

var Number = 500;
document.getElementById("Nan").innerHTML= isNaN(Number);
document.getElementById("Number").innerHTML= Number;

function ChangeActive(){
	var select = document.getElementsByClassName("active");
	select[0].setAttribute("class","inactive");
		
}

$(document).ready(function(){
            $("h1").css("color", "#0088ff");
        });

$(document).ready(function(){
	$("#HeaderOne").css("background","yellow");
});