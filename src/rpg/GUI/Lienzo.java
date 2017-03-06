package rpg.GUI;

import java.awt.Canvas;
import java.awt.Graphics;
import rpg.Logica.Arma;
import rpg.Logica.Escudo;

import rpg.Logica.Personaje;

public class Lienzo extends Canvas {

    Personaje personaje1;
    Arma arma1;
    Escudo escudo1;
    

    public void setPersonaje1(Personaje personaje1) {
        this.personaje1 = personaje1;
    }

    public void setArma1(Arma arma1) {
        this.arma1 = arma1;
    }

    public void setEscudo1(Escudo escudo1) {
        this.escudo1 = escudo1;
    }
    

  

    
    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        if(personaje1 != null)
            personaje1.dibujar(1, 1, g);
       if (arma1 != null)
           arma1.dibujar(300, 1, g);
       if (escudo1 != null)
           escudo1.dibujar(300, 200, g);
    }
}
