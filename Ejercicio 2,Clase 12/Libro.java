public class Libro extends Producto {

    public Libro(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    
    
    public double calcularPrecioFinal() {
        return precioBase;
    }
}


