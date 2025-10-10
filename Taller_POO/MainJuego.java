package Taller_POO;

import java.util.Scanner;

// Clase principal del programa, Contiene el método main y permite al usuario crear personajes y jugar.
public class MainJuego {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre del jugador 1: ");
        String nombre1 = sc.nextLine();
        System.out.print("Tipo (Personaje/Arquero/Bestia/Ninja): ");
        String tipo1 = sc.nextLine();

        System.out.print("Introduce el nombre del jugador 2: ");
        String nombre2 = sc.nextLine();
        System.out.print("Tipo (Personaje/Arquero/Bestia/Ninja): ");
        String tipo2 = sc.nextLine();

        // Crea los personajes según su tipo usando la fábrica
        Personaje j1 = PersonajeFactory.crear(tipo1, nombre1);
        Personaje j2 = PersonajeFactory.crear(tipo2, nombre2);

        JuegoLucha juego = new JuegoLucha(j1, j2);
        juego.iniciarPelea();

        sc.close();
    }
}