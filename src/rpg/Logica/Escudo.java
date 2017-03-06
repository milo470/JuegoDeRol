/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Logica;
import java.awt.Image;
/**
 *
 * @author Camilo
 */
public abstract class Escudo implements Dibujable {
    protected int proteccion;
    protected Image imagen;
    
    public int getProteccion() {
        return proteccion;
    }

    public void setProteccion(int proteccion) {
        this.proteccion = proteccion;
    }
}
