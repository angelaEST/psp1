/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.mundo;

import java.util.LinkedList;

/**
 * @author Angela Edith Suárez Torres
 */
public class Calculo {

    private final Regresion datoEnlazado;

    public Calculo() {
        datoEnlazado = new Regresion();
    }

    /**
     * Calcula la media de una lista de valores de tipo Double
     *
     * @param valores Lista de valores a los que se calculará la media
     */
    public void calcularMedia(LinkedList<Regresion> valores) {

        Double sumatoriaX = (double) 0;
        Double sumatoriaY = (double) 0;
        for (Regresion valor : valores) {
            sumatoriaX = sumatoriaX + valor.getValorX();
            sumatoriaY = sumatoriaY + valor.getValorY();
        }
        datoEnlazado.setMediaX(sumatoriaX / (valores.size()));
        datoEnlazado.setMediaY(sumatoriaY / (valores.size()));
    }

    /**
     * Efectúa sumatoria de valores
     *
     * @param valores
     */
    public void calcularSumatoria(LinkedList<Regresion> valores) {
        Double sumatoriaX2 = (double) 0;
        Double sumatoriaY2 = (double) 0;
        Double productoXY = (double) 0;
        Double sumatoriaX = (double) 0;
        Double sumatoriaY = (double) 0;
        for (Regresion valor : valores) {
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

    /**
     * Calcula B1
     *
     * @param datoEnlazado
     */
    public void calcularBetaUno(Regresion datoEnlazado) {
        Double b1 = ((datoEnlazado.getXy()) - ((datoEnlazado.getCantidadDatosEnlazados()) * (datoEnlazado.getMediaX() * (datoEnlazado.getMediaY()))))
                / ((datoEnlazado.getX2()) - (datoEnlazado.getCantidadDatosEnlazados() * (Math.pow(datoEnlazado.getMediaX(), 2))));
        datoEnlazado.setBeta1(b1);
    }

    /**
     * Calcula B0
     *
     * @param datoEnlazado
     */
    public void calcularBetaCero(Regresion datoEnlazado) {
        Double b0 = (datoEnlazado.getMediaY()) - ((datoEnlazado.getBeta1()) * datoEnlazado.getMediaX());
        datoEnlazado.setBeta0(b0);
    }

    /**
     * Calcula coeficiente
     *
     * @param datoEnlazado
     */
    public void calcularCoeficiente(Regresion datoEnlazado) {
        Double coeficiente = (((datoEnlazado.getCantidadDatosEnlazados()) * (datoEnlazado.getXy())) - ((datoEnlazado.getSumatoriaX()) * (datoEnlazado.getSumatoriaY())))
                / (Math.sqrt(((((datoEnlazado.getCantidadDatosEnlazados()) * (datoEnlazado.getX2())) - (Math.pow(datoEnlazado.getSumatoriaX(), 2)))) * ((((datoEnlazado.getCantidadDatosEnlazados()) * (datoEnlazado.getY2())) - (Math.pow(datoEnlazado.getSumatoriaY(), 2))))));
        datoEnlazado.setCoeficiente(coeficiente);
    }

    /**
     * Calcula coeficiente al cuadrado
     *
     * @param datoEnlazado
     */
    public void calcularCoeficienteCuadrado(Regresion datoEnlazado) {
        datoEnlazado.setCoeficienteCuadrado(Math.pow(datoEnlazado.getCoeficiente(), 2));
    }

    /**
     * Calcula Estimación mejorada
     * @param datoEnlazado
     * @param xk 
     */
    public void calcularEstimacionMejorada(Regresion datoEnlazado, double xk) {
        datoEnlazado.setYk(datoEnlazado.getBeta0() + ((datoEnlazado.getBeta1()) * (xk)));
    }

    /**
     * Retorna el objeto cargado
     * @return 
     */
    public Regresion getDatoEnlazado() {
        return datoEnlazado;
    }
}
