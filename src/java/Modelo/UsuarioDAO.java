/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Configuracion.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Maiyer
 */
public class UsuarioDAO {

    Connection con;
    PreparedStatement pstm;
    conectar conexion;
    ResultSet rs;
    Usuario us = null;
    Usuario usua = null;

    public Usuario Validar(String correo, String pass) {
        Usuario usua = null;
        try {
            conexion = new conectar();
            con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se conectó a la base de datos");
                pstm = con.prepareStatement("SELECT * FROM usuario WHERE correo = ? AND contrasena = ?");
                pstm.setString(1, correo);
                pstm.setString(2, pass);
                rs = pstm.executeQuery();

                if (rs.next()) {
                    System.out.println("Entró a la validación");
                    usua = new Usuario();
                    usua.setCorreo(rs.getString("correo"));
                    usua.setId(rs.getInt("id"));
                    usua.setContrasena(rs.getString("contrasena"));
                    usua.setUsuario(rs.getString("usuario"));
                    usua.setRol(rs.getString("rol"));
                }
            }
        } catch (Exception e) {
            System.out.println("Error al conectarse a la base de datos");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return usua;
    }

    public boolean crear(Usuario us) {
        try {
            conexion = new conectar();
            Connection con = conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexcion con la base de datos");
            }
            pstm = con.prepareStatement("INSERT INTO usuario(usuario,correo,contrasena,rol) VALUES(?,?,?,?)");
            pstm.setString(1, us.getUsuario());
            pstm.setString(2, us.getCorreo());
            pstm.setString(3, us.getContrasena());
            pstm.setString(4, us.getRol());
            if (us.getUsuario() != null && us.getContrasena() != null && us.getCorreo() != null && us.getRol() != null) {
                System.out.println("IF compraracion Todos Si");
                if (pstm.executeUpdate() == 1) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error Al Crear El Usuario" + e);
            return false;
        }
    }
}
