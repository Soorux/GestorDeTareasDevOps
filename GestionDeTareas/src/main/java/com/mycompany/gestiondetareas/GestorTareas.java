/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondetareas;


import java.util.Scanner;

/**
 *
 * @author daw2
 */
public class GestorTareas {
    
    private static Scanner teclado = new Scanner(System.in);
    
    public static void aniadirTarea(){
        System.out.println("Introduce de que se trata la tarea: ");
        String descripcion = teclado.nextLine();
        
        try{
        
            Tarea t1 = new Tarea(descripcion,false);
            System.out.println("Tarea creada correctamente");
        
        }
        catch(Exception e){
            System.out.println("No se ha podido crear la tarea");
        }
        
        
    
    }
    
    
    
}
