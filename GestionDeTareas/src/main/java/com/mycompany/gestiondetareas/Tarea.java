/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondetareas;

/**
 *
 * @author daw2
 */
public class Tarea {
    
    private String descripcion;
    private boolean completada;

    
    //Constructor
    public Tarea(String descripcion, boolean completada) {
        this.descripcion = descripcion;
        this.completada = completada;
    }
    
    
    //Getters y Setters
    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }



    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
    
    
}
