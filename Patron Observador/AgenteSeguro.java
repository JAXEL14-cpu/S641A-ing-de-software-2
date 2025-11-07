// Observador concreto: representa un agente que también recibe actualizaciones
public class AgenteSeguro implements Observador {

    private String idAgente;

    public AgenteSeguro(String idAgente) {
        this.idAgente = idAgente;
    }


    public void actualizar(String mensaje) {
        System.out.println("Agente " + idAgente + " fue notificado: " + mensaje);
    }
}
