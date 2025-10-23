public class Mago extends Personaje {
    private boolean hechizado = false;

    public Mago(String nombre) {
        super(nombre, 80); //Vida Inicial De 80
    }

    public void hechizar() {
        hechizado = true;
        System.out.println(nombre + " prepara un hechizo poderoso...");
    }

    
    public void atacar(Personaje enemigo) {
        int dano;
        if (hechizado) {
            dano = 25;
            hechizado = false; 
        } else {
            dano = 10;
        }
        enemigo.vida -= dano;
        System.out.println(nombre + " lanza un hechizo a " + enemigo.nombre + " causando " + dano + " de daño.");
    }
}
