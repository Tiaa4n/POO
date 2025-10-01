public class PracticaCondicionales {

    public static void main(String[] args) {
        System.out.println("===== EJERCICIOS CAPITULO 4 (Sin Scanner ni switch) =====");

        ejercicio41();
        ejercicio42();
        ejercicio43();
        ejercicio44();
        ejercicio45();
        ejercicio46();
        ejercicio47();
        ejercicio48();
        ejercicio49();
        ejercicio410();
        ejercicio411();
        ejercicio412();
    }

    // 4.1 
    public static void ejercicio41() {
        System.out.println("\n--- Ejercicio 4.1 ---");

        // a)
        int angulo = 90;
        if (angulo == 90)
            System.out.println("El ángulo es un ángulo recto");
        else
            System.out.println("El ángulo no es un ángulo recto");

        // b)
        int temp = 105;
        if (temp > 100)
            System.out.println("Por encima del punto de ebullición del agua");
        else
            System.out.println("Por debajo del punto de ebullición del agua");

        // c)
        int num = -5;
        int totalPositivos = 0, totalNegativos = 0;
        if (num > 0)
            totalPositivos += num;
        else
            totalNegativos += num;
        System.out.println("Suma de positivos: " + totalPositivos);
        System.out.println("Suma de negativos: " + totalNegativos);

        // d)
        int x = 5, y = 10, z = 15;
        if (x <= y && y <= z && z < 20) {
            int p = 7;
            System.out.println("p = " + p);
        }

        // e)
        int distancia = 25;
        if (distancia > 20 && distancia < 35) {
            int tiempo = 15;
            System.out.println("Tiempo = " + tiempo);
        }
    }

    // 4.2 
    public static void ejercicio42() {
        System.out.println("\n--- Ejercicio 4.2 ---");
        int a = 7;
        int b = 12;

        if (a > b)
            System.out.println("El primer número es el mayor");
        else if (a < b)
            System.out.println("El primer número es el más pequeño");
        else
            System.out.println("Ambos números son iguales");
    }

    // 4.3 
    public static void ejercicio43() {
        System.out.println("\n--- Ejercicio 4.3 ---");
        int a = 8, b = 3, c = 5;
        int central;

        if ((a > b && a < c) || (a > c && a < b)) central = a;
        else if ((b > a && b < c) || (b > c && b < a)) central = b;
        else central = c;

        System.out.println("El número central es: " + central);
    }

    // 4.4 
    public static void ejercicio44() {
        System.out.println("\n--- Ejercicio 4.4 ---");
        double num = 25;
        double raiz = Math.sqrt(num);
        System.out.println("La raíz cuadrada es: " + raiz);
    }

    //4.5 
    public static void ejercicio45() {
        System.out.println("\n--- Ejercicio 4.5 ---");
        int n = 12;
        if (n % 2 == 0)
            System.out.println(n + " es par");
        else
            System.out.println(n + " es impar");
    }

    //4.6 
    public static void ejercicio46() {
        System.out.println("\n--- Ejercicio 4.6 ---");
        int dias = 10;
        int km = 1000;

        double precio = km * 2.5;
        if (dias > 7 && km > 800) precio *= 0.7;

        System.out.println("Precio del billete: " + precio);
    }

    // 4.7
    public static void ejercicio47() {
        System.out.println("\n--- Ejercicio 4.7 ---");
        int d = 28, m = 2, a = 2024; // Año bisiesto

        d++;
        int[] diasMes = {
            31, (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0) ? 29 : 28,
            31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

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

    // 4.8 
    public static void ejercicio48() {
        System.out.println("\n--- Ejercicio 4.8 ---");
        int[] pesos = {35, 42, 48, 53, 59, 62};

        int menos40 = 0, entre40y50 = 0, entre50y60 = 0, masIgual60 = 0;

        for (int peso : pesos) {
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

    // 4.9 
    public static void ejercicio49() {
        System.out.println("\n--- Ejercicio 4.9 ---");
        int a = 10, b = 5;
        if (a % b == 0 || b % a == 0)
            System.out.println("Uno es divisor del otro");
        else
            System.out.println("Ninguno es divisor del otro");
    }

    // 4.10 
    public static void ejercicio410() {
        System.out.println("\n--- Ejercicio 4.10 ---");
        int angulo = 120;
        if (angulo < 90)
            System.out.println("Ángulo agudo");
        else if (angulo == 90)
            System.out.println("Ángulo recto");
        else if (angulo < 180)
            System.out.println("Ángulo obtuso");
        else
            System.out.println("Ángulo no clasificado");
    }

    // 4.11 
    public static void ejercicio411() {
        System.out.println("\n--- Ejercicio 4.11 ---");
        int nota = 85;
        char letra;
        if (nota >= 90) letra = 'A';
        else if (nota >= 80) letra = 'B';
        else if (nota >= 70) letra = 'C';
        else if (nota >= 60) letra = 'D';
        else letra = 'F';
        System.out.println("Calificación en letra: " + letra);
    }

    // 4.12 
    public static void ejercicio412() {
        System.out.println("\n--- Ejercicio 4.12 ---");
        double a = 10;
        double b = 5;
        int op = 4; // 1=Suma, 2=Resta, 3=Mult, 4=División
        double r;

        if (op == 1) {
            r = a + b;
            System.out.println("Resultado: " + r);
        } else if (op == 2) {
            r = a - b;
            System.out.println("Resultado: " + r);
        } else if (op == 3) {
            r = a * b;
            System.out.println("Resultado: " + r);
        } else if (op == 4) {
            if (b != 0) {
                r = a / b;
                System.out.println("Resultado: " + r);
            } else {
                System.out.println("Error: División por cero");
            }
        } else {
            System.out.println("Operación no válida");
        }
    }
}
