/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utez.modelo.marca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utilerias.conexion;

/**
 *
 * @author lfern
 */
public class DaoMarca {

    private Connection c;
    private PreparedStatement ps;
    private ResultSet rs;

    final String SQL_CONSULTAR_MARCAR = "SELECT * FROM Marca";
    final String SQL_AGREGAR_MARCAR = "INSERT INTO Marca(nombreMarcar, telefono, direccion, correo) VALUES(?,?,?,?)";
    final String SQL_MODIFICAR_MARCAR = "UPDATE Marca set nombreMarcar = ?, telefono = ?, direccion = ?, correo = ? WHERE idMarca = ?";
    final String SQL_ELIMINAR_MARCAR = "DELETE FROM Marca WHERE idMarca = ?";

    public List<BeanMarca> consultarMarca() {
        List<BeanMarca> lista = new ArrayList<>();
        try {
            c = utilerias.conexion.obtenerConexion();
            ps = c.prepareStatement(SQL_CONSULTAR_MARCAR);
            rs = ps.executeQuery();
            while (rs.next()) {
                BeanMarca marca = new BeanMarca();
                marca.setIdMarca(rs.getInt("idMarca"));
                marca.setNombreMarca(rs.getString("nombreMarcar"));
                marca.setTelefono(rs.getInt("telefono"));
                marca.setDireccion(rs.getString("direccion"));
                marca.setCorreo(rs.getString("correo"));

                lista.add(marca);
            }
            rs.close();
            ps.close();
            c.close();
        } catch (Exception e) {
            System.out.println("Error en método consultarMarca() del DaoMarca -> " + e.getMessage());
        } finally {
            try {
                rs.close();
                ps.close();
                c.close();
            } catch (Exception e) {
                System.out.println("No se cerraron conexiones en consultarMarca() del DaoMarca -> " + e.getMessage());
            }
        }
        return lista;
    }

    public boolean registrarMarca(BeanMarca marca) {
        boolean resu = false;
        try {
            c = utilerias.conexion.obtenerConexion();
            ps = c.prepareStatement(SQL_AGREGAR_MARCAR);
            ps.setString(1, marca.getNombreMarca());
            ps.setInt(2, marca.getTelefono());
            ps.setString(3, marca.getDireccion());
            ps.setString(4, marca.getCorreo());

            resu = ps.executeUpdate() == 1;

            ps.close();
            c.close();
        } catch (Exception e) {
            System.out.println("Error en el método registrarMarca() del DaoMarca -> " + e.getMessage());
        } finally {
            try {
                ps.close();
                c.close();
            } catch (Exception e) {
                System.out.println("No se cerrarón las conexiones en registrarMarca() del DaoMarca -> " + e.getMessage());
            }
        }
        return resu;
    }

    public boolean modificarMarca(BeanMarca marca) {
        boolean resu = false;
        try {
            c = conexion.obtenerConexion();
            ps = c.prepareStatement(SQL_MODIFICAR_MARCAR);
            ps.setString(1, marca.getNombreMarca());
            ps.setInt(2, marca.getTelefono());
            ps.setString(3, marca.getDireccion());
            ps.setString(4, marca.getCorreo());
            ps.setInt(5, marca.getIdMarca());

            resu = ps.executeUpdate() == 1;
            ps.close();
            c.close();
        } catch (Exception e) {
            System.out.println("Error en método modificarMarca() del DaoMarca -> " + e.getMessage());
        } finally {
            try {
                ps.close();
                c.close();
            } catch (Exception e) {
                System.out.println("No se cerrarón las conexiones en modificarMarca() del DaoMarca ->" + e.getMessage());
            }
        }
        return resu;
    }

    public boolean eliminarMarca(int idMarca) {
        boolean resu = false;
        try {
            c = conexion.obtenerConexion();
            ps = c.prepareStatement(SQL_ELIMINAR_MARCAR);
            ps.setInt(1, idMarca);
            resu = ps.executeUpdate() == 1;

            ps.close();
            c.close();
        } catch (Exception e) {
            System.out.println("Error en método eliminarMarca() del DaoMarca -> " + e.getMessage());
        } finally {
            try {
                ps.close();
                c.close();
            } catch (Exception e) {
                System.out.println("No se cerrarón las conexiones en eliminarMarca() del DaoMarca ->" + e.getMessage());
            }
        }
        return resu;
    }

    public static void main(String[] args) {
        DaoMarca dao = new DaoMarca();
        BeanMarca bean = new BeanMarca();
        bean.setNombreMarca("si jala");
        bean.setTelefono(1234);
        bean.setDireccion("barona");
        bean.setCorreo("l@gmail.com");
        System.out.println(dao.registrarMarca(bean));

    }
}
