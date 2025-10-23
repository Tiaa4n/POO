public class DemoProductos {
    public static void main(String[] args) {
        
        Producto p1 = new Alimento("Pan", 1000);
        Producto p2 = new Electrodomestico("Televisor", 2000);
        Producto p3 = new Libro("Java Básico", 1500);

        
        p1.mostrar();
        p2.mostrar();
        p3.mostrar();
    }
}
