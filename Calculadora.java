public class Calculadora {
    
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
}