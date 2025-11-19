//Clase puerta;hace la funcion de abrir y cerrar la puerta del elevador y controla el estado de las puertas,encapsulacion
public class Puerta {
    private boolean abierta;

    public Puerta(){
        this.abierta = false;
    }

    public void abrir(){
        if (abierta){
            abierta = true;
            System.out.println("Puerta abierta");
        } else {
            System.out.println("La puerta ya esta abierta");

        }

    }
    
    public void cerrar(){
        if (abierta){
            abierta = false;
            System.out.println("Puerta cerrada");
        }else{
            System.out.println("La puerta ya esta cerrada");

        }
    }

    public boolean isAbierta(){
        return abierta;
    }
}
