function mostrar(){
    let elemento = document.querySelector('#ejemplo');
    elemento.classList.replace('ocultar', 'mostrar');
}
function ocultar(){
    let elemento = document.querySelector('#ejemplo');
    elemento.classList.replace('mostrar', 'ocultar');
}
function agregar(){
    let elemento = document.querySelector('#ejemplo');
    elemento.classList.add('cajaroja');
}
function eliminarClase(){
    let elemento = document.querySelector('#ejemplo');
    if(elemento.classList.contains('cajaroja')){
        elemento.classList.remove('cajaroja');
    }
}