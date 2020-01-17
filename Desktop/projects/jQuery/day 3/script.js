	var DataArray, ValidatedFirstName, ValidatedLastName, ValidatedEmail;
	DataArray = document.forms["NewForm"];
function FirstNameValidator(){
	ValidatedFirstName = DataArray.elements[0].value;
	document.getElementById("ValidatedFirstName").innerHTML= ValidatedFirstName + " is your FirstName. " ;
	document.getElementById("FirstName").style.border ="2px solid green";
}
function LastNameValidator(){
	ValidatedLastName = DataArray.elements[1].value;
	document.getElementById("ValidatedLastName").innerHTML= ValidatedLastName + " is your LastName. " ;
	document.getElementById("LastName").style.border ="2px solid green";
}
function EmailValidator(){
	ValidatedEmail = DataArray.elements[2].value;
	document.getElementById("ValidatedEmail").innerHTML= ValidatedEmail + " is your Email. " ;
	document.getElementById("Email").style.border ="2px solid green";
}