/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Comentario;
import Modelo.ComentarioDAO;
import Modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Maiyer
 */
@WebServlet(name = "CtrComentario", urlPatterns = {"/CtrComentario"})
public class CtrComentario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    ComentarioDAO comentariodao = new ComentarioDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        System.out.println("accion= " + accion);
        try {
            List<Comentario> lco = comentariodao.obtenerComentarios();
            List<Usuario> lusers = comentariodao.obtenerUsuarios();

            switch (accion) {
                case "home":
                    request.setAttribute("comentarios", lco);
                    request.setAttribute("users", lusers);
                    System.out.println("Entro A enviar los Comentarios");
                    request.getRequestDispatcher("Vistas/Contaminacion.jsp").forward(request, response);
                    break;
                case "Agregar":
                    Comentario p = new Comentario();
                    System.out.println("Entro Agregar Comentario");
                    int usuario_id = Integer.parseInt(request.getParameter("idu"));
                    String comentario = request.getParameter("comentario");
                    p.setUsuario_id(usuario_id);
                    p.setComentario(comentario);
                    comentariodao.crear(p);
                    request.getRequestDispatcher("/CtrComentario?accion=home").forward(request, response);
                    break;

                default:
                    System.out.println("Acción no reconocida");
                    break;

            }
        } catch (Exception e) {
            System.out.println("Error en el procesamiento de la solicitud" + e);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
