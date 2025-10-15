public class DescuentoImpuesto {

    //Calcular el total con impuesto del 8 %
    public double calcularTotalConImpuesto(double subtotal) {
        double impuesto = subtotal * 0.08;
        return subtotal + impuesto;
    }
}
