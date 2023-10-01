package com.acme;

public class HolaMundo {
    public static void main(String[] args) {
        Mensaje mensaje = new Mensaje();
        String nombre = mensaje.solicitarDatos("Escribe tu nombre:");
        String apellidos = mensaje.solicitarDatos("Escribe tus apellidos");
        Persona p1 = new Persona(nombre,apellidos);
        mensaje.saludar(p1);

    }
}
