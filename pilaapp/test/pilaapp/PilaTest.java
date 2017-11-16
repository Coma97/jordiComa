/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilaapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JordiC
 */
public class PilaTest {
    
    public PilaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of afegir method, of class Pila.
     */
        @Test //Cas que es pot afegir
        public void testAfegirOK() {
            System.out.println("afegir 1");
            int el = 1;
            Pila instance = new Pila();

            assertEquals(1, instance.afegir(el));
        }

         @Test //Cas que no es pot afegir a la pila
        public void testAfegirNumInferior0() {
            System.out.println("afegir -1:");
            int el = -1;
            Pila instance = new Pila();

            assertEquals(0, instance.afegir(el));      
        }

            @Test //Cas que no es pot afegir a la pila
        public void testAfegirNum0() {
            System.out.println("afegir 0:");
            int el = 0;
            Pila instance = new Pila();

            assertEquals(0, instance.afegir(el));      
        }
    
      @Test //Cas que  es pot afegir a la pila
        public void testAfegirNumMax() { //Provar el valor màxim
            System.out.println("afegir 2147483647:");
            int el = Integer.MAX_VALUE;
            System.out.println(el);
            Pila instance = new Pila();

            assertEquals(2147483647, instance.afegir(el));      
        }
       @Test //Cas que no es pot afegir a la pila
        public void testAfegirSuperiorNumMax() {  //Superar el valor de INT
            System.out.println("afegir 2147483647 + 1:");
            int el = Integer.MAX_VALUE+1;
            System.out.println(el);
            Pila instance = new Pila();

            assertEquals(0, instance.afegir(el));      
        }
    
    
  
    

    /**
     * Test of treure method, of class Pila.
     */
        @Test
        public void testTreure0elements() {
            System.out.println("treure d'una pila buida");
            Pila instance = new Pila();
                      
            assertEquals(-1, instance.treure());

        }
        
        @Test
        public void testTreureNelements() {
            System.out.println("treure amb la pila omplerta");
            Pila instance = new Pila();
             instance.afegir(1);
            assertEquals(1, instance.treure());

        }
    
}
