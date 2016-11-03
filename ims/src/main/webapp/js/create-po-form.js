var counter = 1;
function addInput(divName) {
	var newdiv = document.createElement('div');
	newdiv.innerHTML = "Product "
			+ (counter + 1)
			+ " <br /><div class='col-desk-4 col-tab-4'><select><ui:repeat id='product-names' var='dropdownproduct' value='#{products.products}'><option value='#{dropdownproduct.name}'><h:outputText value='#{dropdownproduct.name}'/></option>"
			+ "</ui:repeat></select></div><div class='col-desk-4 col-tab-4'><input type='text' name='myInputs[]'></div><div class='col-desk-2 col-tab-2'><input type='text' name='myInputs[]'></div><div class='col-desk-2 col-tab-2'><input type='text' name='myInputs[]'></div>";
	document.getElementById(divName).appendChild(newdiv);
	counter++;
}