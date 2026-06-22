function recursividad(nodo) {
    var arrayNodos = nodo.childNodes;
    arrayNodos.forEach(element => {
        console.log("==========");
        console.log("Tipo :" + element.nodeType +
            " Nombre: " + element.nodeName +
            " Valor: " + element.nodeValue);

        if (element.hasChildNodes) {
            recursividad(element);
        }
    });
}

function creacionDinamica() {
    // Crear un nodo de tipo Element
    var parrafo = document.createElement("p");
    parrafo.setAttribute("id", "miparrafo");
    // Crear un nodo de tipo text
    var texto = document.createTextNode("Hola!");

    parrafo.appendChild(texto);

    document.getElementById("contenedor").appendChild(parrafo);

}
function eliminacionDinamica() {
    document.getElementById("contenedor").
    removeChild(
        document.getElementById("miparrafo")
    );


}
function cargarFichero(){

    var htr = new XMLHttpRequest();
    htr.open("GET","ficheroJSON.json", true);
    htr.responseType = "json";
    htr.onreadystatechange = function(){
        if(this.readyState == 4 && this.status == 200){
            console.log(this.response);

            var elementoUL = document.createElement("ul");

            this.response.list.forEach( elemento => {
                var li = document.createElement("li");
                var texto =document.createTextNode(elemento.item);

                li.appendChild(texto);
                elementoUL.appendChild(li);
            });

            document.getElementById("datos").appendChild(elementoUL);
        }
    }
    htr.send();
}