public class  ClaseBancaria {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria("Sebastian Ventes", "232425", 1000);
        CuentaBancaria c2 = new CuentaBancaria("Jose Torres", "1990808", 50); 

        c1.depositar(500);
        c1.retirar(200);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
