import java.util.Scanner;

public class PracticaCondicionales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== EJERCICIOS CAPITULO 4 =====");

        ejercicio41(sc);
        ejercicio42(sc);
        ejercicio43(sc);
        ejercicio44(sc);
        ejercicio45();
        ejercicio46(sc);
        ejercicio47(sc);
        ejercicio48(sc);
        ejercicio49(sc);
        ejercicio410(sc);
        ejercicio411(sc);
        ejercicio412(sc);

        sc.close();
    }

    // 4.1 Condicionales simples
    public static void ejercicio41(Scanner sc) {
        System.out.println("\n--- Ejercicio 4.1 ---");

        // a)
        System.out.print("Ingrese un ángulo en grados: ");
        int angulo = sc.nextInt();
        if (angulo == 90)
            System.out.println("El ángulo es un ángulo recto");
        else
            System.out.println("El ángulo no es un ángulo recto");

        // b)
        System.out.print("Ingrese la temperatura en °C: ");
        int temp = sc.nextInt();
        if (temp > 100)
            System.out.println("Por encima del punto de ebullición del agua");
        else
            System.out.println("Por debajo del punto de ebullición del agua");

        // c)
        System.out.print("Ingrese un número entero: ");
        int num = sc.nextInt();
        int totalPositivos = 0, totalNegativos = 0;
        if (num > 0)
            totalPositivos += num;
        else
            totalNegativos += num;
        System.out.println("Suma de positivos: " + totalPositivos);
        System.out.println("Suma de negativos: " + totalNegativos);

        // d)
        System.out.print("Ingrese valores de x, y, z: ");
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        if (x <= y && y <= z && z < 20) {
            System.out.print("Ingrese valor de p: ");
            int p = sc.nextInt();
            System.out.println("p = " + p);
        }

        // e)
        System.out.print("Ingrese distancia: ");
        int distancia = sc.nextInt();
        if (distancia > 20 && distancia < 35) {
            System.out.print("Ingrese tiempo: ");
            int tiempo = sc.nextInt();
            System.out.println("Tiempo = " + tiempo);
        }
    }

    // 4.2 Comparación de dos números
    public static void ejercicio42(Scanner sc) {
        System.out.println("\n--- Ejercicio 4.2 ---");
        System.out.print("Ingrese primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese segundo número: ");
        int b = sc.nextInt();

        if (a > b)
            System.out.println("El primer número es el mayor");
        else if (a < b)
            System.out.println("El primer número es el más pequeño");
        else
            System.out.println("Ambos números son iguales");
    }

    // 4.3 Número central
    public static void ejercicio43(Scanner sc) {
        System.out.println("\n--- Ejercicio 4.3 ---");
        System.out.print("Ingrese tres números: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int central;

        if ((a > b && a < c) || (a > c && a < b)) central = a;
        else if ((b > a && b < c) || (b > c && b < a)) central = b;
        else central = c;

        System.out.println("El número central es: " + central);
    }

    // 4.4 Raíz cuadrada
    public static void ejercicio44(Scanner sc) {
        System.out.println("\n--- Ejercicio 4.4 ---");
        System.out.print("Ingrese un número: ");
        double num = sc.nextDouble();
        double raiz = Math.sqrt(num);
        System.out.println("La raíz cuadrada es: " + raiz);
    }

    // 4.5 Número par
    public static void ejercicio45() {
        System.out.println("\n--- Ejercicio 4.5 ---");
        int n = 12; // ejemplo fijo
        if (n % 2 == 0)
            System.out.println(n + " es par");
        else
            System.out.println(n + " es impar");
    }

    // 4.6 Precio de billete tren
    public static void ejercicio46(Scanner sc) {
        System.out.println("\n--- Ejercicio 4.6 ---");
        System.out.print("Ingrese días de estancia: ");
        int dias = sc.nextInt();
        System.out.print("Ingrese distancia en km: ");
        int km = sc.nextInt();

        double precio = km * 2.5;
        if (dias > 7 && km > 800) precio *= 0.7;

        System.out.println("Precio del billete: " + precio);
    }

    // 4.7 Fecha siguiente
    public static void ejercicio47(Scanner sc) {
        System.out.println("\n--- Ejercicio 4.7 ---");
        System.out.print("Ingrese día, mes y año: ");
        int d = sc.nextInt(), m = sc.nextInt(), a = sc.nextInt();

        d++;
        int[] diasMes = {31, (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0) ? 29 : 28,
                31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (d > diasMes[m - 1]) {
            d = 1;
            m++;
            if (m > 12) {
                m = 1;
                a++;
            }
        }
        System.out.println("Día siguiente: " + d + "/" + m + "/" + a);
    }

    // 4.8 Estadística de pesos
    public static void ejercicio48(Scanner sc) {
        System.out.println("\n--- Ejercicio 4.8 ---");
        System.out.print("Ingrese cantidad de alumnos: ");
        int n = sc.nextInt();
        int menos40 = 0, entre40y50 = 0, entre50y60 = 0, masIgual60 = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Peso alumno " + i + ": ");
            int peso = sc.nextInt();
            if (peso < 40) menos40++;
            else if (peso <= 50) entre40y50++;
            else if (peso < 60) entre50y60++;
            else masIgual60++;
        }

        System.out.println("Menos de 40kg: " + menos40);
        System.out.println("Entre 40 y 50kg: " + entre40y50);
        System.out.println("Más de 50 y menos de 60kg: " + entre50y60);
        System.out.println("60kg o más: " + masIgual60);
    }

    // 4.9 Comprobar divisor
    public static void ejercicio49(Scanner sc) {
        System.out.println("\n--- Ejercicio 4.9 ---");
        System.out.print("Ingrese dos números: ");
        int a = sc.nextInt(), b = sc.nextInt();
        if (a % b == 0 || b % a == 0)
            System.out.println("Uno es divisor del otro");
        else
            System.out.println("Ninguno es divisor del otro");
    }

    // 4.10 Tipo de ángulo
    public static void ejercicio410(Scanner sc) {
        System.out.println("\n--- Ejercicio 4.10 ---");
        System.out.print("Ingrese ángulo en grados: ");
        int angulo = sc.nextInt();
        if (angulo < 90)
            System.out.println("Ángulo agudo");
        else if (angulo == 90)
            System.out.println("Ángulo recto");
        else if (angulo < 180)
            System.out.println("Ángulo obtuso");
        else
            System.out.println("Ángulo no clasificado");
    }

    // 4.11 Nota americana
    public static void ejercicio411(Scanner sc) {
        System.out.println("\n--- Ejercicio 4.11 ---");
        System.out.print("Ingrese calificación (0-100): ");
        int nota = sc.nextInt();
        char letra;
        if (nota >= 90) letra = 'A';
        else if (nota >= 80) letra = 'B';
        else if (nota >= 70) letra = 'C';
        else if (nota >= 60) letra = 'D';
        else letra = 'F';
        System.out.println("Calificación en letra: " + letra);
    }

    // 4.12 Calculadora
    public static void ejercicio412(Scanner sc) {
        System.out.println("\n--- Ejercicio 4.12 ---");
        System.out.print("Ingrese dos números: ");
        double a = sc.nextDouble(), b = sc.nextDouble();
        System.out.println("Seleccione operación (1=Suma, 2=Resta, 3=Multiplicación, 4=División): ");
        int op = sc.nextInt();
        double r = 0;

        switch (op) {
            case 1: r = a + b; break;
            case 2: r = a - b; break;
            case 3: r = a * b; break;
            case 4: r = (b != 0) ? a / b : Double.NaN; break;
            default: System.out.println("Operación no válida"); return;
        }
        System.out.println("Resultado: " + r);
    }
}
