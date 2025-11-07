
// Interfaz Sujeto: define los métodos que deben implementar los observables
public interface Sujeto {
    void registrarObservador(Observador o);
    void eliminarObservador(Observador o);
    void notificarObservadores();
}
