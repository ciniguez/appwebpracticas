/*
function mostrar(){
    let elemento = document.querySelector('#ejemplo');
    elemento.classList.replace('ocultar', 'mostrar');
}
*/
$(document).ready(function(){
    $("#btnMostrar").click( function(){
        $("#ejemplo").addClass("mostrar").removeClass("ocultar");
    });

    $("#btnOcultar").click( function(){
        $("#ejemplo").addClass("ocultar").removeClass("mostrar");
    });

    $("#btnAgregar").click( function(){
        $("#ejemplo").addClass("cajaroja");
    });

    $("#btnEliminar").on('click', removerClase );

    $("#btnObtenerDatos").on('click', obtenerDatos);

});

function removerClase(){
    let elemento = document.querySelector('#ejemplo');
    if(elemento.classList.contains('cajaroja')){
        elemento.classList.remove('cajaroja');
    }
}

function obtenerDatos(){
    $.ajax( {
        url: 'ficheroJSON.json',
        success: function( respuesta ){
            console.log(respuesta);

            //var elementoUL = document.createElement("UL");
            var elementoUL = $("<ul>");

            respuesta.list.forEach(element => {
                elementoUL.append( $("<li>").append( element.item ));
            });

            $("#datos").append(elementoUL);

        },
        error: function(){
            console.log("No se pudo obtener los datos");
        }

    });
}

/*
*************** AJAX **************
function obtenerDatos(){
            var htr =  new XMLHttpRequest();
            htr.open( "GET", "ficheroJSON.json", true);
            htr.responseType ="json";

            htr.onreadystatechange = function(){
                if(this.readyState == 4 && this.status == 200){
                    console.log(this.response);

                    var elementoUL = document.createElement("UL");
                    
                    this.response.list.forEach(element => {
                        var elementoLI = document.createElement("LI");
                        var texto = document.createTextNode(element.item);

                        elementoLI.appendChild(texto);
                        elementoUL.appendChild(elementoLI);
                    });

                    document.getElementById("datos").appendChild(elementoUL);
                } 
            }
            htr.send(); //Aquí se hace el REQUEST (solicitud)

        }
*/

