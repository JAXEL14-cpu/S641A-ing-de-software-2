
// Decorador concreto que agrega la Asistencia en Carretera.

public class AsistenciaCarretera extends SeguroDecorador {
    private final Seguro seguro;

    public AsistenciaCarretera(Seguro seguro) {
        this.seguro = seguro;
    }

    public String getDescripcion() {
        return seguro.getDescripcion() + ", Asistencia en Carretera";
    }

    public double getCosto() {
        return seguro.getCosto() + 15000;
    }
}
