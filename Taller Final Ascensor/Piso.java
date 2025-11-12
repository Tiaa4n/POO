public class Piso {
    private int numero;
    private BotonPiso botonSubir;
    private BotonPiso botonBajar;

    public Piso(int numero){
        this.numero = numero;
        this.botonSubir = new BotonPiso("subir");
        this.botonBajar = new BotonPiso("bajar");
    }

    public int getNumero(){
        return numero;
    }

    public void presionarSubir(){
        boton.Subir.solicitarAscensor();
    }

    public void presionarBajar(){
        boton.Bajar.solicitarAscensor();
    }
    
}
