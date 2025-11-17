//Clase pricipal que hace todas las funciones del ascensor
public class Ascensor {
    private int pisoActual;
    private String direccion; // subiendo, bajando, detenido
    private Puerta puerta;
    private BotonAscensor[] botonesPisos;
    private BotonEmergencia botonEmergencia;
    private boolean enEmergencia;

    public Ascensor(int pisosTotales) {
        this.pisoActual = 1;
        this.direccion = "detenido";
        this.puerta = new Puerta();
        this.botonesPisos = new BotonAscensor[pisosTotales];
        for (int i = 0; i < pisosTotales; i++) {
            botonesPisos[i] = new BotonAscensor("piso " + (i + 1));
        }
        this.botonEmergencia = new BotonEmergencia();
        this.enEmergencia = false;
    }

    public void moverA(int pisoDestino) {
        if (enEmergencia) {
            System.out.println(" Ascensor detenido por emergencia.");
            return;
        }

        if (pisoDestino < 1 || pisoDestino > botonesPisos.length) {
            System.out.println(" Piso no válido.");
            return;
        }

        if (pisoDestino == pisoActual) {
            System.out.println("Ya estás en el piso " + pisoActual);
            return;
        }

        if (pisoDestino > pisoActual) {
            direccion = "subiendo";
            System.out.println("⬆ Subiendo...");
            for (int i = pisoActual + 1; i <= pisoDestino; i++) {
                System.out.println("Pasando por piso " + i);
            }
        } else {
            direccion = "bajando";
            System.out.println("⬇ Bajando...");
            for (int i = pisoActual - 1; i >= pisoDestino; i--) {
                System.out.println("Pasando por piso " + i);
            }
        }

        pisoActual = pisoDestino;
        direccion = "detenido";
        System.out.println(" Llegaste al piso " + pisoActual);
        puerta.abrir();
    }

    public void abrirPuerta() { puerta.abrir(); }
    public void cerrarPuerta() { puerta.cerrar(); }

    public void activarEmergencia() {
        botonEmergencia.activarEmergencia();
        enEmergencia = true;
        direccion = "detenido";
        puerta.abrir();
    }

    public void desactivarEmergencia() {
        if (enEmergencia) {
            botonEmergencia.desactivarEmergencia();
            enEmergencia = false;
            puerta.cerrar();
        } else {
            System.out.println("No hay emergencia activa.");
        }
    }

    public int getPisoActual() { return pisoActual; }
    public String getDireccion() { return direccion; }
    public boolean isEnEmergencia() { return enEmergencia; }
}