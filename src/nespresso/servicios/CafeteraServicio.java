/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nespresso.servicios;

import java.util.Scanner;
import nespresso.entidades.Cafetera;

/**
 *
 * @author lucia
 * Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
 * Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad 
 * máxima. 
 * Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe 
 * el tamaño de la taza y simula la acción de servir la taza con la capacidad 
 * indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, 
 * se sirve lo que quede. El método le informará al usuario si se llenó o no la 
 * taza, y de no haberse llenado en cuanto quedó la taza.
 * 
 * Método vaciarCafetera(): pone la cantidad de café actual en cero. 
 * Método agregarCafe(int): se le pide al usuario una cantidad de café, el 
 * método lo recibe y se añade a la cafetera la cantidad de café indicada.
 */
public class CafeteraServicio {
    private Cafetera cafecito = new Cafetera ();
    private Scanner leer = new Scanner(System.in);
    
    public Cafetera llenarCafetera (){
        System.out.println("Indique la capacidad maxima de la cafetera");
        cafecito.setMaxima(leer.nextInt());
        cafecito.setCantidad(cafecito.getMaxima());
        return this.cafecito;
    }
    public void servirTaza (int taza){
        if (cafecito.getCantidad()>=taza){
            System.out.println("La taza se lleno.");
            cafecito.setCantidad(cafecito.getCantidad()-taza);
        } else System.out.println("La taza no se lleno, contiene: " + cafecito.getCantidad());
    }
    public void vaciarCafetera (){
        cafecito.setCantidad(0);
    }
    public void agregarCafe (int nuevo_cafe){
        while (nuevo_cafe>cafecito.getMaxima()){
            System.out.println("Error. La cafetera tiene un maximo de "+ cafecito.getMaxima()+ ". Ingrese una cantidad menor.");
            nuevo_cafe=leer.nextInt();
        }
        cafecito.setCantidad(nuevo_cafe);
    }
}
