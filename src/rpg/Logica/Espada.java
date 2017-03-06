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
public class Espada extends Arma {

   public Espada() {
        imagen = new ImageIcon(getClass().getResource("../Imagenes/Espada.png")).getImage();
    }
    
    public void dibujar(int x, int y, Graphics g) {
        g.drawImage(imagen, x, y, null);}
    

}
