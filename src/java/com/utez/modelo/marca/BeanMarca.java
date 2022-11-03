/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utez.modelo.marca;

/**
 *
 * @author lfern
 */
public class BeanMarca {
    private int idMarca;
    private String nombreMarca;
    private int telefono;
    private String direccion;
    private String correo;

    public BeanMarca(int idMarca, String nombreMarca, int telefono, String direccion, String correo) {
        this.idMarca = idMarca;
        this.nombreMarca = nombreMarca;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
    }
    public BeanMarca(){
        
    }
    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
