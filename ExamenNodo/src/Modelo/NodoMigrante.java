/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author JoséFabián
 */
public class NodoMigrante {
 
    Migrante migrante;
//    String dato;
    NodoMigrante siguiente;

    public NodoMigrante(Migrante migrante, NodoMigrante siguiente) {
        this.migrante = migrante;
        this.siguiente = siguiente;
    }

    
    
    public Migrante getDato() {
        return migrante;
    }

    public NodoMigrante getSiguiente() {
        return siguiente;
    }

    public void setDato(Migrante migrante) {
        this.migrante = migrante;
    }

    public void setSiguiente(NodoMigrante siguiente) {
        this.siguiente = siguiente;
    }
    
}
