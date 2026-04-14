import java.util.Scanner;

public class Calculadora {
    // Método para sumar dos números
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Método para restar dos números
    public static double restar(double a, double b) {
        return a - b;
    }

    public static double dividir(double dividendo, double divisor) {
        if (divisor == 0) {
            System.out.println("Error: No se puede dividir entre 0");
            return 0;
        }
        return dividendo / divisor;
    }

    public static double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Bienvenido a la Calculadora ===");

        // Interacción del usuario para operaciones
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n¿Qué operación deseas realizar?");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción (1-5): ");

            String opcion = scanner.nextLine();

            if (opcion.equals("5")) {
                System.out.println("¡Hasta luego!");
                continuar = false;
                break;
            }

            System.out.print("Ingresa el primer número: ");
            double num1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Ingresa el segundo número: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            switch (opcion) {
                case "1":
                    System.out.println("Resultado: " + num1 + " + " + num2 + " = " + sumar(num1, num2));
                    break;
                case "2":
                    System.out.println("Resultado: " + num1 + " - " + num2 + " = " + restar(num1, num2));
                    break;
                case "3":
                    System.out.println("Resultado: " + num1 + " * " + num2 + " = " + multiplicar(num1, num2));
                    break;
                case "4":
                    try {
                        System.out.println("Resultado: " + num1 + " / " + num2 + " = " + dividir(num1, num2));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona 1, 2, 3, 4 o 5.");
            }
        }
        scanner.close();
    }
}