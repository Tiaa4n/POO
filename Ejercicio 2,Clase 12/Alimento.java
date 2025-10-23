public class Alimento extends Producto {

    public Alimento(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    
    
    public double calcularPrecioFinal() {
        return precioBase * 1.05;
    }
}
