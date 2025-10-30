
// Clase concreta que representa un Seguro Premium.
// Es otro componente concreto dentro del patrón Decorador.
 
public class SeguroPremium extends Seguro {

    public SeguroPremium() {
        descripcion = "Seguro Premium";
    }


    public double getCosto() {
        return 200000; // Precio base del seguro premium
    }
}
