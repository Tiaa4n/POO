public class CuentaBancaria {
    
    private String titular;
    private String numeroCuenta;
    private double saldo;

    
    public CuentaBancaria() {
        this.titular = "titular";
        this.numeroCuenta = "0000";
        this.saldo = 0.0;
    }

    
    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        if (titular != null && !titular.isEmpty()) {
            this.titular = titular;
        } else {
            this.titular = "titular";
        }

        if (numeroCuenta != null && numeroCuenta.length() >= 6) {
            this.numeroCuenta = numeroCuenta;
        } else {
            this.numeroCuenta = "0000";
        }

        this.saldo = (saldo >= 0) ? saldo : 0.0;
    }

    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular != null && !titular.isEmpty()) {
            this.titular = titular;
        }
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        if (numeroCuenta != null && numeroCuenta.length() >= 6) {
            this.numeroCuenta = numeroCuenta;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

   
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("Monto inválido para depósito.");
        }
    }

    
    public void retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
        } else {
            System.out.println("No hay saldo suficiente o monto inválido.");
        }
    }

    
    
    public String toString() {
        return "Titular: " + titular + ", Cuenta: " + numeroCuenta + ", Saldo: $" + saldo;
    }
}
    

