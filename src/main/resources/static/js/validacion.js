document.addEventListener('DOMContentLoaded', function () {
    const form = document.getElementById('form-contacto');
    if (!form) return;

    const campos = {
        nombre: document.getElementById('nombre'),
        correo: document.getElementById('correo'),
        telefono: document.getElementById('telefono'),
        asunto: document.getElementById('asunto'),
        mensaje: document.getElementById('mensaje')
    };

    const errores = {
        nombre: document.getElementById('error-nombre'),
        correo: document.getElementById('error-correo'),
        telefono: document.getElementById('error-telefono'),
        asunto: document.getElementById('error-asunto'),
        mensaje: document.getElementById('error-mensaje')
    };

    const contadorMensaje = document.getElementById('contador-mensaje');
    const confirmacion = document.getElementById('confirmacion');

    function mostrarError(campo, mensaje) {
        errores[campo].textContent = mensaje;
        campos[campo].classList.add('invalido');
    }

    function limpiarError(campo) {
        errores[campo].textContent = '';
        campos[campo].classList.remove('invalido');
    }

    function validarNombre() {
        const valor = campos.nombre.value.trim();
        if (valor.length < 3) {
            mostrarError('nombre', 'El nombre debe tener al menos 3 caracteres y no puede estar vacío.');
            return false;
        }
        limpiarError('nombre');
        return true;
    }

    function validarCorreo() {
        const valor = campos.correo.value.trim();
        const regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        if (!regex.test(valor)) {
            mostrarError('correo', 'Ingresa un correo válido, por ejemplo nombre@dominio.com.');
            return false;
        }
        limpiarError('correo');
        return true;
    }

    function validarTelefono() {
        const valor = campos.telefono.value.trim();
        const regex = /^[0-9]{7,15}$/;
        if (!regex.test(valor)) {
            mostrarError('telefono', 'El teléfono debe contener solo números, entre 7 y 15 dígitos.');
            return false;
        }
        limpiarError('telefono');
        return true;
    }

    function validarAsunto() {
        const valor = campos.asunto.value;
        if (!valor) {
            mostrarError('asunto', 'Selecciona un motivo de contacto.');
            return false;
        }
        limpiarError('asunto');
        return true;
    }

    function validarMensaje() {
        const valor = campos.mensaje.value.trim();
        const min = 20;
        const max = 400;
        if (valor.length < min) {
            const faltan = min - valor.length;
            mostrarError('mensaje', `Faltan ${faltan} caracteres para llegar al mínimo de ${min}.`);
            contadorMensaje.textContent = `Faltan ${faltan} caracteres`;
            return false;
        }
        if (valor.length > max) {
            mostrarError('mensaje', `Te excediste por ${valor.length - max} caracteres (máximo ${max}).`);
            return false;
        }
        limpiarError('mensaje');
        contadorMensaje.textContent = `${valor.length}/${max} caracteres`;
        return true;
    }

    campos.nombre.addEventListener('input', validarNombre);
    campos.correo.addEventListener('input', validarCorreo);
    campos.telefono.addEventListener('input', validarTelefono);
    campos.asunto.addEventListener('change', validarAsunto);
    campos.mensaje.addEventListener('input', validarMensaje);

    form.addEventListener('submit', function (evento) {
        evento.preventDefault();
        confirmacion.hidden = true;

        const validaciones = [
            validarNombre(),
            validarCorreo(),
            validarTelefono(),
            validarAsunto(),
            validarMensaje()
        ];

        const esValido = validaciones.every(Boolean);

        if (esValido) {
            confirmacion.hidden = false;
        } else {
            confirmacion.hidden = true;
        }
    });
});