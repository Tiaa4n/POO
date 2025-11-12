//Clase Boton, es la que representa un boton generico
public class Boton {
    private boolean presionado;
    private String tipo; //subir,bajar,piso,abrir,cerrar,emergencia

    public Boton(String tipo) {
        this.tipo=tipo;
        this.presionado=false;
    }
    
    public void presionar() {
       presionado = true;
       System.out.println("Boton" + tipo + "presionado");
    }

    public void soltar() {
        presionado = false;
    }

    public boolean isPresionado() {
        return presionado;
    }

    public String getTipo() {
        return tipo;
    }
}
