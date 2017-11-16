/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilaapp;

/**
 *
 * @author miquel
 *      Pila per a números positius.
 *      Aquesta programa és una implantació d'una pila per a números positius. 
 *      Només permet la inserció (apilar) valors superiors a 0 (no es considera el 0 com a valor positiu
 * 
 *      Cada vegada que s'afegeix un valor a la pila s'afegeix al vector num i s'incrementa la propietat lastEl 
 *          que representa el nombre d'elements de la meva pila
 * 
 */

public class Pila {
    final int MAX=100;
    private int[] num = new int[MAX];
    private int lastEl;
    public Pila() {
        lastEl = 0;
    }
    
    /**
     * 
     * @param el : element que volem afegir a la pila
     * @return 
     *      0: si l'element no s'ha pogut afegir a la pila
     *      valor superior a 0 si l'element s'ha pogut afegir
     */
    
    public int afegir(int el) {
        if (lastEl<MAX && el>0) {
            this.num[lastEl] = el;
            lastEl++;
            return el;                  
        }
        return 0;
    }
    
    public int totalElements() { return this.lastEl; }
    /**
     * Treure un element de la pila
     * @return 
     *      -1 si no hi ha cap element a la pila
     *      valor superior a 0 si hi ha elements disponibles a la pila
     */
    
    
    public int treure() {
        int n;
        if (lastEl>0) {
            lastEl--;
            n=this.num[lastEl];
            return n;
        }
        return -1;
    }
    
}