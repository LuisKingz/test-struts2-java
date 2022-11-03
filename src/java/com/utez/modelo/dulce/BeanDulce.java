/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utez.modelo.dulce;

import com.utez.modelo.marca.BeanMarca;
import com.utez.modelo.tipo.BeanTipo;

/**
 *
 * @author lfern
 */
public class BeanDulce {

    private int idDulce;
    private String nombreDulce;
    private double precio;
    private String sabor;
    private double contenidoNeto;
    private int existencia;
    private BeanTipo tipo;
    private BeanMarca marca;

    public BeanDulce(int idDulce, String nombreDulce, double precio, String sabor, double contenidoNeto, 
            int existencia, BeanTipo tipo, BeanMarca marca) {
        this.idDulce = idDulce;
        this.nombreDulce = nombreDulce;
        this.precio = precio;
        this.sabor = sabor;
        this.contenidoNeto = contenidoNeto;
        this.existencia = existencia;
        this.tipo = tipo;
        this.marca = marca;
    }

    public BeanDulce() {

    }

    public int getIdDulce() {
        return idDulce;
    }

    public void setIdDulce(int idDulce) {
        this.idDulce = idDulce;
    }

    public String getNombreDulce() {
        return nombreDulce;
    }

    public void setNombreDulce(String nombreDulce) {
        this.nombreDulce = nombreDulce;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getContenidoNeto() {
        return contenidoNeto;
    }

    public void setContenidoNeto(double contenidoNeto) {
        this.contenidoNeto = contenidoNeto;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public BeanTipo getTipo() {
        return tipo;
    }

    public void setTipo(BeanTipo tipo) {
        this.tipo = tipo;
    }

    public BeanMarca getMarca() {
        return marca;
    }

    public void setMarca(BeanMarca marca) {
        this.marca = marca;
    }

}
