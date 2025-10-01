import java.util.Scanner;

public class EjecutarOperacionesMatematicas {
    public static void main(String[] args) {
        //Clase Scanner para leer datos por teclado
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite el primer numero...");
        //Con el objeto sc llamamos los metodos de la clase Scanner, por ejemplo: sc.nextInt()
        int a = sc.nextInt();
        System.out.print("Digite el segundo numero...");
        int b = sc.nextInt();

        /*
         * Para leer enteros: nextInt() o nextLong()
         * Para leer reales: nextDouble() o nextFloat
         * Para leer cadenas: next() o nextLine()
         * Para leer booleanos: nextBoolean()
         */
        
        OperacionesMatematicas objOp = new OperacionesMatematicas(a,b);

        System.out.println("El resultado de la suma es: " + objOp.sumar());
        System.out.println("El resultado de la resta es: " + objOp.restar());
        System.out.println("El resultado de la multiplicacion es: " + objOp.multiplicar());
        System.out.println("El resultado de la division es: " + objOp.dividir());
        sc.close();

        //Tarea: implementar los metodos:
        // elevar al cuadrado
        // elevar al cubo
        // elevar a la n
        // sacar la raiz cuadrada
        // sacar la raiz cubica
        // sacar la raiz n
        // Todo lo anterior con un menu de opciones

        

    }
}