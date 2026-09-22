/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.gestiondetareas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author daw2
 */
public class GestorTareasTest {
    
    public GestorTareasTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        
        GestorTareas g1 = new GestorTareas();
        
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of aniadirTarea method, of class GestorTareas.
     */
    @org.junit.jupiter.api.Test
    public void testAniadirTarea() {
        Tarea t1 = new Tarea("prueba","prueba");
        
    }

    /**
     * Test of listarTareas method, of class GestorTareas.
     */
    @org.junit.jupiter.api.Test
    public void testListarTareas() {
        System.out.println("listarTareas");
        GestorTareas g = null;
        GestorTareas.listarTareas(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of marcarCompletada method, of class GestorTareas.
     */
    @org.junit.jupiter.api.Test
    public void testMarcarCompletada() {
        System.out.println("marcarCompletada");
        GestorTareas g = null;
        GestorTareas.marcarCompletada(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comprobarEstadoTarea method, of class GestorTareas.
     */
    @org.junit.jupiter.api.Test
    public void testComprobarEstadoTarea() {
        System.out.println("comprobarEstadoTarea");
        GestorTareas g = null;
        GestorTareas.comprobarEstadoTarea(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrarTarea method, of class GestorTareas.
     */
    @org.junit.jupiter.api.Test
    public void testBorrarTarea() {
        System.out.println("borrarTarea");
        GestorTareas g = null;
        GestorTareas.borrarTarea(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
