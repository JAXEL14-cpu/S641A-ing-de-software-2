
// Decorador concreto que agrega la Asistencia en Carretera.

public class AsistenciaCarretera extends SeguroDecorador {
    private final Seguro seguro;

    public AsistenciaCarretera(Seguro seguro) {
        this.seguro = seguro;
    }

    @Override
    public String getDescripcion() {
        return seguro.getDescripcion() + ", Asistencia en Carretera";
    }

    @Override
    public double getCosto() {
        return seguro.getCosto() + 15000;
    }
}
