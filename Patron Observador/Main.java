// Clase principal para probar la implementación del patrón Observer
public class Main {
    public static void main(String[] args) {

        // Crear sujeto
        SeguroNotificador notificador = new SeguroNotificador();

        // Crear observadores
        Cliente cliente1 = new Cliente("Carlos Pérez");
        Cliente cliente2 = new Cliente("Laura Gómez");
        AgenteSeguro agente1 = new AgenteSeguro("AG-102");

        // Registrar observadores
        notificador.registrarObservador(cliente1);
        notificador.registrarObservador(cliente2);
        notificador.registrarObservador(agente1);

        // Notificaciones del sistema
        notificador.setMensaje("\nNueva cobertura contra desastres naturales disponible.");
        notificador.setMensaje("\nPromoción del 20% en seguros premium.");

        // Eliminar un observador
        notificador.eliminarObservador(cliente2);

        // Nueva notificación
        notificador.setMensaje("\nActualización en términos y condiciones de pólizas básicas.");
    }
}
