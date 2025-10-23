public class Guerrero extends Personaje {

    public Guerrero(String nombre) {
        super(nombre, 100); //Vida Inicial De 100
    }

   
    public void atacar(Personaje enemigo) {
        enemigo.vida -= 15;
        System.out.println(nombre + " golpea con su espada a " + enemigo.nombre + " causando 15 de daño.");
    }
}
