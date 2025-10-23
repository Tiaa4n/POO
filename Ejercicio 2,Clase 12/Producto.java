public abstract class Producto {
    protected String nombre;
    protected double precioBase;

    
    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    
    public abstract double calcularPrecioFinal();

    
    public void mostrar() {
        System.out.println(nombre + " cuesta $" + calcularPrecioFinal());
    }
}
