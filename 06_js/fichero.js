function saludar(){
    console.log("Hola desde el fichero externo");
}
/** Uso de selectores */
var elemento =document.getElementById("mielemento");
console.log(elemento.textContent);

console.log("==========");
var elementosClass = document.getElementsByClassName("clase");
for( var i= 0; i<elementosClass.length; i++){
    console.log(elementosClass[i].textContent);
}
console.log("===========");
var elementosTag = document.getElementsByTagName("p");
for(var j = 0; j< elementosTag.length; j++){
    console.log(elementosTag[j].textContent);
}

console.log("==== QuerySelector=======");
var pQuerySelector =document.querySelector("#principal p");
console.log(pQuerySelector.textContent);
console.log("====== QuerySelectorALL =====");
var pQuerySelectorAll = document.querySelectorAll("#principal p");
for(h=0; h<pQuerySelectorAll.length; h ++){
    console.log(pQuerySelectorAll[h].textContent);
}

console.log("====Forma 2 (propiedades) de manejadores====");
var forma2 = document.getElementById("forma2");
forma2.onclick=saludar;

console.log("====Forma 3 (addEventListener) de manejadores====");
var forma3 = document.getElementById("forma3");
forma3.addEventListener('click',saludar);

console.log("====TAREA====");
var elm = document.getElementById("nombre");
//elm.onclick = saludar2(elm.textContent);
elm.onclick = function (){
    console.log("Hola " + this.textContent);
}



function saludar2 (nombre){
    console.log("Hola " + nombre);
}



