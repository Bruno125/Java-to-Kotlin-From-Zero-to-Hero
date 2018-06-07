package com.example.avantica.myapplication;

/// Bruno Aybar

public class Seccion5_Java {

    private String nombre;
    private String apellido;
    private int edad;

    private void test() {

    }


    public Seccion5_Java() { }

    public Seccion5_Java(String nombre) {
        this.nombre = nombre;
    }

    public Seccion5_Java(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        apellido = null;
    }

    public Seccion5_Java(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}