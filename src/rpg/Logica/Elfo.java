/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Logica;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author estudiantes
 */
public class Elfo extends Personaje {

    public Elfo() {
        imagen = new ImageIcon(getClass().getResource("../Imagenes/Elfo.png")).getImage();
        arma = new Arco();
        escudo = new EscudoElfo();
    
    }
    
    
    @Override
    public void dibujar(int x, int y, Graphics g) {
        g.drawImage(imagen, 50, 50, null);   
    }
    
}
