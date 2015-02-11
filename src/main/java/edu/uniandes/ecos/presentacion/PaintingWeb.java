/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.presentacion;

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

    public static void presentarOpcion(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        PrintWriter pw = resp.getWriter();
        pw.println("<html><head><title>PSP1 Estimación de tiempo y tamaño de desarrollo!</title></head>");
        pw.println("<h1>PSP1 Estimación de tiempo y tamaño de desarrollo!</h1>");
        pw.println("<body><form action=\"regresionLineal\" method=\"post\">");
        pw.println("</br><table><tr><td>Cantidad de (x,y):</td>");
        pw.println("<td><input type=\"text\" id=\"cantidad\" name=\"cantidad\"></td></tr></table></br>");
        pw.println("<input type=\"submit\" id=\"acepta\" name=\"acepta\" value=\"Enviar Cantidad\">");
        pw.println("</form></body>");
        pw.println("</html>");
//        pw.write("<form action=\"regresionLineal\" method=\"post\"> \n"
//                +" <table align=\"center\"><tr><td><strong>Valor x :</strong></td>\n"
//                +"<td><input type=\"input\"  name =\"nameX\" ></td></tr>\n"
//                +"<tr><td><strong>Valor y :</strong></td>\n"
//                +"<td><input type=\"input\"  name =\"nameY\"></td></tr>\n"
//                +"<tr><td><input type=\"submit\" value=\"Guardar valores\"></td></tr>\n"
//                + "</table>\n"
//                + "</form> ");        
//        pw.write("</html>");

    }

    public static void showResults(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

    }

    public static void showCeldas(HttpServletRequest req, HttpServletResponse resp, int cantidadXY)
            throws ServletException, IOException {

        PrintWriter pw = resp.getWriter();
        pw.println("<html><head><title>PSP1 Estimación de tiempo y tamaño de desarrollo!</title></head>");
        pw.println("<h1>PSP1 Estimación de tiempo y tamaño de desarrollo!</h1>");
        pw.println("<body>");
        pw.println("<table>");
        for (int i = 0; i < cantidadXY; i++) {
            pw.println("<tr>");
            pw.println("<td>Valor x: </td><td><input type=\"text\" id=\"valX" + i + "\" name=\"valX" + i + "\"></td></tr>");
            pw.println("<tr>");
            pw.println("<td>Valor y: </td><td><input type=\"text\" id=\"valY" + i + "\" name=\"valY" + i + "\"></td></tr>");
        }
        pw.println("</table>");
        pw.println("</body>");
        pw.println("</html>");
    }
}
