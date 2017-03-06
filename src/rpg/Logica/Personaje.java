/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Logica;

import java.awt.Image;
import javax.swing.ImageIcon;




/**
 *
 * @author estudiantes
 */
public abstract class Personaje implements Dibujable {
    
    
    protected Poderes poder;
    protected Arma arma;
    protected Escudo escudo;
    protected Image imagen;
    
    public Poderes getPoder() {
        return poder;
    }

    public void setPoder(Poderes poder) {
        this.poder = poder;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Escudo getEscudo() {
        return escudo;
    }

    public void setEscudo(Escudo escudo) {
        this.escudo = escudo;
    }
}
