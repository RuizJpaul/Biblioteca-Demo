function abrirModal() {
    document.querySelector("#miModal").classList.remove('hidden');
}

function cerrarModal() {
    document.querySelector("#miModal").classList.add('hidden');
}

// Esperar 4 segundos y luego ocultar el mensaje con animación
setTimeout(() => {
    const mensaje = document.getElementById('mensajeError');
    if (mensaje) {
        mensaje.style.opacity = '0';
        setTimeout(() => mensaje.remove(), 1000); // Eliminar del DOM después
    }
}, 4000); // 4000 ms = 4 segundos