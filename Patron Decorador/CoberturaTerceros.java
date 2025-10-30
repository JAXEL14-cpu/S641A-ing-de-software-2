


//Decorador concreto que agrega la Cobertura de Daños a Terceros.

public class CoberturaTerceros extends SeguroDecorador {
    private final Seguro seguro;

    public CoberturaTerceros(Seguro seguro) {
        this.seguro = seguro;
    }

    public String getDescripcion() {
        return seguro.getDescripcion() + ", Daños a Terceros";
    }


    public double getCosto() {
        return seguro.getCosto() + 25000;
    }
}
