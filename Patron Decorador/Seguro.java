public abstract class Seguro {
    protected String descripcion = "Seguro desconocido";

    public String getDescripcion() {
        return descripcion;
    }

    public abstract double getCosto();
}
