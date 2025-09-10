// Función para añadir un valor al campo de texto
function appendToDisplay(value) {
    document.getElementById('display').value += value;
}

// Función para borrar todo el contenido del campo de texto
function clearDisplay() {
    document.getElementById('display').value = '';
}

// Función para calcular el resultado de la operación introducida
function calculate() {
    var result;
    try {
        result = eval(document.getElementById('display').value);
    } catch (error) {
        result = 'Error';
    }
    document.getElementById('display').value = result;
}
