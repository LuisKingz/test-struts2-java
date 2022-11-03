/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utez.modelo.dulce;

import utilerias.conexion;
import com.utez.modelo.marca.BeanMarca;
import com.utez.modelo.tipo.BeanTipo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lfern
 */
public class DaoDulce {

    private Connection c;
    private PreparedStatement ps;
    private ResultSet rs;

    final String SQL_CONSULTAR_DULCE = "SELECT * FROM Dulce";
    final String SQL_AGREGAR_DULCE = "INSERT INTO Dulce(nombreDulce,marca,tipo,precio,sabor,contenidoNeto,existencias) "
            + "VALUES(?,?,?,?,?,?,?)";
    final String SQL_MODIFICAR_DULCE = "UPDATE Dulce SET nombreDulce = ?, marca = ?, tipo = ?,"
            + " precio = ?, sabor = ? , contenidoNeto = ? , existencias = ? WHERE idDulce = ? ";
    final String SQL_ELIMINAR_DULCE = "DELETE FROM Dulce WHERE idDulce = ?";

    public List<BeanDulce> consultarDulce() {
        List<BeanDulce> lista = new ArrayList<>();
        try {
            c = conexion.obtenerConexion();
            ps = c.prepareStatement(SQL_CONSULTAR_DULCE);
            rs = ps.executeQuery();
            while (rs.next()) {
                BeanDulce dulce = new BeanDulce();
                dulce.setIdDulce(rs.getInt("idDulce"));
                dulce.setNombreDulce(rs.getString("nombreDulce"));

                BeanMarca marca = new BeanMarca();
                marca.setIdMarca(rs.getInt("idMarca"));
                marca.setNombreMarca(rs.getString("nombreMarca"));
                marca.setTelefono(rs.getInt("telefono"));
                marca.setDireccion(rs.getString("direccion"));
                marca.setCorreo(rs.getString("correo"));
                dulce.setMarca(marca);

                BeanTipo tipo = new BeanTipo();
                tipo.setIdTipo(rs.getInt("idTipo"));
                tipo.setNombreTipo(rs.getString("nombreTipo"));
                tipo.setDescripcion(rs.getString("descripcion"));
                dulce.setTipo(tipo);

                dulce.setPrecio(rs.getDouble("precio"));
                dulce.setSabor(rs.getString("sabor"));
                dulce.setContenidoNeto(rs.getInt("contenidoNeto"));
                dulce.setExistencia(rs.getInt("existencia"));

                lista.add(dulce);
            }
            rs.close();
            ps.close();
            c.close();
        } catch (Exception e) {
            System.out.println("Error en el método consultarDulce() del DaoDulce -> " + e.getMessage());
        } finally {
            try {
                rs.close();
                ps.close();
                c.close();
            } catch (Exception e) {
                System.out.println("No se cerrarón las conexiones en consultarDulce() del DaoDulce -> " + e.getMessage());
            }
        }
        return lista;
    }

    public boolean agregarDulce(BeanDulce dulce) {
        boolean resu = false;
        try {
            c = conexion.obtenerConexion();
            ps = c.prepareStatement(SQL_AGREGAR_DULCE);
            ps.setString(1, dulce.getNombreDulce());
            ps.setInt(2, dulce.getMarca().getIdMarca());
            ps.setInt(3, dulce.getTipo().getIdTipo());
            ps.setDouble(4, dulce.getPrecio());
            ps.setString(5, dulce.getSabor());
            ps.setDouble(6, dulce.getContenidoNeto());
            ps.setInt(7, dulce.getExistencia());

            resu = ps.executeUpdate() == 1;
            ps.close();
            c.close();
        } catch (Exception e) {
            System.out.println("Error en el método agregarDulce() del DaoDulce -> " + e.getMessage());
        } finally {
            try {
                ps.close();
                c.close();
            } catch (Exception e) {
                System.out.println("No se cerrarón las conexiones en agregarDulce() del DaoDulce -> " + e.getMessage());
            }
        }
        return resu;
    }

    public boolean modificarDulce(BeanDulce dulce) {
        boolean resu = false;
        try {
            c = conexion.obtenerConexion();
            ps = c.prepareStatement(SQL_MODIFICAR_DULCE);
            ps.setString(1, dulce.getNombreDulce());
            ps.setInt(2, dulce.getMarca().getIdMarca());
            ps.setInt(3, dulce.getTipo().getIdTipo());
            ps.setDouble(4, dulce.getPrecio());
            ps.setString(5, dulce.getSabor());
            ps.setDouble(6, dulce.getContenidoNeto());
            ps.setInt(7, dulce.getExistencia());
            ps.setInt(8, dulce.getIdDulce());

            resu = ps.executeUpdate() == 1;
            ps.close();
            c.close();
        } catch (Exception e) {
            System.out.println("Error en el método modificarDulce() del DaoDulce -> " + e.getMessage());
        } finally {
            try {
                ps.close();
                c.close();
            } catch (Exception e) {
                System.out.println("No se cerrarón las conexiones en modificarDulce() del DaoDulce -> " + e.getMessage());
            }
        }
        return resu;
    }

    public boolean eliminarDulce(int idDulce) {
        boolean resu = false;
        try {
            c = conexion.obtenerConexion();
            ps = c.prepareStatement(SQL_ELIMINAR_DULCE);
            ps.setInt(1, idDulce);
            resu = ps.executeUpdate() == 1;

            ps.close();
            c.close();
        } catch (Exception e) {
            System.out.println("Error en el método eliminarDulce() del DaoDulce -> " + e.getMessage());
        } finally {
            try {
                ps.close();
                c.close();
            } catch (Exception e) {
                System.out.println("No se cerrarón las conexiones en eliminarDulce() del DaoDulce -> " + e.getMessage());
            }
        }
        return resu;
    }
}
