public class Producto {
    // Atributos
    private String codigo;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    
    public Producto() {
        this.codigo = "2008";
        this.descripcion = "Produc";
        this.cantidad = 1;
        this.precioUnitario = 0.0;
    }

    
    public Producto(String codigo, String descripcion, int cantidad, double precioUnitario) {
        this.codigo = (codigo != null && !codigo.isEmpty()) ? codigo : "2008";
        this.descripcion = (descripcion != null && !descripcion.isEmpty()) ? descripcion : "Produc";
        this.cantidad = (cantidad >= 1) ? cantidad : 1;
        this.precioUnitario = (precioUnitario >= 0) ? precioUnitario : 0.0;
    }

    // Getters y Setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.isEmpty()) this.codigo = codigo;
    }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) {
        if (descripcion != null && !descripcion.isEmpty()) this.descripcion = descripcion;
    }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) {
        if (cantidad >= 1) this.cantidad = cantidad;
    }

    public double getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario >= 0) this.precioUnitario = precioUnitario;
    }

    
    public double calcularSubtotal() {
        return cantidad * precioUnitario;
    }

    
    public double aplicarDescuento(double porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 50) {
            double subtotal = calcularSubtotal();
            return subtotal - (subtotal * porcentaje / 100);
        } else {
            System.out.println("Porcentaje inválido (0-50%).");
            return calcularSubtotal();
        }
    }

    
    public void incrementarCantidad(int valor) {
        if (valor > 0) cantidad += valor;
    }

    
    @Override
    public String toString() {
        return "Producto: " + descripcion + " (" + codigo + "), Cantidad: " + cantidad + ", Precio unitario: $" + precioUnitario;
    }
}