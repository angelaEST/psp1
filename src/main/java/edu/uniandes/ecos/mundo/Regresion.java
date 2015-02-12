/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.mundo;

/******************************************************************/
/* Program Assignment:3                                                        
/* Name: Angela Edith Suárez Torres                                                                                  
/* Date: 07/02/15                  
/* Description: Contiene todos los atributos involucrados en el cálculo de la regresión
/******************************************************************/

public class Regresion {

    private Double valorX;               //Estimated Proxy Size
    private Double valorY;               //Actual Added and Modified Size
    private Double sumatoriaX;    
    private Double sumatoriaY;
    private Double mediaX;
    private Double mediaY;
    private Double x2;                   //Estimated Proxy Size al cuadrado
    private Double y2;                   //Actual Added and Modified Size al  cuadrado
    private Double xy;                   //producto Estimated Proxy Size * Actual Added and Modified Size
    private int cantidadDatosEnlazados;  //cantidad datos ingresados
    private double beta0;
    private double beta1;
    private double coeficiente;
    private double coeficienteCuadrado;
    private double yk;                    //Estimación mejorada
    

    public Regresion() {
    }

    public Regresion(Double valorX, Double valorY) {
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

    public double getBeta0() {
        return beta0;
    }

    public void setBeta0(double beta0) {
        this.beta0 = beta0;
    }

    public double getBeta1() {
        return beta1;
    }

    public void setBeta1(double beta1) {
        this.beta1 = beta1;
    }

    public double getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(double coeficiente) {
        this.coeficiente = coeficiente;
    }

    public double getCoeficienteCuadrado() {
        return coeficienteCuadrado;
    }

    public void setCoeficienteCuadrado(double coeficienteCuadrado) {
        this.coeficienteCuadrado = coeficienteCuadrado;
    }

    public double getYk() {
        return yk;
    }

    public void setYk(double yk) {
        this.yk = yk;
    }
    
    
}
