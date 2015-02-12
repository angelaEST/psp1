/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.presentacion;

import edu.uniandes.ecos.mundo.Regresion;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Angela Edith Suárez Torres
 */
public class PaintingWeb {

    /**
     * Presenta campo para digitar cantidad de pares x,y a ingresar
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException 
     */
    public static void presentarOpcion(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        PrintWriter pw = resp.getWriter();
        pw.println("<html><head><title>PSP1 Estimación de tiempo y tamaño de desarrollo!</title></head>");
        pw.println("<h1>PSP1 Estimación de tiempo y tamaño de desarrollo!</h1>");
        pw.println("<body><form action=\"regresionLineal\" method=\"post\">");
        pw.println("</br><table><tr><td>Cantidad de (x,y):</td>");
        pw.println("<td><input type=\"text\" id=\"cantidad\" name=\"cantxy\"></td></tr></table></br>");
        pw.println("<input type=\"submit\" id=\"acepta\" name=\"acepta\" value=\"Enviar Cantidad\">");
        pw.println("</form></body>");
        pw.println("</html>");

    }   

    /**
     * Presenta los campos disponibles para digitar los valores x,y
     * @param req
     * @param resp
     * @param cantidadXY
     * @throws ServletException
     * @throws IOException 
     */
    public static void showCeldas(HttpServletRequest req, HttpServletResponse resp, int cantidadXY)
            throws ServletException, IOException {

        PrintWriter pw = resp.getWriter();
        pw.println("<html><head><title>PSP1 Estimación de tiempo y tamaño de desarrollo!</title></head>");
        pw.println("<h1>PSP1 Estimación de tiempo y tamaño de desarrollo!</h1>");
        pw.println("<body>");
        pw.println("<form action=\"/RegresionServlet\" method=\"post\">");
        pw.println("<table>");
        pw.println("<td></td><td><input type=\"hidden\" id=\"cantXY\" name=\"cantxy\" value=" + cantidadXY + "></td>");
        for (int i = 0; i < cantidadXY; i++) {
            pw.println("<tr>");
            pw.println("<td>Valor x: </td><td><input type=\"text\" id=\"valX" + i + "\" name=\"valX" + i + "\"></td>");
            pw.println("<td>Valor y: </td><td><input type=\"text\" id=\"valY" + i + "\" name=\"valY" + i + "\"></td></tr>");
        }
        pw.println("<tr><td><input type=\"submit\" id=\"calcular\" name=\"calcular\" value=\"Mostrar Resultado\"></td></tr>");
        pw.println("</table>");
        pw.println("</form>");
        pw.println("</body>");
        pw.println("</html>");
    }

    /**
     * Presenta resultados de cáculos para los atributos de la regresión
     * @param req
     * @param resp
     * @param datoEnlazado
     * @throws ServletException
     * @throws IOException 
     */
    public static void showCalculo(HttpServletRequest req, HttpServletResponse resp, Regresion datoEnlazado)
            throws ServletException, IOException {

        PrintWriter pw = resp.getWriter();
        pw.println("<html><head><title>PSP1 Estimación de tiempo y tamaño de desarrollo!</title></head>");
        pw.println("<h1>PSP1 Estimación de tiempo y tamaño de desarrollo!</h1>");
        pw.println("<h1>Resultado: </h1></br>");
        pw.println("<body>");
        pw.println("<table>");
        pw.println("<tr><td>******** El resultado de Beta 1 es:  " + datoEnlazado.getBeta1() + "  ********</td></tr>");
        pw.println("<tr><td>******** Promedio de y:  " + datoEnlazado.getMediaY() + "  ********</td></tr>");
        pw.println("<tr><td>********  El resultado de Beta 0 es:  " + datoEnlazado.getBeta0() + "  ********</td></tr>");
        pw.println("<tr><td>******** El coeficiente de correlación es:  " + datoEnlazado.getCoeficiente() + "  ********</td></tr>");
        pw.println("<tr><td>******** El coeficiente de correlación al cuadrado es:  " + datoEnlazado.getCoeficienteCuadrado() + "  ********</td></tr>");
        pw.println("<tr><td>******** Estimacion mejorada:  " + datoEnlazado.getYk() + "  ********</td></tr>");
        pw.println("</table>");
        pw.println("</body>");
        pw.println("</html>");
    }
}
