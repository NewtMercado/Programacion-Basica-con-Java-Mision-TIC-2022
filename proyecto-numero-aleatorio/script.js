let NumeroSecreto = GenerarNumeroSecreto();
console.log(NumeroSecreto);
let Intentos = 1;

document.addEventListener("DOMContentLoaded", MensajesInicio);

function AsignarTextoElemento(Elementos, Texto) {
    let ElementoHTML = document.querySelector(Elementos);
    ElementoHTML.innerHTML = Texto;
}

function VerificarIntento() {
    let NumeroUsuario = parseInt(document.getElementById("ValorUsuario").value);

    if (NumeroUsuario === NumeroSecreto) {
        AsignarTextoElemento(".texto__parrafo", "¡Felicidades! Has adivinado, después de: " + Intentos + " intento/s.");
        document.getElementById("reiniciar").removeAttribute("disabled");
    } else {
        if (NumeroUsuario > NumeroSecreto) {
            AsignarTextoElemento(".texto__parrafo", "El número secreto es menor.");
        } else {
            AsignarTextoElemento(".texto__parrafo", "El número secreto es mayor.");
        }
        Intentos++;
        LimpiarCaja();
    }
}

function GenerarNumeroSecreto() {
    return Math.floor(Math.random() * 10) + 1;
}

function LimpiarCaja() {
    document.getElementById("ValorUsuario").value = "";
}

function MensajesInicio() {
    AsignarTextoElemento("h1", "Juego del número secreto");
    AsignarTextoElemento(".texto__parrafo", "Intenta adivinar el número secreto, escribe un número del 1 al 10.");
}

function ReiniciarJuego() {
    LimpiarCaja();
    MensajesInicio();
    NumeroSecreto = GenerarNumeroSecreto(); // Actualizar el número secreto
    console.log(NumeroSecreto);
    document.getElementById("reiniciar").setAttribute("disabled", true);
    Intentos = 1;
}
