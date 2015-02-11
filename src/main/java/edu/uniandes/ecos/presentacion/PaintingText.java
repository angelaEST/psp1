/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.presentacion;

import edu.uniandes.ecos.mundo.DatoEnlazado;

/**
 *
 * @author Angela Edith Suárez Torres
 */
public class PaintingText {

    public void pintarBoB1(DatoEnlazado datoEnlazado) {
        Double b1 = ((datoEnlazado.getXy()) - ((datoEnlazado.getCantidadDatosEnlazados()) * (datoEnlazado.getMediaX() * (datoEnlazado.getMediaY()))))
                / ((datoEnlazado.getX2()) - (datoEnlazado.getCantidadDatosEnlazados() * (Math.pow(datoEnlazado.getMediaX(), 2))));

        System.out.println("\n ******** El resultado de Beta 1 es:  " + b1 + "  ********");
        
        Double b0 = (datoEnlazado.getMediaY()) - ((b1) * datoEnlazado.getMediaX());
        
        System.out.println("\n ******** Promedio de y:  " + datoEnlazado.getMediaY() +"  ********");
        System.out.println("\n ******** El resultado de Beta 0 es:  " + b0 +"  ********");
        
        Double coeficiente =(((datoEnlazado.getCantidadDatosEnlazados())*(datoEnlazado.getXy())) - ((datoEnlazado.getSumatoriaX())*(datoEnlazado.getSumatoriaY())))/
                (Math.sqrt(((((datoEnlazado.getCantidadDatosEnlazados())*(datoEnlazado.getX2()))-(Math.pow(datoEnlazado.getSumatoriaX(), 2))))*((((datoEnlazado.getCantidadDatosEnlazados())*(datoEnlazado.getY2()))-(Math.pow(datoEnlazado.getSumatoriaY(), 2))))));
         System.out.println("\n ******** El coeficiente de correlación es:  " + coeficiente + "  ********");
         System.out.println("\n ******** El coeficiente de correlación al cuadrado es:  " + Math.pow(coeficiente, 2) + "  ********");
         
    }
}
