package com.example.unidad1_moviles;

import com.orm.SugarRecord;

public class Usuario extends SugarRecord {

    private String nombre;
    private String contraseña;

    public Usuario(String contraseña, String nombre) {
        this.contraseña = contraseña;
        this.nombre = nombre;
    }

    public Usuario() {
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



}

