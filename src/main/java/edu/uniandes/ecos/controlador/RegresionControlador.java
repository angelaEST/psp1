/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.controlador;

import edu.uniandes.ecos.presentacion.PaintingWeb;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 *
 * @author Angela Edith Suarez Torres
 */
public class RegresionControlador extends HttpServlet {

    public static void main(String[] args) {
        Server server = new Server(Integer.valueOf(System.getenv("PORT")));
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);
        context.addServlet(new ServletHolder(new RegresionControlador()), "/*");
        try {
            server.start();
            server.join();
        } catch (Exception ex) {
            Logger.getLogger(RegresionControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        PaintingWeb.presentarOpcion(req, resp);        
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String cantidadXY = req.getParameter("cantidad");
        PaintingWeb.showCeldas(req, resp, Integer.parseInt(cantidadXY));
        
//        try {              
//            LinkedList<DatoEnlazado> datosCapturados = new LinkedList<DatoEnlazado>();
//            
//            PaintingWeb.showResults(req, resp);
//        } catch (Exception ex) {
//            Logger.getLogger(RegresionControlador.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}
