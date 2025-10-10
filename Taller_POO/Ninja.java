package Taller_POO;

import java.util.Random;

public class Ninja extends Personaje {
     public Ninja(String nombre) {
        super(nombre);
    }

    // Ataque característico del Ninja, Tiene un 25% de probabilidad de causar un golpe crítico (doble daño).
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int dano = rand.nextInt(21) + 10; // daño base 10 a 30

        // 25% de probabilidad de golpe crítico (doble daño)
        if (rand.nextInt(100) < 25) {
            dano *= 2;
            System.out.println("*** GOLPE CRÍTICO de " + this.getNombre() + " ***");
        }

        oponente.recibirdano(dano);
        System.out.println(this.getNombre() + " ataca con sigilo a " + oponente.getNombre() + " causando " + dano + " puntos de daño.");
    }
}
