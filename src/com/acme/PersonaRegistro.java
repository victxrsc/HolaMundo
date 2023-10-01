package com.acme;

public record PersonaRegistro(String nombre, String apellidos) {
    @Override
    public String toString() {
        //Comentario para eliminar línea
        System.out.println("Esta instrucción no sirve");
        return "%s %s".formatted(nombre,apellidos);
    }
}
