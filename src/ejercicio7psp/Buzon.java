/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7psp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Óscar
 */
public class Buzon {

    private String mensaje;

    public Buzon() {
        mensaje = "";
    }

    public synchronized void leer() {
        if (mensaje == "") {
            try {
                System.out.println("Lector espera");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buzon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Lector lee: " + mensaje);
        mensaje = "";
        notify();
    }

    public synchronized void escribir(String msj) {
        if (mensaje != "") {
            try {
                System.out.println("Escritor espera");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buzon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Escritor escribe.");
        mensaje = msj;
        notify();

    }
}
