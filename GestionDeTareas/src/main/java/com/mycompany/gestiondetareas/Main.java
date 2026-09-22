/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gestiondetareas;

import java.util.Scanner;


/**
 *
 * @author daw2
 */
public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        GestorTareas g1 = new GestorTareas();
        while (salir != true) {

            mostrarMenu();
            int opcion = Integer.parseInt(teclado.nextLine());
            
           switch(opcion){
           
               case 1 ->
                   GestorTareas.aniadirTarea(g1);
               
               case 2 ->
                   GestorTareas.marcarCompletada(g1);
               case 3 ->
                   GestorTareas.listarTareas(g1);
                   
               case 4 ->
                   GestorTareas.comprobarEstadoTarea(g1);
               
               case 5 ->
                   GestorTareas.borrarTarea(g1);
               case 0 ->
                   salir = true;
           
           
           }
        }

    }

    public static void mostrarMenu() {
        System.out.println("MENU DE OPCIONES");
        System.out.println("1. Añadir una tarea");
        System.out.println("2. Marcar como completada una tarea");
        System.out.println("3. Listar tareas");
        System.out.println("4. Comprobar estado de una tarea");
        System.out.println("5. Eliminar una tarea");
        System.out.println("0. Salir");
        System.out.print("Introduce a continuación que quieres hacer: ");

    }
}
