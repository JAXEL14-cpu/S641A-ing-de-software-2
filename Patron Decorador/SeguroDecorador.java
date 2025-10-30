


//Clase abstracta que extiende de Seguro.
// Define la estructura base de los decoradores concretos.
 
public abstract class SeguroDecorador extends Seguro {


    // Obliga a los decoradores a redefinir la descripción del seguro.

    public abstract String getDescripcion();
}
