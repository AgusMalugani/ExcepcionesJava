/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception.Servicio;

/**
 *
 * @author Usuario
 */
public class ExcepcionesPropias extends Exception {

    /**
     * Creates a new instance of <code>ExcepcionesPropias</code> without detail
     * message.
     */
    public ExcepcionesPropias() {
    }

    /**
     * Constructs an instance of <code>ExcepcionesPropias</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ExcepcionesPropias(String msg) {
        super(msg);
    }
}
