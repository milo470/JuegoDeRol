/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Logica;

import java.awt.Image;

/**
 *
 * @author estudiantes
 */

public abstract  class Arma implements Dibujable {
    protected int daño;
    protected Image imagen;

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }
}
