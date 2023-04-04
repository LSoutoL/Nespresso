/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nespresso;

import java.util.Scanner;
import nespresso.entidades.Cafetera;
import nespresso.servicios.CafeteraServicio;

/**
 *
 * @author lucia
 */
public class Nespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        CafeteraServicio nuevoCafe = new CafeteraServicio ();
        Cafetera miCafe = nuevoCafe.llenarCafetera();
        System.out.println("Indique la capacidad de su taza");
        nuevoCafe.servirTaza(leer.nextInt());
        nuevoCafe.vaciarCafetera();
        System.out.println("Indique la cantidad de cafe que desea ingresar");
        nuevoCafe.agregarCafe(leer.nextInt());
    }
    
}
