/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Andres
 */
public abstract class Animal {
    protected String nombre;
    
    //Constructor de animal con parametro de nombre
    public Animal(String nombre){
        this.nombre = nombre;
        System.out.println("Creando animal: "+ nombre);
    }
    
    //Funcion abstracta de hacer sonido
    public abstract void sonido();
}
