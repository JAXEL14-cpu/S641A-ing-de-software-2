// Observador concreto: representa un cliente que recibe notificaciones
public class Cliente implements Observador {

    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public void actualizar(String mensaje) {
        System.out.println(nombre + " recibió la notificación: " + mensaje);
    }
}
