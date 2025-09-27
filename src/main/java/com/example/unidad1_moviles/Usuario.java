package com.example.unidad1_moviles;

import com.orm.SugarRecord;

public class Usuario extends SugarRecord {

    private String usuario;
    private String contraseña;

    public Usuario(String usuario,String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Usuario() {
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}

