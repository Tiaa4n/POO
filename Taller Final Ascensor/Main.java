import java.util.Scanner; //Clase que ejecuta el programa y contiene el menu de opciones

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ascensor ascensor = new Ascensor(10);
        int opcion = 0;

        do {
            System.out.println("\n== MENÚ DEL ASCENSOR ==");
            System.out.println("1. Ver piso actual");
            System.out.println("2. Ir a un piso");
            System.out.println("3. Abrir puerta");
            System.out.println("4. Cerrar puerta");
            System.out.println("5. Activar emergencia 🚨");
            System.out.println("6. Desactivar emergencia ✅");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(" Piso actual: " + ascensor.getPisoActual());
                    System.out.println("Dirección: " + ascensor.getDireccion());
                    if (ascensor.isEnEmergencia()) System.out.println(" Estado: EMERGENCIA ACTIVA");
                    break;

                case 2:
                    System.out.print("¿A qué piso deseas ir? (1-10): ");
                    int pisoDestino = sc.nextInt();
                    ascensor.moverA(pisoDestino);
                    break;

                case 3:
                    ascensor.abrirPuerta();
                    break;

                case 4:
                    ascensor.cerrarPuerta();
                    break;

                case 5:
                    ascensor.activarEmergencia();
                    break;

                case 6:
                    ascensor.desactivarEmergencia();
                    break;

                case 7:
                    System.out.println(" Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 7);

        sc.close();
    }
}