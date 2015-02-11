/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.mundo;

/**
 *
 * @author Angela Edith Suárez Torres
 */
public class DatoEnlazado {

    private Double valorX;
    private Double valorY;
    private Double sumatoriaX;
    private Double sumatoriaY;
    private Double mediaX;
    private Double mediaY;
    private Double x2;
    private Double y2;
    private Double xy;
    private int cantidadDatosEnlazados;

    public DatoEnlazado() {
    }

    public DatoEnlazado(Double valorX, Double valorY) {
        this.valorX = valorX;
        this.valorY = valorY;
    }

    public Double getValorX() {
        return valorX;
    }

    public void setValorX(Double valorX) {
        this.valorX = valorX;
    }

    public Double getValorY() {
        return valorY;
    }

    public void setValorY(Double valorY) {
        this.valorY = valorY;
    }

    public Double getMediaX() {
        return mediaX;
    }

    public void setMediaX(Double mediaX) {
        this.mediaX = mediaX;
    }

    public Double getMediaY() {
        return mediaY;
    }

    public void setMediaY(Double mediaY) {
        this.mediaY = mediaY;
    }

    public Double getX2() {
        return x2;
    }

    public void setX2(Double x2) {
        this.x2 = x2;
    }

    public Double getY2() {
        return y2;
    }

    public void setY2(Double y2) {
        this.y2 = y2;
    }

    public Double getXy() {
        return xy;
    }

    public void setXy(Double xy) {
        this.xy = xy;
    }

    public int getCantidadDatosEnlazados() {
        return cantidadDatosEnlazados;
    }

    public void setCantidadDatosEnlazados(int cantidadDatosEnlazados) {
        this.cantidadDatosEnlazados = cantidadDatosEnlazados;
    }

    public Double getSumatoriaX() {
        return sumatoriaX;
    }

    public void setSumatoriaX(Double sumatoriaX) {
        this.sumatoriaX = sumatoriaX;
    }

    public Double getSumatoriaY() {
        return sumatoriaY;
    }

    public void setSumatoriaY(Double sumatoriaY) {
        this.sumatoriaY = sumatoriaY;
    }

}
