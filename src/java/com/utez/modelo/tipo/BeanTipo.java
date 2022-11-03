/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utez.modelo.tipo;

/**
 *
 * @author lfern
 */
public class BeanTipo {

    private int idTipo;
    private String nombreTipo;
    private String descripcion;

    public BeanTipo(int idTipo, String nombreTipo, String descripcion) {
        this.idTipo = idTipo;
        this.nombreTipo = nombreTipo;
        this.descripcion = descripcion;
    }

    public BeanTipo() {

    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
