package edu.uniandes.ecos.controlador;

import edu.uniandes.ecos.mundo.Calculo;
import edu.uniandes.ecos.mundo.DatoEnlazado;
import edu.uniandes.ecos.presentacion.PaintingText;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    
    public static void main1(String[] args) {
        Scanner capturaDatos = new Scanner(System.in);
        LinkedList<DatoEnlazado> datosCapturados = new LinkedList<DatoEnlazado>();
        boolean salida = true;
        int contadorParejas = 1;
        double x;
        double y;
        String respuesta = null;
        while (salida) {
            System.out.println("Pareja " + contadorParejas + " ingrese dato 1:");
            x = capturaDatos.nextDouble();
            System.out.println("Pareja " + contadorParejas + " ingrese dato 2:");
            y = capturaDatos.nextDouble();
            
            datosCapturados.add(new DatoEnlazado(x, y));
            
            do {
                System.out.println("¿Desea ingresar una nueva pareja (x,y) ? : S - N");
                respuesta = capturaDatos.next();
            } while (!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N"));
            if (respuesta.equalsIgnoreCase("S")) {
                contadorParejas++;
            } else if (respuesta.equalsIgnoreCase("N")) {
                salida = false;                
            }
            respuesta = "";
        }
        Calculo calculo = new Calculo();
        calculo.calcularMedia(datosCapturados);
        calculo.calcularSumatoria(datosCapturados);
        PaintingText paintingText = new PaintingText();
        paintingText.pintarBoB1(calculo.getDatoEnlazado());        
    }
}
