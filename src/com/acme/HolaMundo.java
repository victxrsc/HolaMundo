package com.acme;

public class HolaMundo {
    public static void main(String[] args) {
        Mensaje mensaje = new Mensaje();
        String nombre = mensaje.solicitarDatos("Escribe tu nombre:");
        mensaje.saludar(nombre);

    }
}
