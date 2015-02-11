/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.mundo;

import java.util.LinkedList;

/**
 *
 * @author Angela Edith Suárez Torres
 */
public class Calculo {
    
    private final DatoEnlazado datoEnlazado;
    
    public Calculo() {
        datoEnlazado = new DatoEnlazado();
    }

    /**
     * Calcula la media de una lista de valores de tipo Double
     *
     * @param valores Lista de valores a los que se calculará la media
     */
    public void calcularMedia(LinkedList<DatoEnlazado> valores) {
        
        Double sumatoriaX = (double) 0;
        Double sumatoriaY = (double) 0;
        for (DatoEnlazado valor : valores) {
            sumatoriaX = sumatoriaX + valor.getValorX();
            sumatoriaY = sumatoriaY + valor.getValorY();
        }
        datoEnlazado.setMediaX(sumatoriaX / (valores.size()));
        datoEnlazado.setMediaY(sumatoriaY / (valores.size()));
    }
    
    public void calcularSumatoria(LinkedList<DatoEnlazado> valores) {
        Double sumatoriaX2 = (double) 0;
        Double sumatoriaY2 = (double) 0;
        Double productoXY = (double) 0;
        Double sumatoriaX = (double) 0;
        Double sumatoriaY = (double) 0;
        for (DatoEnlazado valor : valores) {
            sumatoriaX2 = sumatoriaX2 + Math.pow(valor.getValorX(), 2);
            sumatoriaY2 = sumatoriaY2 + Math.pow(valor.getValorY(), 2);
            productoXY = productoXY + (valor.getValorX() * valor.getValorY());
            sumatoriaX = sumatoriaX + valor.getValorX();
            sumatoriaY = sumatoriaY + valor.getValorY();
        }
        datoEnlazado.setX2(sumatoriaX2);
        datoEnlazado.setY2(sumatoriaY2);
        datoEnlazado.setXy(productoXY);
        datoEnlazado.setSumatoriaX(sumatoriaX);
        datoEnlazado.setSumatoriaY(sumatoriaY);
        datoEnlazado.setCantidadDatosEnlazados(valores.size());
    }
    
    public DatoEnlazado getDatoEnlazado() {
        return datoEnlazado;
    }
}
