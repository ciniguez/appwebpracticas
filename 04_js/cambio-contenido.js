function cambioContenidoElementoHTML(){
    const arrayElemnetos = document.querySelectorAll('.miclase');
    
    arrayElemnetos.forEach( elemento => {
        elemento.textContent ="Hola soy Carlos";
    } );

    /*
    function miFuncion( elemento ){
        elemento.textContent ="Hola soy Carlos";
    }

    var miFuncion = elemento => {
        elemento.textContent ="Hola soy Carlos";
    }
        */
}

function tieneAtributo(){
    var imagen = document.querySelector('img');
    console.log(imagen.hasAttribute('src'));
}
function obtenerAtributo(){
    var imagen = document.querySelector('img');
    console.log(imagen.getAttribute('src'));
}
function removerAtributo(){
    var imagen = document.querySelector('img');
    imagen.removeAttribute('src');
}
function configurarAtributo(){
    var imagen = document.querySelector('img');
    imagen.setAttribute('src', "https://picsum.photos/id/238/200/300");
}

function mostrar(){
    var elemento = document.querySelector('#div_ejemplo');
    elemento.classList.replace('ocultar', 'mostrar');
}
function ocultar(){
    var elemento = document.querySelector('#div_ejemplo');
    elemento.classList.replace('mostrar', 'ocultar');
}
function agregarClase(){
    var elemento = document.querySelector('#div_ejemplo');
    elemento.classList.add('cajaroja');
}
function removerClase(){
    var elemento = document.querySelector('#div_ejemplo');
    if(elemento.classList.contains('cajaroja')){
        elemento.classList.remove('cajaroja');
    }
}