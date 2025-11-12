//Clase Boton de emergencia,simula un boton en caso de emergencia
public class BotonEmergencia extends Boton {
    public BotonEmergencia() {
        super("emergencia");
    }

    public void activarEmergencia(){
        presionar();
        System.out.println("Emergencia activada! El ascensor se detiene");
    }

    public void desactivarEmergencia(){
        soltar();
        System.out.println("Emergencia desactivada. El sistema vuelve a la normalidad.");
    }
    
}
