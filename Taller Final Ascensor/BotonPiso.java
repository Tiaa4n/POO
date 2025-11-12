//Clase Boton Piso,simula un boton para subir y bajar de piso en el ascensor
public class BotonPiso extends Boton{
    public BotonPiso(String tipo){
        super(tipo);
    }

    public void solicitarAscensor(){
        presionar();
        System.out.println("Solicitud enviada desde el piso (" + tipo +")");
    }

    
}
