//Clase Boton del Ascensor,representan botones que permiten seleccionar pisos
public class BotonAscensor extends Boton {
    public BotonAscensor(String tipo) {
        super(tipo);
    }

    public void seleccionarPiso(int piso) {
        presionar();
        System.out.println("Seleccionando piso" + piso);
    }



    



    
}
