package edu.uniandes.ecos.controlador;

import edu.uniandes.ecos.mundo.Calculo;
import edu.uniandes.ecos.mundo.Regresion;
import edu.uniandes.ecos.presentacion.PaintingText;
import java.util.LinkedList;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner capturaDatos = new Scanner(System.in);
        LinkedList<Regresion> datosCapturados = new LinkedList<Regresion>();
        boolean salida = true;
        int contadorParejas = 1;
        double x;
        double y;
        String respuesta = null;
        String proxySize = null;
        while (salida) {
            System.out.println("\nPareja " + contadorParejas + " ingrese x:");
            x = capturaDatos.nextDouble();
            System.out.println("Pareja " + contadorParejas + " ingrese y:");
            y = capturaDatos.nextDouble();
            
            datosCapturados.add(new Regresion(x, y));
            
            do {
                System.out.println("\n Deseo ingresar una nueva pareja (x,y)  : S - N");
                respuesta = capturaDatos.next();
            } while (!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N"));
            if (respuesta.equalsIgnoreCase("S")) {
                contadorParejas++;
            } else if (respuesta.equalsIgnoreCase("N")) {
                System.out.println("\nIngrese Proxy Size: ");
                proxySize=capturaDatos.next();
                salida = false;                
            }
            respuesta = "";
        }
        Calculo calculo = new Calculo();
        calculo.calcularMedia(datosCapturados);
        calculo.calcularSumatoria(datosCapturados);
        calculo.calcularBetaUno(calculo.getDatoEnlazado());
        calculo.calcularBetaCero(calculo.getDatoEnlazado());
        calculo.calcularCoeficiente(calculo.getDatoEnlazado());
        calculo.calcularCoeficienteCuadrado(calculo.getDatoEnlazado());
        calculo.calcularEstimacionMejorada(calculo.getDatoEnlazado(), Double.valueOf(proxySize));
        
        PaintingText paintingText = new PaintingText();
        paintingText.pintarResultados(calculo.getDatoEnlazado());        
    }
}
