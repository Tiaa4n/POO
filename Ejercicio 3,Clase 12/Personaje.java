public class Personaje {
    protected String nombre;
    protected int vida;

    public Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    
    public void atacar(Personaje enemigo) {
        enemigo.vida -= 5;
        System.out.println(nombre + " ataca a " + enemigo.nombre + " causando 5 de daño.");
    }

   
    public void mostrarInfo() {
        System.out.println(nombre + " tiene " + vida + " puntos de vida.");
    }
}
