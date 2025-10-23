public class CuentaAhorros extends Cuenta {

    public CuentaAhorros(double saldo) {
        super(saldo); 
    }

    public void aplicarInteres() {
        saldo += saldo * 0.02; 
    }

    
    public void mostrarSaldo() {
        System.out.println("Cuenta de ahorros - Saldo: $" + saldo);
    }
}

