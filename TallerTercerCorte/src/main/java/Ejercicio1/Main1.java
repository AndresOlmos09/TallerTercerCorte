/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Andres
 */
public class Main1 {

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
        
        //Agregando Primera Linea al MAIN
        //a.volar();
        //No compila, ya que "a" es de tipo animal y animal no tiene el metodo volar
        
        //Agregando Segunda Linea al MAIN
        //v.nadar();
        //No compila,ya que "v" es una referencia de tipo volador, y volador no tiene definido ni declarado el metodo nadar
        
        //Agregando Tercera Linea al MAIN
        ((Nadador) v).nadar();
        //Si compila, ya que se esta haciendo casting de la referencia "v" a nadador    , por lo que si puede ejecutar la accion.
        
        //Agregando Cuarta Linea al MAIN
        //Animal x = new Animal("Pluto");
        //No compila, ya que la clase animal es abstracta, por lo que no se pueden crear nuevas instancias de este.
        
        //Agregando Quinta Linea al MAIN
        Volador w = new Pato("Daisy");
        //Si compila, ya que se esta especificando que esta nueva instancia de volador es un objeto de la clase pato.
    }
    
}
