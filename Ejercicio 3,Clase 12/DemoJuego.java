public class DemoJuego {
    public static void main(String[] args) {
       
        Personaje guerrero = new Guerrero("Thor");
        Personaje mago = new Mago("Merlin");

        // El guerrero ataca al mago
        guerrero.atacar(mago);

        // Mostrar la vida del mago
        mago.mostrarInfo();

        // El mago prepara un hechizo 
        ((Mago) mago).hechizar();

        // El mago ataca al guerrero
        mago.atacar(guerrero);

        // Mostrar la vida del guerrero
        guerrero.mostrarInfo();
    }
}
