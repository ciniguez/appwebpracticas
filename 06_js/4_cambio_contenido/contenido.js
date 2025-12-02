function cambiarContenido() {
    const arrayElements = document.querySelectorAll('.miclase');

    arrayElements.forEach(elemento => 
        elemento.textContent = "Cambiado!!");

}

