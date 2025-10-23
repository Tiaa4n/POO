public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(double saldo) {
        super(saldo);
    }

    
    public void retirar(double monto) {
        
        if (saldo - monto >= -200) {
            saldo -= monto;
        } else {
            System.out.println("Error: Sobregiro no permitido (límite -200).");
        }
    }

    
    public void mostrarSaldo() {
        System.out.println("Cuenta corriente - Saldo: $" + saldo);
    }
}
