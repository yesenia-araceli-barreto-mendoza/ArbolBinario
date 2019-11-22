/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author Yess
 */
public class Nodo {
    private int dato;
    private Nodo izdo;
    private Nodo drcho;
    
    public Nodo(int dato){
        this.dato =dato;
        izdo=drcho=null;
    }

    public Nodo(int dato, Nodo izquierdo, Nodo derecho) {
        this.dato = dato;
        this.izdo = izquierdo;
        this.drcho = derecho;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getIzdo() {
        return izdo;
    }

    public void setIzdo(Nodo izdo) {
        this.izdo = izdo;
    }

    public Nodo getDrcho() {
        return drcho;
    }

    public void setDrcho(Nodo drcho) {
        this.drcho = drcho;
   
       }
    
}
