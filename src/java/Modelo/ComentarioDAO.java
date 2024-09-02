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
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maiyer
 */
public class ComentarioDAO {
    
     public List<Comentario> obtenerComentarios(){
        List<Comentario> lcomentarios = new ArrayList<>();
        try {
            conectar conection = new conectar();
            Connection conexion = conection.crearconexion();
            if (conexion != null) {
                System.out.println("Se ha establecido una conexcion con la base de datos");

            }
            String consulta = "Select * from comentario";
            PreparedStatement stm = conexion.prepareStatement(consulta);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                int usuario_id = rs.getInt("usuario_id");
                int comentario_padre_id = rs.getInt("comentario_padre_id");
                String comentario = rs.getString("comentario");
                Timestamp fecha = rs.getTimestamp("fecha");
                Comentario comenta = new Comentario(id,usuario_id,comentario_padre_id,comentario,fecha);
                lcomentarios.add(comenta);
                System.out.println("Cargo los Rs");
            }
        } catch (Exception ex) {
            System.out.println("Hubo un Error Al Cargar Los Comentarios "+ ex);
        }
        
        return lcomentarios;
    }
     
      public List<Usuario> obtenerUsuarios(){
        List<Usuario> luser = new ArrayList<>();
        try {
            conectar conection = new conectar();
            Connection conexion = conection.crearconexion();
            if (conexion != null) {
                System.out.println("Se ha establecido una conexcion con la base de datos");

            }
            String consulta = "SELECT u.id, u.usuario, u.correo, u.contrasena, u.rol FROM Usuario u JOIN Comentario c ON u.id = c.usuario_id ORDER BY c.id;";
            PreparedStatement stm = conexion.prepareStatement(consulta);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String usuario = rs.getString("usuario");
                String correo = rs.getString("correo");
                String contrasena = rs.getString("contrasena");
                String rol = rs.getString("rol");
                Usuario user = new Usuario(id,usuario,correo,contrasena,rol);
                luser.add(user);
                System.out.println("Cargo los Rs del Usuario");
            }
        } catch (Exception ex) {
            System.out.println("Hubo un Error Al Cargar Los Usuarios "+ ex);
        }
        
        return luser;
    }
}
