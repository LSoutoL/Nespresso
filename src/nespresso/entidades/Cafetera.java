/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nespresso.entidades;

/**
 *
 * @author lucia
 * Desarrolle una clase Cafetera en el paquete Entidades con los atributos 
 * capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) 
 * y cantidadActual (la cantidad actual de café que hay en la cafetera). 
 * Agregar constructor vacío y con parámetros así como setters y getters. 
 */
public class Cafetera {
    private int maxima;
    private int cantidad;

    public Cafetera() {
    }

    public Cafetera(int maxima, int cantidad) {
        this.maxima = maxima;
        this.cantidad = cantidad;
    }

    public int getMaxima() {
        return maxima;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setMaxima(int maxima) {
        this.maxima = maxima;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
