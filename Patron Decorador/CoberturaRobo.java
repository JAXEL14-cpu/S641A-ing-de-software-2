// Decorador concreto que agrega la Cobertura contra Robo.

public class CoberturaRobo extends SeguroDecorador {
    private final Seguro seguro; // Componente a decorar

    public CoberturaRobo(Seguro seguro) {
        this.seguro = seguro;
    }

    public String getDescripcion() {
        return seguro.getDescripcion() + ", Cobertura contra Robo";
    }

    public double getCosto() {
        return seguro.getCosto() + 30000; // Costo adicional por la cobertura
    }
}
