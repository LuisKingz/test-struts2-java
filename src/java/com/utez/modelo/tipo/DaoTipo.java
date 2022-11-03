/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utez.modelo.tipo;

import utilerias.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lfern
 */
public class DaoTipo {

    private Connection c;
    private PreparedStatement ps;
    private ResultSet rs;

    final private String SQL_CONSULTAR_TIPO = "SELECT * FROM Tipo";
    final private String SQL_REGISTRAR_TIPO = "INSERT INTO Tipo (nombreTipo, descripcion) VALUES(?,?)";
    final private String SQL_MODIFICAR_TIPO = "UPDATE Tipo SET nombreTipo = ?, descripcion = ? WHERE idTipo = ?";
    final private String SQL_ELIMINAR_TIPO = "DELETE FROM Tipo where idTipo = ?";

    public List<BeanTipo> consultarTipo() {
        List<BeanTipo> lista = new ArrayList<>();
        try {
            c = conexion.obtenerConexion();
            ps = c.prepareStatement(SQL_CONSULTAR_TIPO);
            rs = ps.executeQuery();
            while (rs.next()) {
                BeanTipo t = new BeanTipo();
                t.setIdTipo(rs.getInt("idTipo"));
                t.setNombreTipo(rs.getString("nombreTipo"));
                t.setDescripcion(rs.getString("descripcion"));

                lista.add(t);
            }
            rs.close();
            ps.close();
            c.close();
        } catch (Exception e) {
            System.out.println("Error en método consultarTipo() del DaoTipo -> " + e.getMessage());
        } finally {
            try {
                rs.close();
                ps.close();
                c.close();
            } catch (Exception e) {
                System.out.println("No se cerraron conexiones en consultarTipo() del DaoTipo -> " + e.getMessage());
            }
        }
        return lista;
    }

    public boolean registrarTipo(BeanTipo tipo) {
        boolean resu = false;
        try {
            c = conexion.obtenerConexion();
            ps = c.prepareStatement(SQL_REGISTRAR_TIPO);
            ps.setString(1, tipo.getNombreTipo());
            ps.setString(2, tipo.getDescripcion());

            resu = ps.executeUpdate() == 1;

            ps.close();
            c.close();

        } catch (Exception e) {
            System.out.println("Error en método registrarTipo() del DaoTipo -> " + e.getMessage());
        } finally {
            try {
                ps.close();
                c.close();
            } catch (Exception e) {
                System.out.println("No se cerraron conexiones en registrarTipo() del DaoTipo -> " + e.getMessage());
            }
        }
        return resu;
    }

    public boolean modificarTipo(BeanTipo tipo) {
        boolean resu = false;
        try {
            c = conexion.obtenerConexion();
            ps = c.prepareStatement(SQL_MODIFICAR_TIPO);
            ps.setString(1, tipo.getNombreTipo());
            ps.setString(2, tipo.getDescripcion());
            ps.setInt(3, tipo.getIdTipo());

            resu = ps.executeUpdate() == 1;

            ps.close();
            c.close();
        } catch (Exception e) {
            System.out.println("Error en método registrarTipo() del DaoTipo -> " + e.getMessage());
        } finally {
            try {
                ps.close();
                c.close();
            } catch (Exception e) {
                System.out.println("No se cerraron conexiones en registrarTipo() del DaoTipo -> " + e.getMessage());
            }
        }
        return resu;
    }

    public boolean eliminarTipo(int idTipo) {
        boolean resu = false;
        try {
            c = conexion.obtenerConexion();
            ps = c.prepareStatement(SQL_ELIMINAR_TIPO);
            ps.setInt(1, idTipo);

            resu = ps.executeUpdate() == 1;

            ps.close();
            c.close();
        } catch (Exception e) {
            System.out.println("Error en método eliminarTipo() del DaoTipo -> " + e.getMessage());
        } finally {
            try {
                ps.close();
                c.close();
            } catch (Exception e) {
                System.out.println("No se cerraron conexiones en eliminarTipo() del DaoTipo -> " + e.getMessage());
            }
        }
        return resu;
    }

}
