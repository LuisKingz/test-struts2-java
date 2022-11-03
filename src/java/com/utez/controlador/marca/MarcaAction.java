/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utez.controlador.marca;

import static com.opensymphony.xwork2.Action.SUCCESS;
import static com.opensymphony.xwork2.Action.ERROR;
import com.utez.modelo.marca.BeanMarca;
import com.utez.modelo.marca.DaoMarca;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lfern
 */
public class MarcaAction {

    private BeanMarca bean = new BeanMarca();
    private DaoMarca dao = new DaoMarca();
    private List<BeanMarca> listaMarcas = new ArrayList<>();
    private String mensaje;

    public List<BeanMarca> getListaMarcas() {
        return listaMarcas;
    }

    public void setListaMarcas(List<BeanMarca> listaMarcas) {
        this.listaMarcas = listaMarcas;
    }

    public BeanMarca getBean() {
        return bean;
    }

    public void setBean(BeanMarca bean) {
        this.bean = bean;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String registrarMarca() {
        boolean resultado = dao.registrarMarca(bean);
        if (resultado) {
            listaMarcas = dao.consultarMarca();
            return SUCCESS;
        } else {
            mensaje = "No se registro la marca";
            return ERROR;
        }
    }

    public String consultarMarca() {
        listaMarcas = dao.consultarMarca();
        return SUCCESS;
    }

}
