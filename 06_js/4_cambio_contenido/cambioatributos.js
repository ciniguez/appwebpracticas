function tieneAtributo(){
    var imagen= document.querySelector('img');   
    console.log( imagen.hasAttribute('src')); 
}
function obtener(){
    var imagen= document.querySelector('img');   
    console.log(imagen.getAttribute('src'));
}
function eliminar(){
    var imagen= document.querySelector('img');
    imagen.removeAttribute('src');
}
function setear(){
    var imagen= document.querySelector('img');
    imagen.setAttribute('src', 'https://picsum.photos/200/300?grayscale');
}
