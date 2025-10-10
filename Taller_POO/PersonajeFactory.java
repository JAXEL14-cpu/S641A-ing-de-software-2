package Taller_POO;

// Se encarga de crear objetos del tipo de personaje solicitado.
public class PersonajeFactory {

    // Crea un objeto Personaje del tipo especificado. Si no se reconoce el tipo, crea un personaje base.
        public static Personaje crear(String tipo, String nombre) {
        if (tipo == null) tipo = "";
        switch (tipo.toLowerCase()) {
            case "arquero":
                return new Arquero(nombre);
            case "bestia":
                return new Bestia(nombre);
            case "ninja":
                return new Ninja(nombre);
            default:
                // Personaje normal por defecto
                return new Personaje(nombre);
        }
    }
}
