/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.Logica;

import java.awt.Graphics;
import javax.swing.ImageIcon;


public class EscudoHumano extends Escudo{
    public EscudoHumano() {
        imagen = new ImageIcon(getClass().getResource("../Imagenes/EscudoHumano.png")).getImage();
    }
    
    @Override
    public void dibujar(int x, int y, Graphics g) {
       g.drawImage(imagen, x, y, null);
    }
    
}
