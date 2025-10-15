public class ClaseProducto {
    public static void main(String[] args) {
        Producto p1 = new Producto("S13V", "Gorras", 3, 50000);

        System.out.println(p1.toString());
        System.out.println("Subtotal: $" + p1.calcularSubtotal());
        System.out.println("Total con descuento (10%): $" + p1.aplicarDescuento(10));
    }
}