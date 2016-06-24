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
public class Migrante {
    String cedula;
    String nombre;
    String edad;
    String fechaSolicitud;
    String prioridad;
    public Migrante(String cedula, String nombre, String edad, String fechaSolicitud,String prioridad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaSolicitud = fechaSolicitud;
        this.prioridad = prioridad;
    }

    public String getPrioridad() {
        return prioridad;
    }

    
    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    
    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setFechaSolicitud(String fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }   
   
}
