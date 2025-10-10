package Taller_POO;

import java.util.Random;

public class Bestia extends Personaje {
        public Bestia(String nombre) {
        super(nombre);
    }
    
    // Ataque característico de la Bestia, causa entre 10 y 35 puntos de daño y con 20% de probabilidad se hiere a sí misma por la furia.
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int dano = rand.nextInt(26) + 10; // daño entre 10 y 35
        oponente.recibirdano(dano);
        System.out.println(this.getNombre() + " ruge y golpea brutalmente a " + oponente.getNombre() + " causando " + dano + " puntos de daño.");

        // 20% de probabilidad de autodaño por su ferocidad
        if (rand.nextInt(100) < 20) {
            int autodaño = 5;
            this.recibirdano(autodaño);
            System.out.println(this.getNombre() + " se hiere a sí misma por su furia (-" + autodaño + " HP).");
        }
    }

}
