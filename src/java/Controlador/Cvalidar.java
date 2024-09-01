/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import Modelo.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Maiyer
 */
@WebServlet(name = "Cvalidar", urlPatterns = {"/Cvalidar"})
public class Cvalidar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    UsuarioDAO usudao = new UsuarioDAO();
    Usuario user = new Usuario();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String accion = request.getParameter("accion");
            if ("ingresar".equalsIgnoreCase(accion)) {
                System.out.println("2");
                HttpSession sesion = request.getSession();
                String usu = request.getParameter("email");
                String pass = request.getParameter("password");
                user = usudao.Validar(usu, pass);

                if (user != null && user.getCorreo() != null) {
                    System.out.println("3");
                    sesion.setAttribute("log", '1');
                    sesion.setAttribute("correo", user.getCorreo());
                    sesion.setAttribute("contrasena", user.getContrasena());
                    sesion.setAttribute("id", user.getId());
                    sesion.setAttribute("usuario", user.getUsuario());
                    sesion.setAttribute("rol", user.getRol());

                    if (user.getRol().equals("ADMINISTRADOR")) {
                        System.out.println("redirect");
                        response.sendRedirect("/ProyectoNaturales/Vistas/Contaminacion.jsp");
                    } else {
                        response.sendRedirect("/ProyectoNaturales/Vistas/Contaminacion.jsp");
                    }
                } else {
                    String errormensage = "Usuario o contraseña incorrectos";
                    request.setAttribute("error", errormensage);
                    request.getRequestDispatcher("/Vistas/login.jsp").forward(request, response);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            String errormensage = "Usuario o contraseña incorrectos";
            request.setAttribute("error", errormensage);
            request.getRequestDispatcher("/Vistas/login.jsp").forward(request, response);
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
