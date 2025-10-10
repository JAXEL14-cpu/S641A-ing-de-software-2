package Taller_POO;

import java.util.Random;

// Clase que representa un personaje tipo Arquero. Hereda de Personaje y redefine el ataque con un daño mayor.
public class Arquero extends Personaje {

    //Ataque especializado del Arquero. Causa un daño entre 15 y 35 puntos.
    public Arquero(String nombre) {
        super(nombre);
    }

    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int dano = rand.nextInt(21) + 15; // daño entre 15 y 35
        oponente.recibirdano(dano);
        System.out.println(this.getNombre() + " dispara una flecha precisa a " +
                oponente.getNombre() + " causando " + dano + " puntos de daño.");
    }
}
