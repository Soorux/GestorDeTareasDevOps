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

            if(g.listaTareas.add(new Tarea(descripcion,nombre))){
                System.out.println("Tarea creada correctamente");
            }
            else{
                System.out.println("No se ha podido crear la tarea");
            }
        } catch (Exception e) {
            System.out.println("No se ha podido crear la tarea");
        }

    }

    public static void listarTareas(GestorTareas g) {

            for (Tarea t : g.listaTareas) {
                System.out.println(t.getNombre());
        }
            
        }
    }


