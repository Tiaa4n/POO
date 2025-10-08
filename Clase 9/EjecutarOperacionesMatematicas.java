import java.util.Scanner;

public class EjecutarOperacionesMatematicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite el primer número: ");
        double a = sc.nextDouble();
        System.out.print("Digite el segundo número: ");
        double b = sc.nextDouble();

        OperacionesMatematicas objOp = new OperacionesMatematicas(a, b);
        int opcion;

        do {
            System.out.println("\n MENÚ DE OPERACIONES");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Elevar al cuadrado");
            System.out.println("6. Elevar al cubo");
            System.out.println("7. Elevar a la n");
            System.out.println("8. Raíz cuadrada");
            System.out.println("9. Raíz cúbica");
            System.out.println("10. Raíz n");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + objOp.sumar());
                    break;
                case 2:
                    System.out.println("Resultado: " + objOp.restar());
                    break;
                case 3:
                    System.out.println("Resultado: " + objOp.multiplicar());
                    break;
                case 4:
                    System.out.println("Resultado: " + objOp.dividir());
                    break;
                case 5:
                    System.out.println("Resultado: " + objOp.elevarAlCuadrado());
                    break;
                case 6:
                    System.out.println("Resultado: " + objOp.elevarAlCubo());
                    break;
                case 7:
                    System.out.print("Ingrese el exponente n: ");
                    double n = sc.nextDouble();
                    System.out.println("Resultado: " + objOp.elevarAN(n));
                    break;
                case 8:
                    System.out.println("Resultado: " + objOp.raizCuadrada());
                    break;
                case 9:
                    System.out.println("Resultado: " + objOp.raizCubica());
                    break;
                case 10:
                    System.out.print("Ingrese el índice n: ");
                    double indice = sc.nextDouble();
                    System.out.println("Resultado: " + objOp.raizN(indice));
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 0);

        sc.close();
    }
}