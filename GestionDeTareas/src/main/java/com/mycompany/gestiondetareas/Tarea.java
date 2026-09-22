/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondetareas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daw2
 */
public class Tarea {
    
    private String descripcion;
    private boolean completada;
    private String nombre;
    
    //Constructor
    public Tarea(String descripcion, String nombre) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.completada = false;
        
    }
    
    
    //Getters y Setters
    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
    
    
}
