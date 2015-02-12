/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.presentacion;

import edu.uniandes.ecos.mundo.Regresion;

/**
 *
 * @author Angela Edith Su�rez Torres
 */
public class PaintingText {

    /**
     * Presenta resultados por consola
     * @param datoEnlazado 
     */
    public void pintarResultados(Regresion datoEnlazado) {
        System.out.println("\n ******** El resultado de Beta 1 es:  " + datoEnlazado.getBeta1() + "  ********");
        System.out.println("\n ******** Promedio de y:  " + datoEnlazado.getMediaY() + "  ********");
        System.out.println("\n ******** El resultado de Beta 0 es:  " + datoEnlazado.getBeta0() + "  ********");
        System.out.println("\n ******** El coeficiente de correlaci�n es:  " + datoEnlazado.getCoeficiente() + "  ********");
        System.out.println("\n ******** El coeficiente de correlaci�n al cuadrado es:  " + datoEnlazado.getCoeficienteCuadrado() + "  ********");
        System.out.println("\n ******** Estimacion mejorada:  " + datoEnlazado.getYk() + "  ********");
    }
}
