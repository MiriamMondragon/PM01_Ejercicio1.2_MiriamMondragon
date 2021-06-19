package com.example.ejercicio12;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private String apellidos;
    private int edad;
    private String email;

    public Persona(String nombre, String apellidos, int edad, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.email = email;
    }

    public Persona(Persona persona) {
        this.nombre = persona.getNombre();
        this.apellidos = persona.getApellidos();
        this.edad = persona.getEdad();
        this.email = persona.getEmail();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
