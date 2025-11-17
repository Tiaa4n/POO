//Clase Boton del Ascensor,simula un boton del ascensor para selecionar el piso
public class BotonAscensor extends Boton {
    public BotonAscensor(String tipo) {
        super(tipo);
    }

    public void seleccionarPiso(int piso) {
        presionar();
        System.out.println("Seleccionando piso" + piso);
    }



    



    
}
