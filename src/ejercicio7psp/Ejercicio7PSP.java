/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7psp;

/**
 *
 * @author Óscar
 */
public class Ejercicio7PSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buzon b = new Buzon();
        new Lector(b).start();
        new Escritor(b).start();

    }

}
