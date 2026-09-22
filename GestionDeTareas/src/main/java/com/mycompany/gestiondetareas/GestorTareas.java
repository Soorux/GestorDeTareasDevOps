/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondetareas;

import com.mycompany.gestiondetareas.Tarea;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author daw2
 */
public class GestorTareas {
    
    private static Scanner teclado = new Scanner(System.in);
    private List<Tarea> listaTareas;
    
    public GestorTareas() {
        listaTareas = new ArrayList<Tarea>();
    }
    
    public static void aniadirTarea(GestorTareas g) {
        
        System.out.println("Introduce de que se trata la tarea: ");
        String descripcion = teclado.nextLine();
        System.out.println("Introduce como quieres llamar a la tarea: ");
        String nombre = teclado.nextLine();
        try {
            
            if (g.listaTareas.add(new Tarea(descripcion, nombre))) {
                System.out.println("Tarea creada correctamente");
            } else {
                System.out.println("No se ha podido crear la tarea");
            }
        } catch (Exception e) {
            System.out.println("No se ha podido crear la tarea");
        }
        
    }
    
    public static void listarTareas(GestorTareas g) {
        
        for (Tarea t : g.listaTareas) {
            System.out.println(t.getNombre());
            
            System.out.println(t.getCompletada());
        }
        
    }
    
    public static void marcarCompletada(GestorTareas g) {
        System.out.println("Introduce la tarea que quieres marcar como completada, tienes que poner el nombre de la tarea");
        String nombreTarea = teclado.nextLine();
        
        for (Tarea t1 : g.listaTareas) {
            if (t1.getNombre().equals(nombreTarea)) {
                t1.setCompletada(true);
                System.out.println("Se ha marcado como completada la tarea: " + t1.getNombre());
            }
        }
    }
    
    public static void comprobarEstadoTarea(GestorTareas g){
     System.out.println("Introduce la tarea que comprobar, tienes que poner el nombre de la tarea");
        String nombreTarea = teclado.nextLine();
        
        for (Tarea t1 : g.listaTareas) {
            if (t1.getNombre().equals(nombreTarea)) {
                if(t1.getCompletada()){
                    System.out.println("Esta completada la tarea " + t1.getNombre());
                }
                else if (!t1.getCompletada()){
                    System.out.println("No esta completada la tarea " + t1.getNombre());
                }
                else{
                    System.out.println("No se ha encontrado la tarea mencionada" + nombreTarea);
                }
            }
        }
    }
    
}
