

//Decorador concreto que agrega cobertura por Desastres Naturales.

public class CoberturaDesastres extends SeguroDecorador {
    private final Seguro seguro;

    public CoberturaDesastres(Seguro seguro) {
        this.seguro = seguro;
    }

    @Override
    public String getDescripcion() {
        return seguro.getDescripcion() + ", Desastres Naturales";
    }

    @Override
    public double getCosto() {
        return seguro.getCosto() + 35000;
    }
}
