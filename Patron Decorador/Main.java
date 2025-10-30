 import java.util.Scanner;

//Clase principal que demuestra el uso del patrón Decorador.
//Permite al usuario seleccionar un tipo de seguro y agregar coberturas
//dinámicamente mediante un menú interactivo.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Seguro miSeguro = null;

        System.out.println("=== SISTEMA DE COTIZACIÓN DE SEGUROS ===");
        System.out.println("Seleccione el tipo de seguro:");
        System.out.println("1. Seguro Básico ($120,000)");
        System.out.println("2. Seguro Premium ($200,000)");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        // Selección del seguro base
        switch (opcion) {
            case 1:
                miSeguro = new SeguroBasico();
                break;
            case 2:
                miSeguro = new SeguroPremium();
                break;
            default:
                System.out.println("Opción inválida. Se asignará Seguro Básico por defecto.");
                miSeguro = new SeguroBasico();
                break;
        }

        int eleccion;
        do {
            System.out.println("\n--- Agregar coberturas ---");
            System.out.println("1. Cobertura contra Robo (+$30,000)");
            System.out.println("2. Daños a Terceros (+$25,000)");
            System.out.println("3. Asistencia en Carretera (+$15,000)");
            System.out.println("4. Desastres Naturales (+$35,000)");
            System.out.println("5. Finalizar cotización");
            System.out.print("Seleccione una opción: ");
            eleccion = scanner.nextInt();

            switch (eleccion) {
                case 1:
                    miSeguro = new CoberturaRobo(miSeguro);
                    break;
                case 2:
                    miSeguro = new CoberturaTerceros(miSeguro);
                    break;
                case 3:
                    miSeguro = new AsistenciaCarretera(miSeguro);
                    break;
                case 4:
                    miSeguro = new CoberturaDesastres(miSeguro);
                    break;
                case 5:
                    System.out.println("\nGenerando cotización final...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (eleccion != 5);

        // Resultado final
        System.out.println("\n=== COTIZACIÓN FINAL ===");
        System.out.println("Póliza: " + miSeguro.getDescripcion());
        System.out.println("Costo total: $" + miSeguro.getCosto());
        System.out.println("Gracias por usar nuestro sistema de seguros.");

        scanner.close();
    }
}