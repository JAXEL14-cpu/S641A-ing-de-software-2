import java.util.List;
import java.util.ArrayList;

// Clase concreta que implementa el Sujeto
public class SeguroNotificador implements Sujeto {

    private List<Observador> observadores;
    private String mensaje;

    public SeguroNotificador() {
        observadores = new ArrayList<>();
    }

    public void registrarObservador(Observador o) {
        observadores.add(o);
    }

    public void eliminarObservador(Observador o) {
        observadores.remove(o);
    }

    public void notificarObservadores() {
        for (Observador o : observadores) {
            o.actualizar(mensaje);
        }
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
        System.out.println("\n[Notificación del Sistema de Seguros]: " + mensaje);
        notificarObservadores();
    }
}
