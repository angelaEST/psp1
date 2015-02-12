/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.controlador;

import edu.uniandes.ecos.mundo.Calculo;
import edu.uniandes.ecos.mundo.Regresion;
import edu.uniandes.ecos.presentacion.PaintingWeb;
import java.io.IOException;
import java.util.LinkedList;
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
        LinkedList<Regresion> datosCapturados = new LinkedList<Regresion>();
        Regresion datoEnlazado = null;
        String accionCalcular = req.getParameter("calcular");
        String cantidadXY = req.getParameter("cantxy");
        int cantidadCamposIngresados = Integer.parseInt(cantidadXY);
        if (accionCalcular != null) {
            for (int i = 0; i < cantidadCamposIngresados; i++) {
                datoEnlazado = new Regresion(Double.valueOf(req.getParameter("valX" + i)), Double.valueOf(req.getParameter("valY" + i)));
                datosCapturados.add(datoEnlazado);
            }
            Calculo calculo = new Calculo();
            calculo.calcularMedia(datosCapturados);
            calculo.calcularSumatoria(datosCapturados);
            calculo.calcularBetaUno(calculo.getDatoEnlazado());
            calculo.calcularBetaCero(calculo.getDatoEnlazado());
            calculo.calcularCoeficiente(calculo.getDatoEnlazado());
            calculo.calcularCoeficienteCuadrado(calculo.getDatoEnlazado());
            calculo.calcularEstimacionMejorada(calculo.getDatoEnlazado(), 386);
            
            PaintingWeb.showCalculo(req, resp, calculo.getDatoEnlazado());
        } else {
            PaintingWeb.showCeldas(req, resp, Integer.parseInt(cantidadXY));
        }
    }
}
