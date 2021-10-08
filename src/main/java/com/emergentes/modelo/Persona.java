package com.emergentes.modelo;

public class Persona {

    private int id;
    private String nombres;
    private String apellidos;
    private String categoria;
    private String fecha;
    private boolean confirmado;
    //private int edad;

    public Persona() {
        this.id = 0;
        this.nombres = "";
        this.apellidos = "";
        this.categoria = "";
        this.confirmado=false;
        this.fecha = "";

        //this.edad = 0;
    }

    public boolean isConfirmado() {
        return confirmado;
    }

    public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }

    

    public int getId() {
        return id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

   /* public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }*/

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
