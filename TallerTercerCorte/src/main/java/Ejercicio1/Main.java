/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pato p = new Pato("Donald");
        Animal a = p;
        Volador v = p;
        Nadador n = p;
        
        a.sonido();
        v.volar();
        n.nadar();
        System.out.println(v.habilidad());
        System.out.println(a instanceof Nadador);
        
        if (a instanceof Volador){
            ((Volador)a).volar();
        }
    }
    
}
