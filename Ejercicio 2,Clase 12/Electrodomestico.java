public class Electrodomestico extends Producto {

    public Electrodomestico(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    
    
    public double calcularPrecioFinal() {
        return precioBase * 1.19;
    }
}
